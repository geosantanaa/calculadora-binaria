package CalculadoraMultiplicacaoB;
import java.util.Scanner;

	public class MultiplicacaoTeste {

	    public static String decimalToBinary(int decimal) {
	        String binary = "";
	        while (decimal > 0) {
	            binary = (decimal % 2) + binary;
	            decimal = decimal / 2;
	        }
	        return binary;
	    }

	    public static int binaryToDecimal(String binary) {
	        int decimal = 0;
	        for (int i = 0; i < binary.length(); i++) {
	            decimal += Integer.parseInt(binary.charAt(i) + "") * Math.pow(2, binary.length() - i - 1);
	        }
	        return decimal;
	    }

	    public static String add(String a, String b) {
	        int decimalResult = binaryToDecimal(a) + binaryToDecimal(b);
	        return decimalToBinary(decimalResult);
	    }

	    public static String subtract(String a, String b) {
	        int decimalResult = binaryToDecimal(a) - binaryToDecimal(b);
	        return decimalToBinary(decimalResult);
	    }

	    public static String multiply(String a, String b) {
	        int decimalResult = binaryToDecimal(a) * binaryToDecimal(b);
	        return decimalToBinary(decimalResult);
	    }

	    public static String divide(String a, String b) {
	        int decimalResult = binaryToDecimal(a) / binaryToDecimal(b);
	        return decimalToBinary(decimalResult);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first binary number: ");
	        String a = sc.nextLine();

	        System.out.print("Enter second binary number: ");
	        String b = sc.nextLine();

	        System.out.println("Enter operation (+, -, *, /): ");
	        char operation = sc.nextLine().charAt(0);

	        String result = "";
	        switch (operation) {
	            case '+':
	                result = add(a, b);
	                break;
	            case '-':
	                result = subtract(a, b);
	                break;
	            case '*':
	                result = multiply(a, b);
	                break;
	            case '/':
	                result = divide(a, b);
	                break;
	            default:
	                System.out.println("Invalid operation");
	                break;
	        }
	        sc.close();

	        System.out.println("Result: " + result);
	    }
	}


