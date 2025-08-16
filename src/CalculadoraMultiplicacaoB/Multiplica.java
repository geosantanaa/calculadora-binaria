package CalculadoraMultiplicacaoB;
import CalculadoraSoma_SubtracaoB.Soma;

public class Multiplica {
	
	public String bin1;
	public String bin2;
	
	
    public String multiplica(String binario1, String binario2) {
		
		Soma mult = new Soma();
		
		int multiplica = Integer.parseInt(binario2, 2);

		String result = "00000000";
		
		for(int i =0; i<multiplica; i++) {
			result = mult.SomaBinaria(result, binario1);
			
		}
		
		
		
		
		return result;
	}

}
