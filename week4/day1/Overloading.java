package week4.day1;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol=new Overloading();
		ol.reportStep("Overloading", " with 2 args");
		ol.reportStep("Overloading", " with 3 args", false);
	}
	public void reportStep(String a, String b) {
		System.out.println(a+b);
	}
	
	public void reportStep(String a, String b, boolean c) {
		System.out.println(a+b+c);
	}
}
