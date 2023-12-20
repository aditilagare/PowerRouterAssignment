package PowerRouterAssignment;

public class FibonacciSseries {

	public static void main(String[] args) {
		int n =10;
		int a =0;
		int b= 1;
		int c;
		for(int i=1;i<=10;i++)
		{
			System.out.println(a);
			c= a+b;
			a=b;
			b=c;
		}
	}

}
