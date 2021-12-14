package LogicalProgram;

public class PerfectNum {

	public static void main(String[] args) {
		int p_num = 27;
		int sumofd = 0;
		for(int i =1 ; i<= p_num/2; i++) 
		{
			if(p_num % i == 0) {
				sumofd = sumofd + i;
			}
		}
		if(sumofd == p_num) {
			System.out.print(p_num + " is Perfect Numbar");
		}else {
			System.out.print(p_num + " is not Perfect Numbar");
		}
				
	}

}
