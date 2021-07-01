
public class ConversionDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Tipos de datos Java
		 
		 * Numericos: byte, short, int, log, float(numeros decimales), double
		 * Booleanos: (verdadero, falso) : boolean
		 * Caracteres: char
		 * Cadenas: String 
		 */
		// byte 8 bits, short 16 bits, int 32 bits, long 64 bits
		byte numeropequeño = 122; // byte almacena de -128 a 127
		byte otronumeropequeño = 122;
		// si declaramos Int podemos declarar "suma" como valor de almacenamiento para la suma de 122 + 122 = 244 
		int suma = numeropequeño + otronumeropequeño; // int almacena de -231 a 231	
		
		int numero1 = 1000;
		long numero2 = (int) numero1;
		float numero3 = numero2;
		
				System.out.println(numero1);
				System.out.println(numero2);
				System.out.println(numero3);

	}

}
