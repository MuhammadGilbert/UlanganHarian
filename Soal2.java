/**
 * Soal2
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = 0;
            
            System.out.print("Masukkan Bilangan : ");
            a = input.nextInt();
            
            if(a % 2 == 0){
                System.out.println("Bilangan "+ a +" adalah Genap");
            }else{
                System.out.println("Bilangan "+ a +" adalah ganjil");
   }
        }
    }
}