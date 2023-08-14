package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.CambioCalc;

//Desenvolvedor: João Wellington Nunes da Rocha.
//Github: https://github.com/wellzfps/CasaDeCambio

public class CambioExec {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// Criando um Objeto scanner para ler as entradas.
		Scanner sc = new Scanner(System.in);
		
		// Instanciando uma classe e criando um objeto casaDeCambio.
		CambioCalc casaDeCambio = new CambioCalc();
		
		// Pedindo ao usuario qual moeda ele quer comprar, ou sair do programa.
		System.out.println("Informe uma moeda que deseja comprar: ");
		System.out.println("Dolar: 1, Euro: 2, CnYuan: 3, Sair do programa: 4");
		
		// armazenando o que o usuario digitou na variavel inteira qualMoeda.
		int qualMoeda = sc.nextInt();
		
		// Criando uma condição logica IF, para caso a variavel que receber a entrada do usuario seja diferente de 4, o if seja executado.
		if(qualMoeda != 4) {
			System.out.println("Digite a quantidade que deseja comprar!!: ");
			casaDeCambio.quantidade = sc.nextDouble();
			casaDeCambio.buyCoin(qualMoeda);
		}
	
		System.out.println("Obrigado, Programa finalizado.");
		sc.close();
		
	}

}
