
package uslusayi;
import java.util.Scanner;
public class UsluSayi {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int n,k;
     int total = 1;
    
        System.out.println("Bir sayı giriniz : ");
        n = input.nextInt();
        
        System.out.println("üs olacak sayıyı giriniz : ");
        k = input.nextInt();
        
     for (int i = 1; i <= k; i++)
         total *= n;

        System.out.println("Sonuç (" + n + "^" + k + "): " + total);
    }
    
}
