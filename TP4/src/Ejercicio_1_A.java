import java.util.Arrays;

public class Ejercicio_1_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,3,1,7,6,9,5,10,9};
		ordenar(array, "x");
	}

	public static void ordenar(int[] array, String m) {
		if (m == "A" || m == "a") {
			int temporal = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 1; j < (array.length - i); j++) {
					if (array[j - 1] > array[j]) {
						temporal = array[j - 1];
						array[j - 1] = array[j];
						array[j] = temporal;
					}
				}
			}
			System.out.println(Arrays.toString(array));
		} else if (m == "B" || m == "b") {
			int temporal = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 1; j < (array.length - i); j++) {
					if (array[j - 1] < array[j]) {
						temporal = array[j - 1];
						array[j - 1] = array[j];
						array[j] = temporal;
					}
				}
			}
			System.out.println(Arrays.toString(array));
		} else {
			System.out.println("LA letra enviada no es valida");
		}
	}

}
