
import javax.swing.JOptionPane;

public class Assign2_5 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Pls input num1: ", "Input the first num1", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        
        strNum2 = JOptionPane.showInputDialog(null, "Pls input num2", "Input the num2", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, num1 + num2, "sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 - num2, "difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 * num2, "product", JOptionPane.INFORMATION_MESSAGE);
        if (num2 != 0) {
            JOptionPane.showMessageDialog(null, num1 / num2, "quotient", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(null, "Can not divide because num2 == 0", "Cannot divide", JOptionPane.ERROR_MESSAGE);
    }
}
