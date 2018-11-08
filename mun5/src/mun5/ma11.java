package mun5;

import java.util.Scanner;

public class ma11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stud=0,sum=0,swnum=0,count=0;
		int student[]=null;
		double avg=0;
		
		System.out.println(stud);
		while(true)
		{
			System.out.println("┌───────┬────────┬──────────┬─────┬─────┐");
			System.out.println("│1.학생수 │2.점수입력│3.점수리스트 │4.분석│5.종료│");
			System.out.println("└───────┴────────┴──────────┴─────┴─────┘");
			System.out.print("선택 > ");
			swnum=sc.nextInt();
			if(swnum==1)
			{
				System.out.print("학생수를 입력하세요. > ");
				stud=sc.nextInt();
				student = new int[stud];
				for(int i=0;i<student.length;i++)
				{
					student[i]=0;
				}
			}
			else if(swnum==2)
			{
				for(int i=0;i<student.length;i++)
				{
					System.out.print((i+1)+"번 째 학생 점수 : ");
					student[i]=sc.nextInt();
				}
			}
			else if(swnum==3)
			{
				for(int i=0;i<student.length;i++)
				{
					System.out.println((i+1)+"번 째 학생 점수 : "+student[i]);
					sum+=student[i];
					count++;
				}
			}	
			else if(swnum==4)
			{
				avg=(double)sum/count;
				System.out.println("학생 "+stud+"명의 점수 합산은 "+sum+"점입니다\n학생 "+stud+"명의 평균 점수는 "+avg+"점입니다.");
				
			}
			else if(swnum==5)
				break;
		}
	}

}
