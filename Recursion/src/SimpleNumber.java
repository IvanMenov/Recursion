
//Да се състави програма, която проверява дали въведено естествено
//число е просто.

public class SimpleNumber {
	
	static boolean isSimple(int number,int divisor){
		if(divisor==1){
			return true;
		}
		if(number % divisor==0){
			return false;
		}
		else{
			return isSimple(number, divisor-1);
		}
		
	}

	public static void main(String[] args) {
		int number=19;
		int divisor=number-1;
		
		boolean prime=(isSimple(number, divisor));
		if(prime){
			System.out.println("просто");
		}else{
			System.out.println("не е просто");
		}
	}

}
