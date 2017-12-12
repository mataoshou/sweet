package business.introduction.algorithms.part2;

import java.util.Random;
//归并排序
public class DivideSort
{
	int count = 0;

	public static void main(String[] args)
	{
		int[] list =new int[100];
		Random r =new Random();
		for(int i=0;i<100;i++)
		{
			list[i] = r.nextInt(100);
		}
		DivideSort div =new DivideSort();
		div.divide(list, 0, 50, 99);
	}
	
	public void divide(int[] array, int left, int middle, int right)
	{
		if (right - left >=2)
		{
			divide(array, left, (left + middle) / 2, middle);
			divide(array, middle + 1, (right + middle + 1) / 2, right);
		}
		sort(array, left, middle, right);
	}

	public void sort(int[] array, int left, int middle, int right)
	{
		System.out.printf("left:%s  middle:%s  right:%s\n",left,middle,right);
		printArray(array,left,right);
		int l = middle - left + 1;
		int r = right - middle;
		int length = l + r;
		int[] l_array =new int[l+1];
		int[] r_array =new int[r+1];
		for(int i=0;i<l;i++)
		{
			l_array[i] = array[left+i];
		}
		l_array[l] = Integer.MAX_VALUE;
		for(int i=0;i<r;i++)
		{
			r_array[i] = array[middle+1+i];
		}
		r_array[r] = Integer.MAX_VALUE;
		int i=0;
		int j=0;
		int no=left;
		while(i<=l&&j<=r&&no<=right)
		{
			count++;
			System.out.println("第"+count+"次计算");
//			System.out.println(l_array[i]+"    "+r_array[j]);
			if(l_array[i]<r_array[j])
			{
				array[no] = l_array[i];
				i++;
			}else{
				array[no] = r_array[j];
				j++;
			}
			no++;
		}
		printArray(array,left,right);
	}
	
	public void printArray(int[] array, int left, int right)
	{
		for(int i=left;i<=right;i++)
		{
			System.out.print(array[i] + "  ");
		}
		System.out.println();
	}
}
