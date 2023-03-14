import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicio_2 {
	public static void main(String[] args) {
		String ruta="src\\archivos\\numeros.txt";
		String aux=sumaMultiplicacion(ruta, true);
		System.out.println(aux);
	}
	
	public static String sumaMultiplicacion(String ruta,boolean desicion) {
		String array[]= {};
		double acumulador = 0;
		String text="";
		String resultado="";
		try {
			for(String linea : Files.readAllLines(Paths.get(ruta),StandardCharsets.ISO_8859_1)) {
				//SEPARAR CON LA COMA
				array=linea.split(",");
				for(int j=0;j<array.length;j++) {
					if(desicion) {
						acumulador=acumulador+Double.parseDouble(array[j]);
						text="La suma de todos los numeros da un total de: ";
					}
					else {
						acumulador=acumulador+Double.parseDouble(array[j]);
						text="La multiplicacion de todos los numeros da un total de: ";
					}
				}
			}
			resultado=String.valueOf(acumulador);
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println("Error en el archivo");
		}
		return (text+resultado);
	}
}
