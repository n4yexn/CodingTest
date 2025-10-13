class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            char a = my_string.charAt(i);
            
            if(Character.isLowerCase(a)) {
               a = Character.toUpperCase(a);
                
            }
            else
               a = Character.toLowerCase(a);  
              answer += a;
        } 
      
       
        return answer;
    }
}