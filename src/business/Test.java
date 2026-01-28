package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	
	public int multiplicacion(int a, int b) {
		return a*b;
	}
	
//	public void fibonacci(int num) {
//		
//		int primero = 0;
//		int segundo = 1;
//		if(num==0) {
//			System.out.println("0");
//		}
//		
//		for(int i = 0; i <num; i++) {
//			
//			int siguiente = primero + segundo;
//			primero = segundo;
//			segundo = siguiente;
//			System.out.println(primero + "");
//		}
//		
//	}
	
	public int fibonacci(int num) {
		if (num == 0) {
			return 0;
		}
			
		if (num == 1) {
			return 1;
		}		
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	public String readFile(String path) {
		try {
			FileReader file = new FileReader(path);
			BufferedReader br = new BufferedReader(file);
			String numbers = "";
			String line = br.readLine();
			while (line!=null) {
				numbers += line + "\n";
				line = br.readLine();
			}
			
			br.close();
			return numbers;
		}catch (IOException e) {
			// TODO: handle exception
			System.err.println("Ha ocurrido un error al  intentar leer el archivo " + e.getMessage());
		}
		return null;
	}
	
	public void writeFile(String message, String path) {
		try {
			File f = new File(path);
			if( f.createNewFile()) {
				System.out.println("Archivo creado: " + f.getName());
			}else {
				System.out.println("El archivo ya existe en el directorio");
			}
			
			BufferedWriter w = new BufferedWriter(new FileWriter(path));
			
					w.write(message);
					w.close();
		
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Ha ocurrido un error al intentar crear o escribir el archivo " + e.getMessage());
		}
		
	}
	
}
