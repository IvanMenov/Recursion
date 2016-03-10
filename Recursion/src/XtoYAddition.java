import java.util.Scanner;

public class XtoYAddition {
	
	static int XtoYAddition(int x, int y, int a){
		
		if(a==1){
			return (int)Math.pow(x, y-1);
		}else{
			return (int)Math.pow(x, y-1)+XtoYAddition(x, y,a-1);
		}
	}
	 	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a number between 1 and 70: ");
		int number= scan.nextInt();
		int numberUsed=number;
		System.out.print("Enter the power between 1 and 70: ");
		int power= scan.nextInt();
		
		if((power<1 || power>70) || (number<1 || number>70)){
			return;
		}
		int result= XtoYAddition(number, power, numberUsed);
		System.out.println(number+ " to the power of "+ power+ " = "+ result);
	}

}
