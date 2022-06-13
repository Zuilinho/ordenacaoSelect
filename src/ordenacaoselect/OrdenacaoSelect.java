package ordenacaoselect;

/**
 *
 * @author Luiz Filho 
 */
public class OrdenacaoSelect {

	public static void main(String[] args) {
		int[] numeros  = {98, 95, 96, 99, 97};

		int[] ordenado = ordenacao(numeros);

		for (int s : ordenado) {
			System.out.println(s);
		}
	}

	private static int[] ordenacao(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int escolhida = array[i];
			int or = array[i + 1];
			int posicao = i + 1;
			for (int j = i + 2; j < array.length; j++) {
				if (array[j] < or) {
					or = array[j];
					posicao = j;
				}
			}
			if (or < escolhida) {
				array[i] = or;
				array[posicao] = escolhida;
			}
		}
		return array;
	}
}