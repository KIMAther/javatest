package ±èºó;

public class Exam132 extends Exam131 {
	static int[] values;
	static int result;

	void Exam132() {
		int[] values;
		result = 0;
	}

	public static void main(String[] args) {
		Exam132 ex = new Exam132();
		ex.values=new int[] {1,2,3};
		ex.result = ex.sum1(values);
		System.out.println("result : " + result);

		int result2 = ex.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2 : " + result2);

		int result3 = ex.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);

		int result4 = ex.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + result4);

	}

}
