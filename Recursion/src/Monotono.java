

public class Monotono {
	
//	 Да се състави програма, която по въведен масив с естествени числа
//	 проверява дали този масив е монотонно нарастващ. Монотонно
//	 нарастващ масив е такъв, при който всеки следващ елемент е по-голям
//	 от предишния. Използвайте рекурсия.

	static boolean monotonous(int[]array, int index){
		if(index==array.length-1 ){
			return true;
		}
		else{
			if(array[index]>array[index+1]){
				return false;
			}
			else{
				return monotonous(array, index+1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[]array={0,1,5,24,34,200};
		System.out.println(monotonous(array, 0));
	}

}
