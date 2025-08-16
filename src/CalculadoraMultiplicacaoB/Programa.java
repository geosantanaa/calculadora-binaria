package CalculadoraMultiplicacaoB;

import CalculadoraSoma_SubtracaoB.Soma;

public class Programa {	
	public static void main(String[] args) {
		new Soma();
		Multiplica multiplicacao = new Multiplica();

		
		String binario1 = "00001001";
		String binario2 = "00000101";
		


		//System.out.println(mult.SomaBinaria("00010010",  "00001001"));
		System.out.println(multiplicacao.multiplica(binario1, binario2));
		
	
	}	
	
}
