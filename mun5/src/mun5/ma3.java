package mun5;


public class ma3 {

	public static void main(String[] args) {
		int one=2,two=4; 
		int result=0;
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=2;y++)
			{
				if((x*one)+(y*two)==10)
				{
					System.out.println("x="+x + " y="+y);
					result++;
				}
			}
		}
		System.out.println(result+"개");
	}

}
