import java.util.*;
public class Solution {
    public ArrayList<Integer> primesum(int a) 
    ArrayList<Integer> prime = new ArrayList<>;
        for(int j=2;j<=a;j++){
            upperlimit=(int)Math.sqrt(a);
            for(int i = 2;i<=upperlimit;i++){
                if(a%i==0&i<a){
                    prime.add(i);
                }
            }
        }
        for(int i = 0; i<prime.size();i++){
            for(int j=0;j<=i;j++){
                if(a-prime.get(i)==prime.get(j)){
                    ArrayList<Integer> ans= new ArrayList<>(2);
                    ans.add(prime.get(i));
                    ans.add(prime.get(j));
                }
            }
                
        }
        
        
    }

