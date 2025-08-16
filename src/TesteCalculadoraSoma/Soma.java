package TesteCalculadoraSoma;

public class Soma {
	
	public String num1, num2;
		
	
	public String soma(String num1, String num2) {
		
		int iteracao =7, resto =0, resultado =0;
		int[] somar = new int[8];
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
       while(numero1 !=0 || numero2 !=0) {
    	  
			
			somar[iteracao] = (int) ((numero1 % 10 + numero2 % 10 + resto)%2); 
			resto = (int) ((numero1 % 10 + numero2 % 10 + resto)/2); 

			numero1 = numero1/10; 
			numero2 = numero2/10;
			
			iteracao--;
			
		}
		if(resto == 1) {
			somar[iteracao +1] = resto;
		}
		
			
			String result = "";
			
			for(int i =0; i<=somar.length -1; i++ ) {
				resultado = resultado + somar[i];
				
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
		String Nnegativo = soma(invertido, "00000001");
		
			
			
		
		return Nnegativo;
		

  }
	
	public String Subtracao (String num1, String num2) {
		
		int iteracao =7, resto =0;
		int[] somar = new int[8];
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		
       while(numero1 !=0 || numero2 !=0) {
    	  
			
			somar[iteracao] = (int) ((numero1 % 10 + numero2 % 10 + resto)%2); 
			resto = (int) ((numero1 % 10 + numero2 % 10 + resto)/2); 

			numero1 = numero1/10; 
			numero2 = numero2/10;
			
			iteracao--;
		
       }
			String resultado = "";
			
			for(int i =0; i<=somar.length -1; i++ ) {
				resultado = resultado + somar[i];
					
					
			

       }
		 return resultado;	
		 
	}

	

}





