/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.dp.stringpattern;

public class WildCardPatternMatching {
    private static final char STAR = '*';
    private static final char QUESTION = '?';
    
    public boolean isMatch(String s, String p) {
        boolean[] dp = newDp(s, p);
        
        for(int i = 0 ; i < s.length(); i++){
            boolean previous = dp[0];
            dp[0] = false;
            
            for(int j = 0 ; j < p.length(); j++){
                boolean temp = dp[j+1];
                
                if(s.charAt(i) == p.charAt(j) || p.charAt(j) == QUESTION){
                    dp[j+1] = previous;
                } else if(p.charAt(j) == STAR){
                    dp[j+1] = dp[j+1] || dp[j];
                } else {
                    dp[j+1] = false;
                }
                
                previous = temp;
            }
        }
        
        return dp[p.length()];
    }
    
    private static boolean[] newDp(String s, String p){
        boolean[] dp = new boolean[p.length()+1];
        dp[0] = true;
        
        int i = 0;
        while(i < p.length() && p.charAt(i) == STAR){
            dp[i+1] = true;
            i++;
        }
        
        return dp;
    }
}
