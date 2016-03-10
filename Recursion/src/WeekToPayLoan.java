
public class WeekToPayLoan {
 
	static int getWeeksToPayLoan(float loan, int weeks, int moneyPerWeek){
		if(loan<moneyPerWeek){
			return weeks;
		}
		else{
			weeks++;
			return getWeeksToPayLoan(loan-moneyPerWeek, weeks, moneyPerWeek);
		}
		
	}
	
	public static void main(String[] args) {
		
		int loan=250;
		int moneyPerWeek=20;
		int weeks=1;
		
		weeks=getWeeksToPayLoan(loan, weeks, moneyPerWeek);
		System.out.println(weeks);
	}

}
