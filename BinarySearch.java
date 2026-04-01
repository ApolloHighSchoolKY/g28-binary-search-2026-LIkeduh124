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
			if(ray[middle]>item)
			{
				top = middle-1;
			}
			else if(ray[middle]<item)
			{
				bottom = middle +1;
			}
			else
			{
				found = true;
			}
			middle = (bottom+top)/2;

			if(bottom == top && !found)
			{
				return -1;
			}
		}
		return middle;
	}
}
