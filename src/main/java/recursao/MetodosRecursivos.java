package recursao;

public class MetodosRecursivos {

	

	public int calcularSomaArray(int[] array){
		int result = 0;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR A SOMA
		// DOS EMENTOS DE UM ARRAY
		return result;
	}

	
	public static void calcularFatorial(int n) {
		if (n == 0) {
			System.out.println(n + "! = " + calculaFatorialRecursivo(n));
		} else {
			calcularFatorial(n-1);
			System.out.println(n + "! = " + n * calculaFatorialRecursivo(n-1));
		}
	}
	public static long calculaFatorialRecursivo(int n) {
		long fat;
		if (n == 0) {
			fat = 1;
		} else
			fat = n * calculaFatorialRecursivo(n-1);
		return fat;
	}

	public static void main(String[] args) {
		calculaFibonacci(12);
	}
	
	public static void calculaFibonacci(int n) {
		if (n == 1) {
			System.out.print(calcularFibonacciRecursivo(n) + " ");
		} else {
			calculaFibonacci(n-1);
			System.out.print(calcularFibonacciRecursivo(n) + " ");
		}
	}

	public static int calcularFibonacciRecursivo(int n) {
		int result = 1;
		if (n == 2) {
			result = 1;
		} else if (n == 1) {
			result = 1;
		} else {
			result = calcularFibonacciRecursivo(n-1) + calcularFibonacciRecursivo(n - 2);
		}
		return result;
	}

	public int countNotNull(Object[] array) {
		int result = 0;
		// TODO IMPLEMENTE AQUI O CODIGO QUE CONTA (USANDO RECURSAO) A
		// QUANTIDADE DE ELEMENTOS NAO NULOS
		// DE UM ARRAY DE OBJETOS RECEBIDO COMO PARAMETRO
		return result;
	}

	public long potenciaDe2(int expoente) {
		int result = 1;
		// TODO IMPLEMENTE (USANDO RECURSAO) O CODIGO PARA PRODUZIR A N-ESIMA
		// POTENCIA
		// DE 2
		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = 0;
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO ARITMETICA, DADO O TERMO INICIAL E A RAZAO
		// VOCE NAO PODE USAR A FORMULA QUE CALCULA O N-ESIMO TERMO. DEVE USAR RECURSAO
		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = 1;
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO GEOMETRICA, DADO O TERMO INICIAL E A RAZAO
		// VOCE NAO PODE USAR A FORMULA QUE CALCULA O N-ESIMO TERMO. DEVE USAR RECURSAO
		return result;
	}
	
	
}
