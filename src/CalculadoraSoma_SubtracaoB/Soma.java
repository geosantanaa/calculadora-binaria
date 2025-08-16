package CalculadoraSoma_SubtracaoB;

public class Soma {
	
	public String num1;
	public String num2;
	
	
	
	public String  SomaBinaria(String num1, String num2) {
		String result = "", sobe = "", desce;
		
		
		
		for(int  i = 1; i <= num1.length(); i++ ) {
			
			if(num1.charAt(num1.length() -i)== '0') {
				if(num2.charAt(num1.length() -i)== '0') {
					if(sobe == "1") {
						desce = "1";
						sobe = "0";
					
					} else {
						sobe = "0";
						desce = "0";
					}
					result = desce + result;
					
				}else if(num2.charAt(num1.length() -i) == '1' ){
					if(sobe == "1") {
						desce = "0";
						sobe = "1";
					
					}else {
						desce = "1";
						sobe = "0";
					}
					
					result = desce + result;
					
						
				}
			}else if(num1.charAt(num1.length() -i) == '1' ){
				if(num2.charAt(num1.length() -i)== '0') {
					if(sobe == "1") {
						desce = "0";
						sobe = "1";
					
					} else {
						sobe = "0";
						desce = "1";
					}
					result = desce + result;
					
				}else if(num2.charAt(num1.length() -i) == '1' ){
					if(sobe == "1") {
						sobe = "1";
						desce = "1";
						
					}else {
						desce = "0";
						sobe = "1";
					}
					result = desce + result;

						
				}
			}

	}
				
		
		if(sobe == "1") {
			result = "1" + result;
		}
		
	
			
		return result;
							
		}	
	public String BinInvertido(String num2) {
		String invertido = "";
		int i;
		for(i =0; i<num2.length(); i++) {
				if(num2.charAt(i) == '0') {
					invertido += '1';
					
				}else {
					invertido += '0';
				}
		}
	String Nnegativo = SomaBinaria("00000001", invertido);
	
	  return Nnegativo;
		
	}
	
	
	
	public String Subtracao(String num1, String num2, String resto) {
		String resultFinal = "";
		resultFinal = SomaBinaria(num1, BinInvertido(num2));
				
		return resultFinal.substring(1);
	}
	
	
	
	
	}





