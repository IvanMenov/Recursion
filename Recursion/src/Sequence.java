import java.util.Scanner;

//Да се състави програма, чрез която по въведени начална и крайна
//цифра се извеждат на всеки нов ред следната последователност
//(триъгълник от знаци):
//Пример: 1, 9
//Изход:
//1
//1 2
//1 2 3
//... до
//1 2 3 4 5 6 7 8 9

public class Sequence {
	
	static void sequence(int num1, int num2, int difference){	
		if(num2>num1){
			if(difference>=0){
				for (int i = num1; i <=num2-difference ; i++) {
				System.out.print(i+" ");
				}System.out.println();
				sequence(num1, num2, difference-1);
			}
			else{
				return;
			}
		}
		else{
			if(difference>=0){
			for (int i = num1; i >=num2+difference ; i--) {
				System.out.print(i+" ");
				}System.out.println();
				sequence(num1, num2, difference-1);
			}
		}
			
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int number1=scan.nextInt();
		int number2=scan.nextInt();
		int difference= number2-number1;
		if(difference<0){
			difference*=-1;
		}
		
		sequence(number1, number2,difference);
	}
}
