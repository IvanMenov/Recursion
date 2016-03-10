import java.util.Scanner;


public class XtoThePowerY {

	static int xPowY(int x, int y){
		if(y==0){
			return 1;
		}
		if(y==1){
			return x;
		}
		else{
			return x*xPowY(x,y-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int x= scan.nextInt();
		int y= scan.nextInt();
		
		System.out.println(xPowY(x, y));
	}

}
