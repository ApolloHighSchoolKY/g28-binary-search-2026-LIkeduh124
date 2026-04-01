import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int bottom = 0;
		int top = ray.length-1;
		int middle = (bottom+top)/2;
		boolean found = false;
		while(!found)
		{
			//too high
			if(ray[middle]>item)
			{
				top = middle-1;
			}
			//too low
			else if(ray[middle]<item)
			{
				bottom = middle +1;
			}
			//found it
			else if(ray[middle] == item)
			{
				found = true;
			}
			middle = (bottom+top)/2;
			
			//if the number isn't in the list
			if(bottom == top && ray[middle]!=item)
			{
				return -1;
			}
		}
		return middle;
	}

	
}
