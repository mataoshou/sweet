package business.introduction.algorithms.part2;

import java.util.Random;

public class InsertSort
{
	public static void main(String[] args)
	{
		int[] list =new int[1000];
		Random r =new Random();
		for(int i=0;i<1000;i++)
		{
			list[i] = r.nextInt(1000);
		}
		InsertSort is =new InsertSort();
		is.insert(list);
	}
	//插入排序
	public void insert(int[] list)
	{
		System.out.println("开始排序");
		int count = 1;
		for(int i=1;i<list.length;i++)
		{
			int temp = list[i];
			for(int j=i-1;j>=0;j--)
			{
				count++;
				System.out.println("计算次数："+count);
				
				if(list[j]>temp)
				{
					list[j+1]=list[j];
					list[j]= temp;
				}
				else{
					break;
				}
				
			}
			printArray(list);
		}
		printArray(list);
		System.out.println();
		System.out.println("计算次数："+count);
	}
	
	public void printArray(int[] list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i] + "__");
		}
		System.out.println();
	}
}
