package TesteCalculadoraSoma;
import javax.swing.JOptionPane;

  public class Programa {
	  public static void main(String []args) {
	  
	  Soma calc = new Soma();
	  
		String num1 = JOptionPane.showInputDialog("Primeiro numero: ");
		String num2 = JOptionPane.showInputDialog("segundo numero: ");
		
		
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(calc.BinInvertido(num2) + " +");
		System.out.println("---------");
		
			
		System.out.println(calc.soma(num1, num2));
		//System.out.println(calc.BinInvertido(num2));
		//System.out.println(calc.Subtracao(num1, calc.BinInvertido(num2)));
		
	  }
  }
			
  
   

