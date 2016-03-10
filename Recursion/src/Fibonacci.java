
//Да се състави програма, която изчислява N-тото число на Фибоначи.
//Първото и второто число на Фибоначи са 1-ци, всяко следващо е равно
//на сбора на предходните 2.

public class Fibonacci {

	static int fibonaciSequence(int n){
		if(n<0){
			return 0;
		}
		if(n==1 || n==2 ){
			return 1;
		}
		else{
			return fibonaciSequence(n-1)+ fibonaciSequence(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibonaciSequence(7));

	}

}
