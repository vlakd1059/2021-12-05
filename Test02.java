package 자바테스트;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원본 : ");
		int[][] arr = new int[5][5];
		int value = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = value;
				value++;
			}

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("180도 회전: ");
		int[][] arr2 = new int[5][5];
		int value2 = 25;
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				arr2[a][b] = value2;
				value2--;
			}
		}

		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 5; b++) {
				System.out.print(arr2[a][b] + "\t"); // \t: 수평 탭
			}
			System.out.println();
		}
	}

}
