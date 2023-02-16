package metodos;

import java.util.ArrayList;
import java.util.List;

public class Metodos {
	
	

	//****************************************** Test ***************************************
		public static void main(String[] args) {
			List<Integer> l = List.of(1,2,3,4,5);
			System.out.println("Las pruebas con una lista numérica se harán con: "+l);

			System.out.println("\nsuma: " + suma(l));
			System.out.println("media: " + media(l));
			System.out.println("máximo: " + maximo(l));
			System.out.println("mínimo: " + minimo(l));

			System.out.println("\na minúsculas DANIEL: " + pasaAminusculas("DANIEL"));

			System.out.println("\ndiferencias: " + diferencias(l));

			System.out.println("\nes primo 1217?: " + esPrimo(1217));

			System.out.println("\ndivisores de 30: " + divisores(30));

			System.out.println("\ncadena más larga entre [\"a\", \"aa\", \"aaa\"]: " + cadenaMasLarga(List.of("a", "aa", "aaa")));
			
			System.out.println("\nvarianza: "+varianza(l));

	}

}
