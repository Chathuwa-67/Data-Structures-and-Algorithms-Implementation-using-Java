class BubbleSort
{
	//pass an array through the method
	void bubbleSort(int []a)
	{
		//to iterate through the array,
		//in each iteration next largest element will bubble up and move into its correct position 
		for(int i=0;i<a.length;i++)
		{
			//to compare every two items in the array
			//j=1 , compare second item with previous item
			
			for( int j=1;j<a.length;j++)
			{
				//to swap the items
				if(a[j]<a[j-1])  // if 1st item less than 0th item, j mean 1st place value
				{
					int temp =a[j];	//then move 1st item value into temporary place, temp = 2
					a[j]=a[j-1];	//1st place value equal to 0th place value
					a[j-1]=temp;  //0th place value replace with the temporary place value, that mean j-1, 0th place item value is 2 now 
				}
			}
		}
	}
	
	void print(int []a)
	{
		System.out.println("Sorted array using bubble sort");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
	}
	
	public static void main(String arg[])
	{
		//create object
		BubbleSort ob=new BubbleSort();
		//initialize array
		int arr[]={100,7,50,25,10,5};
		
		// to print array
		System.out.println("Array Before Bubble Sort");  
           for(int i=0; i < arr.length; i++)
		   {  
             System.out.print(arr[i] + " ");  
           }  
                System.out.println();  
				
		// call methods
		ob.bubbleSort(arr);
		ob.print(arr);
	}	
}

