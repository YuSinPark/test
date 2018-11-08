package mun5;

public class ma9 {

	public static void main(String[] args) {
		int[][] score = {
				{2,2},
				{3,3},
				{1,2},
				{3,4}
		};
		int sum = 0;
		double avg = 0;
		for(int i=0;i<score.length;i++)
			for(int j=0;j<score[i].length;j++)
				sum+=score[i][j];
		avg=sum/(score.length*score[0].length);
		System.out.println("총점 : "+sum+"\n평균 : "+avg);
	}

}
