package ChallengeNumbersOrdenacao.java;

public class Ordenação {

	private static final double ChallengeNumbersClient = 0;

	public static void main(String[] args) {
		
		double[] lista = { ChallengeNumbersClient };
		
		double aux;
		
		for (double i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;
					
				}
			}
		}
		double k = 0;
		while(k < lista.length) {
			
			k++;
		System.out.println(lista);
		
		}
	}
}
