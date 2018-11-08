package mun5;

import java.util.Scanner;

public class ma10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] word = {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"monitor","모니터"},
				{"mouse","마우스"}
		};
		String word2;
		int cu=0;
		double avg=0;
		for(int i=0;i<word.length;i++)
		{
			System.out.print("문제"+(i+1)+". "+word[i][0]+"의 뜻은 무엇인가요 ? : ");
			word2=sc.nextLine();
			if(word[i][1].equals(word2))
			{
				System.out.println("정답입니다.");
				cu++;
			}
			else
				System.out.println("틀렸습니다.\n정답은 "+word[i][1]+"입니다.");
		}
		avg=100*((double)cu/word.length);
		System.out.println("총"+cu+"개를 맟췄습니다.\n정답률은 "+avg+"%입니다.");
	}

}
