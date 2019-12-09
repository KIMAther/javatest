package ±èºó;

public class Exam221 extends Exam111 {
	float num1, num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam221 ex1 = new Exam221(20, 30);
		Exam221 ex2 = new Exam221(20, 30);

		int result1 = (int) ex1.add();
		int result2 = (int) ex1.sub(num1, num2)
		int result3 = ex1.gob();
		int result4 = (int) ex2.div(num1, num2);

		System.out.println(ex1.num1 + "," + ex1.num2 + "ÀÇ ÇÕ : " + result1);
		System.out.println(ex1.num1 + "," + ex1.num2 + "ÀÇ »©±â  : " + result2);
		System.out.println(ex1.num1 + "," + ex1.num2 + "ÀÇ °öÇÏ±â : " + result3);
		System.out.println(ex2.num1 + "," + ex2.num2 + "ÀÇ ³ª´©±â : " + result4);

	}
	Exam221(float num1,float num2){
		this.num1=20;
		this.num2=10;
	}
	int add() {
		return (int) (this.num1 + this.num2);
	}
	int gob() {
		return (int) (this.num1 * this.num2);
	}
	
}
