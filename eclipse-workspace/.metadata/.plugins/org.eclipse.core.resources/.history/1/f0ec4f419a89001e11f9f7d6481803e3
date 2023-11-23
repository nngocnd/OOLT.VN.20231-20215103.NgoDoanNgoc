import javax.swing.JOptionPane;
// he phuong trinh bac nhat 2 an
public class Assign2_6 {
    public static void main(String[] args){
        String A, B, C;

        A = JOptionPane.showInputDialog(null, "Please input A: ", "Input A", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(A);
        
        B = JOptionPane.showInputDialog(null, "Please input B: ", "Input B", JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(B);

        C = JOptionPane.showInputDialog(null, "Please input C: ", "Input C", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(C);

        double delta = (b*b - 4 * a *c);
        
        if (delta > 0) {
            JOptionPane.showMessageDialog(null, (-b + Math.sqrt(delta)) / (2 * a), "X1: ", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, (-b - Math.sqrt(delta)) / (2 * a), "X2: ", JOptionPane.INFORMATION_MESSAGE);
        } else 
        if (delta == 0 ) {
            JOptionPane.showMessageDialog(null, -b/ (2*a), "Nghiem kep", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem", "Vo nghiem", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        System.exit(0);
    }
}
