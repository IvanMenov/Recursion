
public class SmallestInArray {
	
// find the smallest element in an array 
	
	
	static int smallest(int[]array, int index){
		if(index==array.length-1){
			return index;
		}
		else{
			int smallest=smallest(array,index+1);
			if(array[index]<array[smallest]){
				return index;
			}
			else{
				return smallest;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[]array= {5,6,5,0,3,4};
		
		int smallestElement=array[smallest(array,0)];
		System.out.println(smallestElement);
	}

}
