import java.io.*;
class BubbleSort{
	public static void main(String[] args) {
		int n,l[];
		BubbleSort obj1= new BubbleSort();
		n=obj1.getN();
		l=obj1.getL(n);
		l=obj1.sort(n,l);
		obj1.printl(l);
	}

	public int getN() {
		int n=0;	
		try{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of elements");
			n= Integer.parseInt(br.readLine());

			
		}
		catch(Exception e){
			System.out.println("Some Shitty Exception(Mostly NumberFormatException)");

		}
		return n;

	}

	public int[] getL(int n){
		int[]l= new int[n];
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++){	
				l[i]= Integer.parseInt(br.readLine());
			}
			
		}
		catch(NullPointerException e2){
			System.out.println("NullPointerException");
		}
		catch(IOException e){
			System.out.println("IOException");

		}

		return l;


	}
	public int[] sort(int n, int []l){
		for(int i=0; i<=n-1;i++){

			for (int j=0;j<n-1-i;j++) {

				if(l[j]<l[j+1]){
					int temp=0;
					temp =l[j];
					l[j]=l[j+1];
					l[j+1]=temp;
					
				}
				
			}
		}
		return l;	

	}

	public void printl(int []l){
		System.out.println("List of elements:");
		for (int i=0;i<l.length-1 ;i++ ) {
			System.out.println(l[i]);
		 	
		 } 
	}
}