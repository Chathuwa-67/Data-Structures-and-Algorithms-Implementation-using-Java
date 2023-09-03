import java.util.*;
class LinearSearch
{
	int arr[]={12,67,45,87,34};
	Scanner sc=new Scanner(System.in);
	int a,b;
	
	void getSearchElement()
	{
		System.out.println("Enter the number which is to be searched:");
		a=sc.nextInt();	 //45	
	}
	
	void search()
	{
		boolean eq=true; //not found
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a) 
			{
				eq=false;
				b=i;
				break;				
			}
		}
		
		if(eq) //true
		{
			System.out.println("Searched element is not found");
		}
		else //eq=false
		{
			System.out.println("Searched element is found");
			System.out.println("Found at the location"+" "+(b+1));
		}
		
	}
	
	public static void main(String arg[])
	{
		LinearSearch ob= new LinearSearch();
		ob.getSearchElement();
		ob.search();
		
	}
}