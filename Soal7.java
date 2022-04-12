/**
 * Soal4
 */
import java.util.Scanner;
public class Soal7 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){

        int[] Bilangan = new int[1000];

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
            for(int i=0; i<Bilangan.length; i++){
                for(int j=i+1; j<Bilangan.length; j++){
                    if (Bilangan[i]==(Bilangan[j])){
                        System.out.println("Ada");
                    }else{
                        System.out.println("Tidak ada");
                    }
                }
            }
        }
    }
}