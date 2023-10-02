package br.com.ebac;

public class Casting {

	public static void main(String[] args) {
		
		//casting explicito
		long numl = 1111111111111111111l;
		System.out.println(numl);
		int numI = (int) numl;
		System.out.println(numI);
		
		//boolean e char nao pode usar o casting
		
		//casting implicito
		
		int numero1 = 10;
		long numero2 = numero1; // porque o long cabe mais que o int entao da certo
		
		int number = 10;
		System.out.println(number);
		Integer number2 = number;
		System.out.println(number2);

	}

}
