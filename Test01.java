package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�. ");
		int num = sc.nextInt();

		int[][] arr = new int[num][num];
		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i]=value; //�Ʒ��� ���� ����
				value++;
				
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");// \t: ���� ��
			}
			System.out.println();
		}

	}
}