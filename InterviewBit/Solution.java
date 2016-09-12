import java.util.*;
public class Solution {
    public static ArrayList primesum(int a) {
        ArrayList prime = new ArrayList(10);
        for (int j = 2; j <= a; j++) {
            int upperlimit = (int) Math.sqrt(a);
            for (int i = 2; i <= upperlimit; i++) {
                if (a % i == 0 & i < a) {
                    prime.add(i);
                }
            }
        }
        for (int i = 0; i < prime.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if ((a-prime.get(i)) == prime.get(j)) {
                    ArrayList ans = new ArrayList(2);
                    ans.add(prime.get(i));
                    ans.add(prime.get(j));
                }
            }

        }
    }
    public static void main(String args[]){
        primesum(4);

    }
    }

