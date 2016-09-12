import java.util.collections.*;
 class GigawattPower{

    static boolean GigawattPower(int[] batteryOne, int[] batteryTwo, int gigawattTarget) {
        
    
    HashSet<Integer> h = new HashSet<>();
    int[] b1 = batteryTwo;
    int[] b2 = batteryOne;
    if(batteryOne.length<batteryTwo.length) {
        b1 = batteryOne;
        b2 = batteryTwo;
    }
    for (int i = 0; i < batteryTwo.length; i++) 
        h.add(big[i]);

    for (int j: small) {
        int t = gigawattTarget-j;
        if(h.contains(t)) {
            return true;
        }
    }
    return false;
        }
     public static void main(String[] args) {
    // 	GigawattPower({5,7,2,4},{-3,0,1},8);
     }


    }

