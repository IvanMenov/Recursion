import java.util.Scanner;

//�� �� ������� ��������, ���� ����� �� ������� ���������� ����� N.
//���������� �� ������� �����, ����� ����� �� �������� � ��� �������
//�� ���������� �����.
//�� �� ������� ��������� ���� ���������� ����� � ���������.

public class Palindrom {

	static int reverseNum(int number,int reverse,int first){
		
		if(number==0){
			return reverse; 
		}
		else{
			first=number%10;
			 reverse=reverse*10+first;
			
			return reverseNum(number/10,reverse,first);
		}
	}
	
	static void symetric(int number,int reverse,int first){
		int rev = reverseNum(number, reverse,first);
		
		if(number==rev){
			System.out.println("���������");
		}else{
			System.out.println("�� � ���������");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		int reverse=0;
		int first=0;
		System.out.println(reverseNum(number, reverse,first));
		symetric(number, reverse,first);
		
	}

}
