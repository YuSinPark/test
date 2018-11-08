package mun5;

import java.util.Scanner;

public class ma {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0,counter=0;
		double avg=0;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		while(true)
		{
			int i=sc.nextInt();
			if(i==0)
				break;
			counter++;
			sum+=i;	
		}
		avg=((double)sum/(double)counter);
	System.out.println("수의 개수는 "+counter+"개이며 평균인 "+avg+"입니다.");
	}

}
