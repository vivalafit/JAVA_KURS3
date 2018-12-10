package Pr2;


public class TextHandler {
    public static void main(String[] args) {
        lengthOfLongestSubstring("sjgnrjng46346364634 35 98 dfwh 89 ewuh2522362236");
    }

    public static void lengthOfLongestSubstring(String s) {
     
        int startIndex = 0;
        int longestStartIndex = 0;
        int endIndex = 0;
        int index = 0;
        int longestEnd = Integer.MIN_VALUE;
        boolean finding=false;
        
        
        for(int i=0;i<s.length();i++){
        	
        	if (!finding&&!Character.isAlphabetic(s.charAt(i))) {
                startIndex=i;
                finding =true;
                
        }else if(finding&&(Character.isAlphabetic(s.charAt(i))||i==s.length()-1)){
        		
        	
        		endIndex=i;
        		
        		finding=false;
        		
        		if(endIndex-startIndex>longestEnd-longestStartIndex){
        			
        			longestStartIndex=startIndex;
        			longestEnd=endIndex;
        		}
        }
        
           
        }
        if(!Character.isAlphabetic(s.charAt(longestEnd)))
        System.out.println(s.substring(longestStartIndex, longestEnd+1));
        if(Character.isAlphabetic(s.charAt(longestEnd)))
        	  System.out.println(s.substring(longestStartIndex, longestEnd));
    }
}
