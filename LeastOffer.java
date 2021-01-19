import java.util.*;
public class Main{
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int val3[]=new int[a];
        String[] input= new String[a];
    
        for(int i = 0 ; i < input.length; i++ ){
             input[i] = sc.next();
        }
     
        for(int j = 0 ; j < a;j++){
      
         String[] words = input[j].split(",");
         int val1 = Integer.parseInt(words[1]);
         int val2 = Integer.parseInt(words[2]);
         val3[j] = (val1*val2)/100;
        
    }
    
        int sval = val3[0];
    	int position = 0;
   
    	for(int k = 0; k < a; k++) {
	    	if(sval > val3[k]) {
		    	sval = val3[k];
		    	position = k;
	    	}
        }
       
        for(int m=0;m<a;m++){
            if(val3[position] == val3[m]){
                 String[] result1 = input[m].split(",");
                System.out.println(result1[0]);
            }
        }
      
      
    }
}
