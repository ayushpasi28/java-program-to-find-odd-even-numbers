import java.util.Scanner;

class OddEven
{
	private static void oddEven(int n) {
		// TODO Auto-generated method stub
		if(n%2==0)
		{
			System.out.println(n+":is Even");
		}
		else
		{
			System.out.println(n+": is Odd");
		}
	}
public static void main(String args[])
    {
	 int n,res;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter number to check even or odd:");
	 n=sc.nextInt();
	 sc.close();
	 oddEven(n);
	  }

}
