 /*Scrieti un program care simuleaza aruncarea unei perechi de zaruri.
  * Puteti simula aruncarea unui zar alegand in mod aleatoriu cate un numar intreg dintre 1, 2, 3, 4, 5 si 6.
  * Numarul ales reprezinta valoarea de pe un zar dupa aruncare. 
  *
Hint: (int)(Math.random()*6) + 1 
Exemplu iesire: 
  Primul zar are valoarea 3 
  Al doilea zar are valoarea 5
  Valoarea totala este 8

  
  */
import java.util.Random;
import java.io.*;
class Zaruri{ 
 public static void main(String args[]) { 
 	 
 	 
 	  int zar[]=new int[2];
 	  
 	   	  for(int i=0;i<2;i++)
 	   		{  zar[i]=(int)(Math.random()*6) + 1;
 	   		 }
 	   		 System.out.println(zar[0]); //nr de pe primul zar
 	   		 System.out.println(zar[1]);//nr de pe zarul 2
 	   	int	 suma=zar[0]+zar[1]; 
 	   		 System.out.println(suma);//suma
 	   	}}
 	   		 
