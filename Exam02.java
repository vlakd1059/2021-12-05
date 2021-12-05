package class1;

public class Exam02 {

	public static void main(String[] args) {
		int[][] arr = new int[3][5];
		int value = 1;
		// 입력부 , 출력부 따로 만드는게 좋음
		// 1, 입력부
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = value;
				value++;

			}
		}

		// 2, 출력부
		for (int i = 0; i < arr.length; i++) {
			// 한행 출력
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 한행 출력 할때마다 줄바꿈
		}
	}

}

//		for (int i = 0; i < arr[0].length; i++) {
//			arr[0][i] = value;
//			value++;
//		}
//		for (int i = 0; i < arr[0].length; i++) {
//			arr[1][i] = value;
//			value++;
//		}
//		for (int i = 0; i < arr[0].length; i++) {
//			arr[2][i] = value;
//			value++;
//		}
