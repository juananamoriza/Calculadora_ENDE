package interfazCLI.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HolaMundo {
	
<<<<<<< HEAD
	/**
	*
	*Metodo principal, ejecuta el programa
	*/
=======
/**
 *No tengo muy claro como funciona
 * */
>>>>>>> 22393fe3a8800b329f4ec48616f25664cf8cb44c
	public static void main(String[] args) {
		System.out.println("Hola Mundo, soy poliglota");
		leerArchivoDeSaludos();
	}
	/**
	*metodo leerArchivoDeSaludos
	*Lee un archivo e imprime por pantalla en distintos idiomas
	*/
	private static void leerArchivoDeSaludos() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/Carpetita/Descarguitas/Flanders.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.print("Te saludo en otro idioma: ");
				System.out.print(line);
				System.out.println(" XD ");
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	
}
