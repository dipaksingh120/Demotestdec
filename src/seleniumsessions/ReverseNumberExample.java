package seleniumsessions;

public class ReverseNumberExample {
	public static void main(String args[])
	{

	int rev=0,rem;
	int n=454;
	int temp=n;
	while(temp!=0)
	{
	rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
	}
	System.out.println("the reversed number is +" +rev);
	}

}
