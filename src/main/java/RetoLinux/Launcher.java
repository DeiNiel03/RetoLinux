package RetoLinux;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Menu menu = new Menu();
		
		menu.Menu(reader);
	    reader.close();
	}
}