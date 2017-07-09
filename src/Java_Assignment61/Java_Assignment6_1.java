package Java_Assignment61;
/*
 * This class will help  to master the Array concepts.
 * Problem Statement:
 * Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print all even numbers from an array. 
 */

public class Java_Assignment6_1 
{

	public static void main(String[] args) 
	{
		int i;
        int arr[]=new int[10]; // declaring the int array with size 10
        
        for(i=0;i<10;i++)
        {
        	arr[i]=i+1; //initializing the array with 1 to 10
        }
        
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+" is even"); //printing the even numbers fromthe array
            }
        }

	}

}
