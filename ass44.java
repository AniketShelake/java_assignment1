//Create a Java program that converts a decimal number to its binary representation.
public class ass44{

	
	public static void main(String[] args)
	{
		int decimal = 10;
		String binary = decimalToBinary(decimal);
		System.out.println("Decimal: " + decimal);
		System.out.println("Binary: " + binary);
	}

	public static String decimalToBinary(int n)
	{
		int remainder, quotient = n;
		String binaryNum = "";
		while (quotient > 0) {
			remainder = quotient % 2;
			binaryNum
				= Integer.toString(remainder) + binaryNum;
			quotient = quotient / 2;
		}
		return binaryNum;
	}
}

