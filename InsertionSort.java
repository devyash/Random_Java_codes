import java.io.*;

class InsertionSort{

	public static void main(String[] args){
		int n= 0;
		int []l= null;
		InsertionSort obj1 = new InsertionSort();
		n=obj1.getN();
		//System.out.println(n);
		l=obj1.getL(n);
		System.out.println("Sorted Elements using Insertion Sort");
		l=obj1.sort(n,l);
		try{
			for(int i=0;i<n;i++){
				System.out.println(l[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOFBoundsException");


		}
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
		int key,j=0,temp=0;
		for(int i=0; i<n; i++){
			key=l[i];
			j=i-1;
			while(j>=0 && l[j]>key){
				temp=l[j];
				l[j]=l[j+1];
				l[j+1]=temp;
				j--;
			}
			
		}
		return l;		
	}
}