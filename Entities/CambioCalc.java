package Entities;

public class CambioCalc {
		
		public static final double dolar = 4.91;
		public static final double euro = 5.38;
		public static final double CnYuan = 0.68;
		
		public double quantidade;
		
		
		public void buyCoin(int chooseCoin) {
			switch (chooseCoin) {
			case 1:
				System.out.printf("O valor a ser pago é de R$: %.2f%n", buyDolar(quantidade)); 
				break;
			
			case 2: 
				System.out.printf("O valor a ser pago é de R$: %.2f%n", buyEuro(quantidade)); 
				break;
			
			case 3: 
				System.out.printf("O valor a ser pago é de R$: %.2f%n", buyYuan(quantidade)); 
				break;
				
			default: 
				System.out.println("Informe um número válido para iniciar o programa.");
				break;
			}
		}



		public static double buyDolar(double valor) {
		return valor * dolar;
		}

		public static double buyEuro(double valor) {
		return valor * euro;
		}

		public static double buyYuan(double valor) {
		return valor * CnYuan;
		}
		

		
}