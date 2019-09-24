package RetoLinux;

import java.util.Scanner;

public class Menu {
	
	public int Menu(Scanner reader) {
		
		int option;
		String entrada;
		LectorArchivos lectorArchivos = new LectorArchivos();
		
		// muestra el menu de opciones
	    System.out.println("SELECCIONA UNA OPCI�N");
	    System.out.println("1 - Leer desde entrada estandar");
	    System.out.println("2 - Leer archivo TXT");
	    System.out.println("3 - Leer archivo CSV");
	    System.out.println("4 - Leer archivo XML");
	    System.out.println();
	    
	    // recoge la opcion seleccionada
	    option = reader.nextInt();

	    // Switch construct
	    switch (option) {
	    case 1:
	    	LectorEntradaEstandar lector = new LectorEntradaEstandar();
			EntradaEstandar entradaEstandar = new EntradaEstandar();
			entrada = entradaEstandar.ComprobarEntrada(lector, reader);
			System.out.println(entrada);
	      break;
	    case 2:
	    	System.out.println(lectorArchivos.leerArchivoTXT("archivoPrueba.txt"));
	      break;
	    case 3:
	    	System.out.println(lectorArchivos.leerArchivoCSV("films_score.csv"));
	      break;
	    case 4:
	    	System.out.println(lectorArchivos.leerArchivoXML("books.xml"));
	      break;
	    default:
	    	System.out.println("Selecci�n invalida");
	    }
		return 0;
	}
}