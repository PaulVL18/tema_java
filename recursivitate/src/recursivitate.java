
//Afiseza numerele de la 1 la 10 fara folosi vreo bucla (for / while / do while). Indiciu: recursivitate.


public class recursivitate
 {
    public static void afiseaza(int n) {
        if(n<=10) 
        	{
            System.out.println(n);
            afiseaza(n+1);
        }
    }

    public static void main(String[] args) {
        int n=1;
        afiseaza(n);
    }
}