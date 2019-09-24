package RetoLinux;

import java.util.Scanner;
import java.util.regex.Pattern;


public class EntradaEstandar {
	
	public String ComprobarEntrada(LectorEntradaEstandar lectorEntrada, Scanner reader) {
		String entrada = "";
		Excepcion excepcion = new Excepcion();
		Boolean valida = false;
		
		while(valida == false) {
			try {
				System.out.println("Introduzca el nombre del fichero que quiere buscar:");
				entrada = lectorEntrada.Lector(reader);
				valida = entrada.matches("[a-zA-Z0-9.]+");
				if(valida == true) {}
				else
					excepcion.ErrorEntrada();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				reader.nextLine();
			}
		}
		return entrada;
	}
	
}