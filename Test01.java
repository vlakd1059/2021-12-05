package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오. ");
		int num = sc.nextInt();

		int[][] arr = new int[num][num];
		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i]=value; //아래로 숫자 전개
				value++;
				
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");// \t: 수평 탭
			}
			System.out.println();
		}

	}
}