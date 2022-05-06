package week1.day4;

public class SunOfDigits {

	public static void main(String[] args) {

		
		
		int number=18810;
		
		int sum = 0;

		
		while (number>0) {
			
			int reminder = number%10;
			
			sum=sum+reminder;
			
			number=number/10;
			
		}
		System.out.println(sum);
	}

}
