package classe;

import java.util.Arrays;

public class Lista {
    public static void main(String[] args) {
       int [] lista = { 4, 2, 1, 3, 5};
      
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 5 - i;
        }  
        System.out.println(Arrays.toString(lista));   
        for (int num : lista) {
            System.out.println(num);
        }
    }
}