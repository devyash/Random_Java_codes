
import java.util.*;
 class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  };

public class Range {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        /*short flag=0;
        if (intervals.size==0)
            return new Arraylist<Interval>(newInterval) ;
        if(intervals.get(intervals.size()-1).end < newInterval.start)
            return intervals.add(newInterval);
        for(Interval i : intervals){
            if(max(i.end<newInterval.start){
                flag=i.start;
            
                
            }
        }
        if(flag==1)
            return 
        */
        for(int i=0; i<intervals.size()-1;i++){
            if(intervals.get(i).end-1<intervals.get(i+1).start)
             intervals=merge(intervals,i);
            
        }
        return intervals;

    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals, int i ){
        Interval n= new Interval(intervals.get(i).start,Math.max(intervals.get(i+1).end-1,intervals.get(i).end-1));
        intervals.set(i,n);
        intervals.remove(i+1);
        return intervals;
    }
    public static void main(String[] args) {
         Range obj1= new Range();
         Interval a= new Interval(1,3);
         Interval b= new Interval(6,9);
         Interval newInterval= new Interval(3,5);
         ArrayList <Interval> intervals= new ArrayList<Interval>(2);
         intervals.add(a);
         intervals.add(b);
         for(Interval j: intervals) 
         System.out.println(j.start+","+j.end);
         intervals=obj1.insert(intervals,newInterval);
         for(Interval j: intervals)
         System.out.println(j.start+","+j.end);

        
    }
        
    
}
