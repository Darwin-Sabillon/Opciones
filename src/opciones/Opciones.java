package opciones;

import java.util.Scanner;

public class Opciones {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingrese una letra vocal: ");
        letra = r.next().charAt(0);
        
        switch (letra) {
            case 'a': case 'A':
                System.out.println("Aeroplano");
                System.out.println("Alas");
                System.out.println("Alma");
                break;
            case 'e': case 'E':
                System.out.println("Estudinte");
                System.out.println("Epifania");
                System.out.println("Elocuente");
                break;
            case 'i': case 'I':
                System.out.println("Instituto");
                System.out.println("Iguana");
                System.out.println("Isla");
                break;
            case 'o': case 'O':
                System.out.println("Olmo");
                System.out.println("Ojo");
                System.out.println("Oligarca");
                break;
            case 'u': case 'U':
                System.out.println("Unicornio");
                System.out.println("Universo");
                System.out.println("Uva");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal.\n");
        }
        
    }
}
