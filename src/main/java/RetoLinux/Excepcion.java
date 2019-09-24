package RetoLinux;

public class Excepcion extends Exception{
	
	public Excepcion() {
		
	}
	
	public void ErrorEntrada() {
		throw new IllegalArgumentException("El texto de la busqueda debe ser unicamente alphanumerico, intentelo de nuevo");
	}
}