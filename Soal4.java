/**
 * Soal4
 */
import java.util.Scanner;
public class Soal4 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        int Bilangan[] = new int[1000];

        System.out.print("Masukkan Jumlah Bilangan = ");
        int a = input.nextInt();
        
            for(int x=1; x<=a; x++){
                System.out.println("Bilangan ke-"+x+": ");
                Bilangan[x] = input.nextInt();
            } 
        System.out.print("Deret Bilangan = ");
            for(int x = 1; x<=a; x++){
                System.out.println(Bilangan[x]+"");
            }
            System.out.print("\n Genap : ");
            for (int x = 1; x <= a; x++) {
            if (Bilangan[x] % 2 == 0) {
                System.out.print(Bilangan[x] + ", ");
 
            }
        }
        System.out.print("\n Ganjil : ");
        for (int x = 1; x <= a; x++) {
            if (Bilangan[x] % 2 != 0) {
                System.out.print(Bilangan[x] + ", ");
            }
        }
        }
    }
}