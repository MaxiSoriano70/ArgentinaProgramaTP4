
public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="UnA chicA en el cielo vive en oceano salvaje";
		String textoCifrado=cifraODescifrar(palabra, true);
		System.out.println("Texto Cifrado: "+textoCifrado);
		String textoDescifrado=cifraODescifrar(textoCifrado, false);
		System.out.println("Texto Descifrado: "+textoDescifrado);
	}

	public static String cifraODescifrar(String palabra,Boolean desicion) {
		if(desicion) {
			String textoCifrado="";
			for(int i=0;i<palabra.length();i++) {
				char c = palabra.toLowerCase().charAt (i);
				int ascii=(int)c;
				ascii+=1;
				char caracter=(char)ascii;
				textoCifrado=textoCifrado+caracter;
			}
			return textoCifrado;
		}
		else {
			String textoDescifrado="";
			for(int i=0;i<palabra.length();i++) {
				char c = palabra.toLowerCase().charAt (i);
				int ascii=(int)c;
				ascii-=1;
				char caracter=(char)ascii;
				textoDescifrado=textoDescifrado+caracter;
			}
			return textoDescifrado;
		}
	}
}
