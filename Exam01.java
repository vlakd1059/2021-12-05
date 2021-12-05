package class1;

public class Exam01 {

	public static void main(String[] args) {
		int[][] numarr = new int[3][5];
		int value = 0;
		for (int i = 0; i < numarr[0].length; i++) {
			numarr[0][i] = value;
			value++;
			System.out.println(value);

		}
	}
}