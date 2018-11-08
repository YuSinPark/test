package mun5;

import java.util.Scanner;

public class ma7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 입력을 받겠습니까 ? : ");
		int a=sc.nextInt();
		int[] arr= new int[a];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("합계 : "+sum);
	}

}
