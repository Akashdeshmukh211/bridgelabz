
class snakeAndLadder{
     public static void main(String[] args) {
   
        int player1 = 0;
        int player2 = 1;
        int player1_scor = 0;
        int player2_scor = 0;
        // int dics = 0;
        //define the range
        int max = 6;
        int min = 1;
        int range = max - min + 1;       
        for(int i=0; i <= 6; i++ ){
            if(player1 == 1){
                int rand = (int)(Math.random()* range) + min;
                player1_scor = rand;  
                player2 = 1;
                player1 = 0;
            }
            if(player2 == 1){
                int rand = (int)(Math.random()* range) + min;
                player2_scor = rand;  
                player2 = 0;
                player1 = 1;
            }
        //    System.out.println(player1);
        //    System.out.println(player2);
           System.out.println(player1_scor);
           System.out.println(player2_scor);
           
        }
 
        
        
    }
  
}