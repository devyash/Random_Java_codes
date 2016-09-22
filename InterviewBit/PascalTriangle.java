import java.util.*;

public class PascalTriangle{

	public static void main(String[] args) {
		PascalTriangle p = new PascalTriangle();
		System.out.print(p.generate(5));
			
	}


	public ArrayList<ArrayList<Integer>> generate(int a) {

	   ArrayList<ArrayList<Integer>> o = new ArrayList<ArrayList<Integer>>(a);
	   ArrayList<Integer> t = new ArrayList<Integer>(a); 
	   t.add(1);
	   o.add(t);
	    for(int i=1;i<a;i++){	
	    	t= new ArrayList<Integer>(a);  

	        t.add(1);

	        for(int j=0 ; j<o.get(i-1).size()-1; j++){
	            //System.out.println(o.get(i-1).get(j));
	            //System.out.println(o.get(i-1).get(j+1));
	           t.add( o.get(i-1).get(j)+o.get(i-1).get(j+1) );	            
	        }

	        t.add(1);
	        
	        o.add(t);	        
	    }
	    return o;
	}
/*
		public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return result;
	 
		ArrayList<Integer> pre = new ArrayList<Integer>();
		pre.add(1);
		result.add(pre);
	 
		for (int i = 2; i <= numRows; i++) {
			ArrayList<Integer> cur = new ArrayList<Integer>();
	 
			cur.add(1); //first
			for (int j = 0; j < pre.size() - 1; j++) {
				cur.add(pre.get(j) + pre.get(j + 1)); //middle
			}
			cur.add(1);//last
	 
			result.add(cur);
			pre = cur;
		}
	 
		return result;
	}
	*/

}
