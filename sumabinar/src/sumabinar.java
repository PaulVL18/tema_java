
//Se se scrie un program care aduna doua numere exprimate in binar (exp a = 11, b = 1, a+b = 100). Rezultatul fiind de asemenea in binar.

public class sumabinar 
{
    public static String adunarebinara(String a, String b) {
        int maxLength = Math.max(a.length(), b.length()); //maxLength este lungimea max a celor doua stringuri
        a = String.format("%" + maxLength + "s", a).replace(' ', '0'); //completam cu 0 
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');

        int carry = 0;//transport
        StringBuilder result = new StringBuilder();

       
        for(int i=maxLength-1;i>=0;i--) { // parcurgem numerele de la dreapta la stanga
            int bitA =Character.getNumericValue(a.charAt(i)); //transf din caracter in int
            int bitB =Character.getNumericValue(b.charAt(i));
            int sum = bitA + bitB + carry;
            result.insert(0, sum % 2); 
            carry = sum / 2; }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String sum = adunarebinara(a, b);
        System.out.println("rezultatul este:"+sum);
    }
}
