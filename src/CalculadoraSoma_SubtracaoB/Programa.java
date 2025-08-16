package CalculadoraSoma_SubtracaoB;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		
		Soma calculo = new Soma();
		
		String num1 = JOptionPane.showInputDialog("Primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("segundo numero:   ");
		
		System.out.println(num1);
		System.out.println(calculo.BinInvertido(num2) + " +");
		System.out.println("---------");
	
		
	//	System.out.println(calculo.BinInvertido(num2));
	//	System.out.println(calculo.BinInvertido(num2));
	//	System.out.println(calculo.Subtracao(num1, num2, resto));
		System.out.println(calculo.SomaBinaria(num1, num2));
		
		
	}

}
