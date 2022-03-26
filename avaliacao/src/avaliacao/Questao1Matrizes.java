package avaliacao;

public class Questao1Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. A fim de praticar os conceitos aprendidos em sala de aula sobre itera�c�ao acerca de Arrays multidimensionais,
		realize a opera�c�ao de adi�c�ao entre as matrizes. Sabendo da necessidade das matrizes terem a
		mesma dimens�ao para dada opera�c�ao, implemente no algoritmo a checagem antes de efetuar a soma.*/
		int array1[][] = {{3,4},
						  {5,6}, 
						  {7,8}};
		int array2[][] = {{10,1},
						   {3,5},
						   {0,21}};
		int soma[][] = new int[3][2];
		
		System.out.println("Matriz 1");
		for(int linha = 0; linha < array1.length; linha++) {
			for(int coluna = 0; coluna < array1[0].length; coluna++) {
				System.out.print(array1[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Matriz 2");
		for(int linha = 0; linha < array2.length; linha++) {
			for(int coluna = 0; coluna < array2[0].length; coluna++) {
				System.out.print(array2[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		if(array1.length == array2.length && array1[0].length == array2[0].length) {
			System.out.println("Os Arrays tem a mesma dimens�o e poder�o ser somados:");
			System.out.println();
			System.out.println("Quantidade de linhas do array1: " + array1.length);
			System.out.println("Quantidade de colunas do array1: " + array1[0].length);
			System.out.println("Quantidade de linhas do array2: " + array2.length);
			System.out.println("Quantidade de colunas do array2: " + array2[0].length);
			System.out.println();
			for(int linha = 0; linha < array1.length; linha++) {
				for(int coluna = 0; coluna < array1[0].length; coluna++) {
					soma[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
					System.out.print(soma[linha][coluna] + " ");
				}
				System.out.println();
			}			
		}
		else {
			System.out.println("As dimens�es dos arrays s�o igual, portanto n�o poder� ser realizada soma!");
		}
	}

}
