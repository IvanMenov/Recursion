

public class Monotono {
	
//	 �� �� ������� ��������, ����� �� ������� ����� � ���������� �����
//	 ��������� ���� ���� ����� � ��������� ���������. ���������
//	 ��������� ����� � �����, ��� ����� ����� ������� ������� � ��-�����
//	 �� ���������. ����������� ��������.

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
