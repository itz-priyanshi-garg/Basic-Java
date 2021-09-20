import java.util.Scanner;

class Pattern
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		n = sc.nextInt();
		
		int temp = 1;
		int tem = n;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int k=tem ; k>=1 ; k--)
			{
				System.out.print(" ");
			}
		
			tem--;
			
			for(int j=1 ; j<=temp ; j++)
				System.out.print("*");
			
			temp += 2;
			System.out.println();
		}
	}
}