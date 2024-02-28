package t1_varible;
	
// 정수형 타입 byte char short int long
public class Test3 {
	public static void main(String[] args) {
		byte bb1, bb2;
		bb1 = 127;
		// bb = 128; byte 타입의 수치 표현범위 : -128 ~ 127
		bb2 = -128;
		// bb2 = -129;
		
		System.out.println("bb1 : " + bb1);
		System.out.println("bb2 : " + bb2);
		System.out.println();
		
		short ss1 = 128, ss2=-129;
		System.out.println("ss1 : " + ss1);
		System.out.println("ss2 : " + ss2);
		System.out.println();
		
		//short ss3=33000;
		int ii1=33000;
		System.out.println("ii1 : " + ii1);
		
		int ii2 = 2100000000;
		System.out.println("ii2 : "+ii2);
		//int ii3 = 2200000000;
		
		long ll1 = 2100000000l; //롱을 쓸때는 숫자가 너무 크기 때문에 뒤에 L을 붙여준다. (대소문자 상관없음)
		System.out.println("ll1 : "+ll1);
		
		char cc1 = 'A';
		System.out.println("cc1 : "+cc1);		
		//System.out.printf("cc1=%d", cc1); 변환 불가능

		int cc2 ='A';
		System.out.println("cc2 : "+cc2);
		
		int cc3 ='a';
		System.out.println("cc3 : "+cc3);
	
		
		char cc4 = '한';
		System.out.println("cc4 : "+cc4);
		
		int cc5 = '한';
		System.out.println("cc5 : "+cc5);
		
		char cc6 = '\u0041';
		System.out.println("cc6 : "+cc6);
		
		
	}
}
