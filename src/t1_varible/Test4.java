package t1_varible;

//실수 자료형 (float(4byte)), (double(8byte))

public class Test4 {
	public static void main(String[] args) {
		double dd1,dd2;
		dd1 = 3.123456;
		dd2 = 3.123456789898989;
		System.out.println("dd1 : "+dd1);
		System.out.println("dd2 : "+dd2);
		
		float ff1, ff2;
		ff1 = 3.14f; //long과 같이 f를 붙여준다. 대소문자 상관없음
		System.out.println("ff1 : "+ff1);
		
		ff2=3.14343434343434f;
		System.out.println("ff2 : "+ff2);
		
		double dd3 = 5E3, dd4 = 5E-3;
		System.out.println("dd3 : " + dd3);
		System.out.println("dd4 : " + dd4);
	}
}
