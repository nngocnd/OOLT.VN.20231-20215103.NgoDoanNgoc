
import java.util.Scanner;
import java.util.Arrays;

public class Assign8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             
        System.out.println("Nhap so phan tu: ");
        int n = input.nextInt();
        
        int [] arr = new int [n];
        
        for (int i = 0; i < n; i++) {
        	arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        show(arr);
        input.close();
    }
    
    public static void show(int [] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    }
    
}

