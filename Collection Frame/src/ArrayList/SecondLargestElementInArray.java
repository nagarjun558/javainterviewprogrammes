package ArrayList;


public class SecondLargestElementInArray {
	
	//easy approach
	public static int getSecondLargest(int arr[],int total) {
		int temp;
		
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		return arr[total-2];
	}
	
	/* Function to print the second largest
    elements */
    public static void print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;
 
        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }
 
        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
 
        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                             + " element\n");
        else
            System.out.print("The second largest element"
                             + " is " + second);
    }

	public static void main(String[] args) {
		
		int arr[]={44,66,99,77,33,22,55}; 
		int n= arr.length;
		System.out.println("Second Largest Element:"+getSecondLargest(arr,n));
		
		print2largest(arr,n);

	}
	
	
	

}
