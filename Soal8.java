/**
 * Soal8
 */
import java.util.Scanner;
public class Soal8 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

            int Bilangan[] = new int[1000];
            System.out.print("Masukkan Jumlah Buah = ");
        String B = input.nextLine();
        
            for(int x=1; x<=B; x++){
                System.out.println("Nama Buah ke-"+x+": ");
                Bilangan[x] = input.nextInt();
            } 
        System.out.print("Jenis Buah = ");
            for(int x = 1; x<=B; x++){
                System.out.println(Bilangan[x]+"");
            }
            System.out.print("Masukkan Jumlah Total Buah = ");
            int J = input.nextInt();
        
            for(int x=1; x<=J; x++){
                System.out.println("Jumlah Buah ke-"+x+": ");
                Bilangan[x] = input.nextInt();
            } 
        System.out.print("Total Bilangan = ");
            for(int x = 1; x<=J; x++){
                System.out.println(Bilangan[x]+"");
            }
        }
    }
}