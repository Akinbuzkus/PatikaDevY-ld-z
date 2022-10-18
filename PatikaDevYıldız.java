
import java.util.Scanner;


public class PatikaDevYıldız {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num=scan.nextInt();
       // Yıldız kısmı
        for(int i=1;i<=num;i++){
            for(int k=1;k<=(num-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
               System.out.print("*");
            }
            System.out.println();
        }
        // Elmas kısmı 
        for ( int a = 1; a < num; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
                
            }
            for (int c = 1; c <= ( 2 * num - (2 * a + 1) ); c++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
            
         }
    }
}
