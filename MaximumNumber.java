import java.util.*;

class MaximumNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int max = 0, rem;

		System.out.print("\n\t\t\tEnter number : ");
			int n = sc.nextInt();

		System.out.println("\n\t\t\t=============================");
		
		//n=n%10;

		while(n!=0)
		{
			rem = n%10;
			if(rem>max)
				max=rem;

			n=n/10;
		}
		
			System.out.println("\n\t\t\tMaximum Number is : " +max);

	}

}