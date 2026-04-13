import java.util.Scanner;
public class SecondLargest {
    
        // TODO: Read N
        // TODO: Read array elements
        // TODO: Find and print the second largest element
        // Hint: You can do this in a single pass or two passes without sorting.
    
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int N= sc.nextInt();
		int[] arr= new int[N];

		for(int i=0;i<N;i++){

			arr[i]= sc.nextInt();

		}
		int large=arr[0];
		int secondLarge=0;

		for(int i=1;i<N;i++){

			if(arr[i]>large){

				secondLarge=large;
				large=arr[i];

			}
			else if(arr[i]>secondLarge){

				secondLarge=arr[i];

			}

		}
		System.out.println(secondLarge);

	}
}
