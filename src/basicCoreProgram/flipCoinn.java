package basicCoreProgram;

public class flipCoinn {

	public static void main(String[] args) {
		int numOffilp = 10;
		int heads = 0;
	    int tails = 0;
	    for(int i = 1; i <= numOffilp;i++) {
	    	if(Math.random() < 0.5) {
	    		tails++;
	    	}
	    
	    	//System.out.println(tails);
	    }
	    double precentageOftails = (tails * 100)/ numOffilp;
	    double precentageOfheads = 100 - precentageOftails;
	    System.out.println(precentageOftails);
	    System.out.println(precentageOfheads);
	 
	}

}
