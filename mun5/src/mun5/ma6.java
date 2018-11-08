package mun5;

import java.util.Scanner;

public class ma6 {

	public static void main(String[] args) {
		int money=0,menuNum=0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("┌─────┬─────┬─────┬─────┐");
			System.out.println("│1.예금│2.출금│3.잔고│4.종료│");
			System.out.println("└─────┴─────┴─────┴─────┘");
			System.out.print("선택> ");
			menuNum=sc.nextInt();
			switch(menuNum)
			{
				case 1:
					System.out.print("입금액 : ");
					money += sc.nextInt();
					System.out.println("현재 잔액은 "+money+"입니다.");
					break;
				case 2:
					int minus=0;
					System.out.print("출금액 : ");
					minus=sc.nextInt();
					if(money<minus)
					{
						System.out.println("잔액이 부족합니다.\n현재잔액은 "+money+"원입니다.");
					}
					else
					{
						money-=minus;
						System.out.println("현재잔액은 "+money+"원입니다.");
					}
					break;
				case 3:
					System.out.println("현재잔액은 "+money+"원입니다.");
					break;
				case 4:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("다시 선택해주세요(1~4번");
					break;
			}
		}
	}

}
