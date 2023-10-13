import javax.swing.JOptionPane;
// Ax + B = 0;
public class Assign2_6 {
    public static void main(String[] args){
        String strA, strB;

        strA = JOptionPane.showInputDialog(null, "Please input A: ", "Input A", JOptionPane.INFORMATION_MESSAGE);
        double numA = Double.parseDouble(strA);
        
        strB = JOptionPane.showInputDialog(null, "Please input B: ", "Input B", JOptionPane.INFORMATION_MESSAGE);
        double numB = Double.parseDouble(strB);

        if (numA != 0 && numB != 0){
            JOptionPane.showMessageDialog(null, -numB / numA, "Answer is: ", JOptionPane.INFORMATION_MESSAGE);
        } else if (numA == 0 && numB != 0) {
            JOptionPane.showMessageDialog(null, "Vo nghiem", "Answer is: ", JOptionPane.INFORMATION_MESSAGE);
        } else if (numA != 0 && numB == 0) {
            JOptionPane.showMessageDialog(null, "0", "Answer is: ", JOptionPane.INFORMATION_MESSAGE);
        } else if (numA == 0 && numB == 0) {
            JOptionPane.showMessageDialog(null, "Vo so nghiem", "Answer is: ", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.exit(0);
    }
}
