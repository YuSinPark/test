package mun5;

import java.util.Scanner;

public class ma5 {

	public static void main(String[] args) {
		int num=0,greed=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		num=sc.nextInt();
		System.out.println("학년을 입력하세요");
		greed=sc.nextInt();
		if(greed<4)
		{
			if(num>=60)
				System.out.println("합격");
			else if(num>100)
				System.out.println("점수를 잘못 입력하셨습니다.");
			else
				System.out.println("불합격");
		}
		else
		{
			if(num>=70)
				System.out.println("합격");
			else if(num>100)
				System.out.println("점수를 잘못 입력하셨습니다.");
			else
				System.out.println("불합격");
		}
	}

}
