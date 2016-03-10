
//Find is there a number a repeating numbers in the array.

public class RepeatingNumber {
	
	static boolean repeat(int[]array, int index, int next){
		if(index==array.length-1){
			return false;
		}
		else{
			if(next<=array.length-1){
				if(array[index]==array[next]){
					return true;
				}
				else{
					return repeat(array,index,next+1);
				}
			}else{
				
				return repeat(array,index+1,index+2);
			}
		}
	}

	public static void main(String[] args) {
		int[]array={1,2,3,0,5,6,8,4};
		System.out.println(repeat(array,0,1));

	}

}
