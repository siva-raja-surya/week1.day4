package week1.day4;

public class Armstrong {

	public static void main(String[] args) {

		
		int calculated , remainder, original = 407;
		
		calculated=original;
		int sum = 0;
		
		while (original>0) {
			 
			remainder=original%10;
			
			sum = sum + (remainder*remainder*remainder);
			
			original=original/10;
			
			
			
		}
		if (sum==calculated) {
			
			System.out.println(calculated + " is a armstrong number");
			
		}
		else {
			System.out.println(calculated + " not a armstrong number");
		}
		
	}

}
