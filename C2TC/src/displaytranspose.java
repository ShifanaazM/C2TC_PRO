import java.util.*;

public class displaytranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m,n;
		
		System.out.println("Enter the number of rows: \n");
		m=sc.nextInt();
		System.out.println("Enter the elements of the matrix: ");
		n=sc.nextInt();
		int arr[][]=new int[10][10];
		System.out.println("Enter the number of column: \n");
	
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements in the originalmatrix are: ");
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
		}
		int brr[][]=new int[10][10];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println("");
		
		}
		
	}

}
