
//find the product of 2 numbers using recursion

public class Product {

	static int productOfTwo(int num1, int num2){
		if(num1==1){
			return num2;
		}
		else{
			return num2+ (productOfTwo(num1-1, num2));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(productOfTwo(8, 6));

	}

}
