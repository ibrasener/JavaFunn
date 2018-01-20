import java.util.Scanner;
public class ArrayAndMethods {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		int [ ] randArray1= new int [10];
		int [ ] randArray2= new int [10];
		int [ ] addArray = new int [10] ;
		int [ ] subArray=new int [10] ;
		
		System.out.print("Enter your high and low number respecctively: ");
		int high=input.nextInt();
		int low=input.nextInt();
		
		randomizeArray(randArray1,low,high);
		randomizeArray(randArray2,low,high);

		//int addArray1 =0;
		for(int i= 0, j = randArray2.length-1; i<randArray1.length;i++,j--) {
			 addArray[i]= randArray1[i]+ randArray2[j];
			 subArray[i]= randArray1[i]- randArray2[j];
			 
		}
		
		
		//sumArray(randomizeArray(randArray1,low,high));
		System.out.println("The sum of randArray1 is: "
		+ sumArray(randArray1));
		System.out.println("The sum of randArray2 is: "
				+ sumArray(randArray2));
		
		System.out.println("The sum of addArray is: "
						+ sumArray(addArray));		
						
		System.out.println("The sum of subArray is: "
								+ sumArray(subArray));
		
		System.out.print("\nRandArray1: " );
		printArray(randArray1);
		System.out.print("\nRandArray2: " );
		printArray(randArray2);		
		System.out.print("\nAddArray: ");		
		printArray(addArray);						
		System.out.print("\nSubArray: " );
		printArray(subArray);
		
								
	}
	
	public static void randomizeArray(int []array, int low,int high) {
		
		for(int i=0;i<array.length;i++) {
			array[i] = low+(int)(Math.random()*(high-low+1));
			
		}
		
	}	
	
	public static int sumArray(int[]array) {
		int sum = 0;
		for(int i = 0; i <array.length; i++) {
			sum+=array[i];
		}
			return sum;
	}
	
	public static void printArray(int[]array) {
		int i=0;
		if(i==0) {
		System.out.print("{"+array[i]);
		}
		for(i=1; i<array.length; i++ ) {
			
		System.out.print(","+array[i]);
		}
		//if ( i==array.length-1) {
			System.out.print("}");
		
		}
	
}


