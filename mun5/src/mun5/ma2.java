package mun5;

import java.util.Scanner;

public class ma2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값을 입력하세요 : ");
		int start=sc.nextInt();
		System.out.println("종료값을 입력하세요 : ");
		int end=sc.nextInt();
		for(;start<=end;start++)
		{
			System.out.print(start);
			if(start==end)
			{
				sum+=start;
				System.out.print("=");
				break;
			}
			else
			{
				System.out.print("+");
				sum+=start;
			}
		}
		System.out.println(sum);
	}

}
