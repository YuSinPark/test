package mun5;

import java.util.Scanner;

public class ma8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 입력을 받겠습니까 ? : ");
		int a=sc.nextInt();
		int max=0;
		int[] arr= new int[a];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			arr[i]=sc.nextInt();
			if(max<arr[i])
				max=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmep = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmep;
                }
            }
        }
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("제일 큰 수는 : "+max+"입니다.");
	}

}
