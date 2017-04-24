public class Solution {
    
    
    public int reverse(int x) {
        
        String temp = "";
        String reverse =  "";
        
        
        if(Integer.MIN_VALUE > x && Integer.MAX_VALUE < x)
            return 0;
            //If the number is outside of the integer range, return 0 based on the problem description
        else{
            temp = Integer.toString(x);
            //test if the number is negative to build the reverse properly
            //If the number is negative, the result should set the first character in the string to the negative indicator
            if(temp.charAt(0) == '-'){
                
                reverse = Character.toString(temp.charAt(0));
    
                for(int i = temp.length()-1; i >= 0; i--){
                    
                    if(i != 0){
                    char c = temp.charAt(i);
                    
                    reverse = reverse.concat(Character.toString(c));
                 
                    }
                
                
                }
                
                
            }
            else
            {   //if the number is positive, loop through and go ahead and create a reversed string.
                for(int i = temp.length()-1; i >= 0; i--){
                    
                   
                    char c = temp.charAt(i);
                    System.out.println(c);
                    reverse = reverse.concat(Character.toString(c));
       
                    
                
                
            }
            
            
            
        }
     
    
     
     
     if((double)Integer.MIN_VALUE < Double.parseDouble(reverse) && (double)Integer.MAX_VALUE > Double.parseDouble(reverse)){
         //this is a final check to make sure the reversed number is in the correct range. The reversed number could end up being larger //than a 32 bit integer, so it is important to check.
         return Integer.parseInt(reverse); 
         
     }
     else{
         //if the reversed number is larger than a 32 bit int return 0.
         return 0;
     }
       
    }
    }

}

