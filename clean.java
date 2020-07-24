import java.util.*;
import java.io.*;
public class Clean{

	static Scanner sc=new Scanner(System.in);
	public static int cleancode(String standard_material,int area,String automated_ornot)
	{
		
		int s=-1;
		if(standard_material.equals("standard materials"))
		{
			if(!automated_ornot.equals("fully automated"))
				s=1200;
			else
				s=0;
		}
		else if(standard_material.equals("above standard"))
		{
			if(!automated_ornot.equals("fully automated"))
				s=1500;
			else
				s=0;
		}
		else if(standard_material.equals("high standard"))
		{
			if(automated_ornot.equals("fully automated"))
				s=2500;
			else
				s=1800;
		}	
		int ta=s*area;
		return(ta);
	}
	public static void main(String[] args) {
		int res=-1;
		String automated_ornot=sc.nextLine();	
		String standard_material=sc.nextLine();
		int area=sc.nextInt();
		res=cleancode(standard_material,area,automated_ornot);
		if(res=0)
			System.out.println("WRONG INPUT");
		else
			System.out.println(res);
	}

}
