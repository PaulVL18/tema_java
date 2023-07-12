import java.util.*;

public class problema4 {
    public static List<Integer> obtineValorileDistincte(List<Integer> lista) {
        Set<Integer> setDistinct = new HashSet<>(lista);

    
        List<Integer> rezultat = new ArrayList<>(setDistinct);

        return rezultat;
    }

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 1, 5, 1, 9, 9);

        List<Integer> rezultat = obtineValorileDistincte(lista);
        System.out.println("Valorile distincte: " + rezultat);
    }
}