import java.util.*;
public class Design {
	static int x;
	static int y;
	static Scanner scan=new Scanner(System.in);
	public static void read()
	{
		System.out.println("Enter first operand");
		x=scan.nextInt();
		System.out.println("Enter second operand");
		y=scan.nextInt();
	}
	public static void show(int value)
	{
		System.out.println(value);
	}
	public static int add(int v1,int v2)
	{
		int v3=Integer.MIN_VALUE;
		v3=v1+v2;
		return v3;
	}
	public static int subtract(int v1,int v2)
	{
		int v3=Integer.MIN_VALUE;
		v3=v1-v2;
		return v3;
	}
	public static int multi(int v1,int v2)
	{
		int v3=Integer.MIN_VALUE;
		v3=v1*v2;
		return v3;
	}
	public static int divide(int v1,int v2)
	{
		int v3=Integer.MIN_VALUE;
		if(v2==0)
			return v3;
		else
			v3=v1/v2;
		return v3;
	}
	public static void check(char c)
	{
		int a=0;
		int flag=1;
		switch(c)
		{
			case '+':
				System.out.println("It is Addition Operation");
				a=add(x,y);
				break;
			case '-':
				System.out.println("It is Subtraction Operation");
				a=subtract(x,y);
				break;
			case '*':
				System.out.println("It is Multiplication Operation");
				a=multi(x,y);
				break;
			case '/':
				System.out.println("It is Division Operation");
				if(y!=0)
				{
					a=divide(x,y);
				}
				else
				{
					System.out.println("Division is not possible with divisor Zero ");
					flag=0;
				}
				break;
			default:
				flag=0;
				System.out.println("It is not a Arithmetic operator");
		}
		if(flag==1)
		{
			show(a);
		}
	}
	public static void main(String[] args) {
		read();
		System.out.println("Enter the Arithmetic operator");
		char operator=(scan.next()).charAt(0);
		check(operator);
		
	}
}