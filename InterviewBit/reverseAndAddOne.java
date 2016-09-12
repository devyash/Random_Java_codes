	import java.util.ArrayList;
	import java.util.*;
	public class reverseAndAddOne{
			public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
			   Collections.reverse(a);
			   ArrayList<Integer> b = new ArrayList<>(a.size()+1);
			   int carry=1,d=0,j=0;
			   for(int i : a){
			   		d=i+carry;
			   		if(d>=10){
			   			b.add(d%10);
			   			carry=d/10;
			   		}
			   		else{
			   			carry=0;
			   			b.add(d);
			   		}

			   }
			   if(carry>0)
			   	b.add(carry);
			   Collections.reverse(b);
			  	while(b.get(0)==0)
			  		b.remove(0);
			  /* while(b.get(j).equals(Integer.valueOf(0))){
			   		b.remove(j);
			   		j++;
			   }*/	
			   return b;
			   } 





			   /* ArrayList<Integer> output = new ArrayList<>(a.size()+1);
			    double d=0,j=0;
			    for(int i=0;i<a.size();i++){
			        d+= a.get(i)*(int)Math.pow(10.0,a.size()-i-1);
			    }
			    System.out.println(d);
			    d+=1;
			    System.out.println(d);
			    
			    if(d>0)
					j = (int)(Math.log10(d)+1);
				else j=1;
			    
			    System.out.println(j);
			  	   
			    for(int i=0;i<=j-1;i++){
			        output.add((int)d%10);
			        d/=10;
			    }
			    Collections.reverse(output);

			    return output;*/
			//}
		public static void main(String[] args) {
			ArrayList a = new ArrayList <Integer>(5);
			a.add(0);
			a.add(0);
			a.add(0);
			a.add(1);
			a.add(9);
			
			System.out.println(a);
			System.out.println(plusOne(a));
		}
	}
