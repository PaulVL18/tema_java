//Scrieti un program care verifica daca doua cuvinte sunt anagrame (fiecare se poate obtine din celalalt schimband ordinea literelor). 
import java.util.Arrays;
import java.util.Scanner;
public class anagrama {
    public static void main(String[] args) {
    //vect de poz
        int f[]=new int[300];
        int g[]=new int[300];
        Scanner scanner=new Scanner(System.in);
      //citim cuvintele
        String a=scanner.next();
        String b=scanner.next();
        int i=0;
        while(i<a.length()) {
            f[(int)a.charAt(i)]++; //inseram in vect de poz
            i++;
        }
        i=0;
        while(i< b.length()) {
            g[(int) b.charAt(i)]++;
            i++;
        }
        //vom compara caracterele din ambii vectori de poz
        boolean adev = true;
        for (int j = 0; j < 300; ++j) {
            if (f[j] != g[j])   
                adev = false;
        }
        if (adev)
            System.out.println("1");
        else
            System.out.println("0");
    }
}