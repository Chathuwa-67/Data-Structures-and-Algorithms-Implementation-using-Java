import java.util.*;
class BinarySearch
{
	Scanner sc=new Scanner(System.in);
	
	/*int[] getArray()
	{
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the Array element");
			a[i]=sc.nextInt();			
		}
		return a;
	} */
	
	int getsearchElement(){
		System.out.println("Enter the element you want to search");
		int s=sc.nextInt();
		return s;
	}
	
	int BinarySearch(int ar[],int searchElement)
	{
		int lowerBound=0;
		int upperBound=ar.length;
		while(lowerBound <= upperBound){

			int middle=(lowerBound+upperBound)/2;
			
			if(ar[middle]==searchElement)
			{
				return middle;
			}
			
			else if(searchElement>ar[middle])
			{
				lowerBound=middle+1;
			}
			
			else
			{
				upperBound=middle-1;
			}
		}
		return -1;
	}
	
	public static void main (String arg[]){
		int a[]={3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
		BinarySearch b1=new BinarySearch();
		//int a[]=b1.getArray();
		int ele=b1.getsearchElement();
		int ans=b1.BinarySearch(a,ele);
		System.out.println("Index of the element "+ele+" is "+ans);
	}
}