package com.easy;

public class SequenceFun {

	public int NthTerm(int n)
    {
        // code here
        long res = 1;
        long mod =(long)Math.pow(10,9)+7;
        for(int i =1;i<=n; i++) {
            
            res = ((res*i)+1)%mod;
            
        }
        
        return (int)res;
    }
}
