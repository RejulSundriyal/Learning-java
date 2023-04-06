import java.util.Scanner;
public class EO
{
	public static void main(String[] args)
	{
	int a,i,r;
	Scanner user= new Scanner(System.in);
	System.out.println("enter number to print table");
	a= user.nextInt();
	/*if(a%2==0)
	{
		System.out.println("even");
	}
		else{
			System.out.println("odd");
	}*/
	for(i=1;i<=10;i++)
	{
		r = a*i;
		System.out.println(+a+"*"+i+"="+r);
	}
	
}
}

