/**
 * Soal1
 */
import java.util.Scanner;
public class Soal5 {

    public static void main(String[] args) {
        int Bilangan[] = new int[1000];
        int Tertinggi = 0;
        
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Masukkan Jumlah Bilangan = ");
        int in = input.nextInt();
        
            for(int x=1; x<=in; x++){
                System.out.println("Bilangan ke-"+x+": ");
                Bilangan[x] = input.nextInt();
            } 
        System.out.print("Deret Bilangan = ");
            for(int x = 1; x<=in; x++){
                System.out.println(Bilangan[x]+"");
            }
            for(int x = 1; x<=in; x++){
                if(Bilangan[x]>Tertinggi){
                    Tertinggi=Bilangan[x];
                }
            }
    }    
    
        System.out.println("Bilangan terbesar adalah = "+Tertinggi);
    }
}