package business.introduction.algorithms.part2;

import java.util.Random;
//分治求最大子集
public class MaxMum
{
	
	public static int count =0;
	public int[] findMum(int[] array, int left,int right)
	{
		
		int[] result=new int[3];
		//单个元素
		if(left == right){
			return new int[]{left,right,array[left]};
		}
		//分别获取两边的最大子集
		int mid =(left+right)/2;
		int[] left_array=findMum(array,left,mid);
		int[] right_array=findMum(array,mid+1,right);
		
		//获取中间的最大子集
		int max=0;
		int[] left_mid =new int[3];
		left_mid[1] = mid;
		left_mid[2]=Integer.MIN_VALUE;
		for(int i=mid;i>=left;i--)
		{
			max = max+array[i];
			if(max>left_mid[2])
			{
				left_mid[0]=i;
				left_mid[2] = max;
			}
		}
		int[] right_mid =new int[3];
		right_mid[2] =Integer.MIN_VALUE;
		right_mid[0] = mid+1;
		for(int i=mid+1;i<=right;i++)
		{
			max = max+array[i];
			if(max>right_mid[2])
			{
				right_mid[1]=i;
				right_mid[2] = max;
			}
		}
		int[] mid_array = new int[]{left_mid[0],right_mid[1],left_mid[2]+right_mid[2]};
		
		//求出最大子集
		result =left_array;
		if(result[2]<mid_array[2])
		{
			result=mid_array;
		}
		if(result[2]<right_array[2])
		{
			result=right_array;
		}
		show(array,left,right,"解集合数据：");
		System.out.println("最大集合范围："+result[0]+"  "+result[1]);
		show(array,result[0],result[1],"最大子集合：");
		System.out.println("");
		
		return result;
	}
	
	public void show(int[] array ,int left,int right,String content)
	{
		System.out.print(content);
		for(int i=left;i<=right;i++)
		{
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Random r =new Random();
		int[] array =new int[10];
		for(int i=0;i<array.length;i++)
		{
			array[i] = 120- r.nextInt(200);
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		MaxMum mum =new MaxMum();
		mum.findMum(array,0,9);
	}
}
