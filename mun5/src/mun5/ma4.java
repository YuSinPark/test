package mun5;

import java.util.Random;
import java.util.Scanner;

public class ma4 {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNum = (random.nextInt(100))+1;
		while(true)
		{
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			int x = sc.nextInt();
			if(x==randomNum)break;
			else if(x>randomNum)System.out.println("더 작은 수를 입력하세요.");
			else if(x<randomNum)System.out.println("더 큰 수를 입력하세요");
			++count;
		}
		System.out.println("시도횟수는 "+count+"번입니다.");
	}

}
