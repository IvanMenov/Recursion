//Write a program that finds the largest area of equal neighbour elements in a rectangular matrix and prints its size.
//matrix						result
//	1	5	2	2	2	4
//	3	3	3	2	4	4		13- 3;
//	4	3	1	2	3	3
//	4	3	1	3	3	1
//	4	3	3	3	1	1

public class LargestAreaInAMatrix {

	public static void main(String[] args) {
		int row=0;
		int col=0;
		int bestCount=0;
		int[] count={0};
		int element=0;
		int[][]matrix={{1,3,2,2,2,4},
					   {3,3,3,2,4,4},
					   {4,3,1,2,3,3},
					   {4,3,1,3,3,1},
					   {4,3,3,3,1,1}
					   };
		boolean[][]visited= new boolean[5][6];
		int counter=1;
		int maxCounter=1;
		int a=0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				element=matrix[i][j];
				largestSequence(matrix, element, i,j,visited,count);
				if(count[0]>maxCounter){
					maxCounter=count[0];
					a=matrix[i][j];
				}
				count[0]=0;
			}
		}
		System.out.print(maxCounter+" - "+a);
		
	}
	static void largestSequence(int[][]matrix,int element, int row, int col, boolean[][]visited,int[] count){
		if(row<0 || row>matrix.length-1 || col<0 || col>matrix[row].length-1 || visited[row][col]==true  ){
			return ;
			}
		if(element==matrix[row][col]){
		 count[0]++;
		 visited[row][col]=true;
		 largestSequence(matrix, element, row-1, col, visited, count);
		 largestSequence(matrix, element, row+1, col, visited, count);
		 largestSequence(matrix, element, row, col-1, visited, count);
		 largestSequence(matrix, element, row, col+1, visited, count);
		 
		}
		
	}

}
