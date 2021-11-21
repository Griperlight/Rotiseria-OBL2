package Sistema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Files {
	//leer archivos dentro de una carpeta
	public static void leerArchivos(String ruta) {
		try {
			File folder = new File(ruta);
			File[] listOfFiles = folder.listFiles();
			for (int i = 0; i < listOfFiles.length; i++) {
				System.out.println("File " + listOfFiles[i].getName());
			}
		} catch (Exception e) {
			System.out.println("Error al leer archivos");
		}
	}


	//ArrayList de Datos para cargar
	public static ArrayList<Files> DatosCSV = new ArrayList<Files>();
	//Obtener datos de un archivo csv
	public static void leerArchivo(String ruta) {
		BufferedReader Lectura = null;
		try {
			Lectura = new BufferedReader(new FileReader(ruta));
			String linea = Lectura.readLine();
			while (linea != null) {
				String[] datos = linea.split(";");
				System.out.println(Arrays.toString(datos));
				linea = Lectura.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error al leer archivo");
		}
	}
}
