import javax.swing.JOptionPane;
// he phuong trinh bac nhat 2 an
public class Assign2_6 {
    public static void main(String[] args){
        String a11, a12, b1, a21, a22, b2;

        a11 = JOptionPane.showInputDialog(null, "Please input A11: ", "Input A11", JOptionPane.INFORMATION_MESSAGE);
        double A11 = Double.parseDouble(a11);
        
        a12 = JOptionPane.showInputDialog(null, "Please input A12: ", "Input A12", JOptionPane.INFORMATION_MESSAGE);
        double A12 = Double.parseDouble(a12);

        b1 = JOptionPane.showInputDialog(null, "Please input B1: ", "Input B1", JOptionPane.INFORMATION_MESSAGE);
        double B1 = Double.parseDouble(b1);

        a21 = JOptionPane.showInputDialog(null, "Please input A21: ", "Input A21", JOptionPane.INFORMATION_MESSAGE);
        double A21 = Double.parseDouble(a21);

        a22 = JOptionPane.showInputDialog(null, "Please input A22: ", "Input A22", JOptionPane.INFORMATION_MESSAGE);
        double A22 = Double.parseDouble(a22);

       

        b2 = JOptionPane.showInputDialog(null, "Please input B2: ", "Input B2", JOptionPane.INFORMATION_MESSAGE);
        double B2 = Double.parseDouble(b2);

        double D = A11 * A22 - A21 * A12;
        double D1 = B1 * A22 - B2 * A12;
        double D2 = A11 * B2 - A21 * B1;
        System.out.println(D + " amd " + D1);
        if (D == 0 ) {
            if (D1 + D2 == 0) JOptionPane.showMessageDialog(null, "He phuong trinh vo so nghiem", "Vo so nghiem", JOptionPane.INFORMATION_MESSAGE);
            else JOptionPane.showMessageDialog(null, "He vo nghiem", "Vo ngiem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, D1 / D, "X1 is: ", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, D2 / D, "X2 is: ", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        System.exit(0);
    }
}
