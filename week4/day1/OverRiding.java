package week4.day1;

public class OverRiding extends Overloading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding or=new OverRiding();
		or.reportStep("OverRiding ", "Methods");
	}
	public void reportStep(String a, String b) {
		System.out.println(a+b);
	}
}
