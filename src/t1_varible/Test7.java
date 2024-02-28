package t1_varible;

//자동 타입변환
public class Test7 {
	public static void main(String[] args) {
		int su1 = 100;
		double su2 = 3.14;
		
		su1 = su1+200;
		System.out.println("su1 : "+su1);
		
		// su1 = su1 +su2; 정수가 받아주고 있기 떄문에 실수와 정수의 계산이 되지 않음 --> 에러
		su2 = su1+su2; // 따라서 실수인 su2를 써서 받아줘야 함 //double 타입으로 자동변환된다.
		System.out.println("su2 : "+su2);
		
		double result;
		result = su1 + su2 ; //double 타입으로 자동변환된다.
		System.out.println("1.result :" + result);
		
		result = su1+su2; //double 타입으로 자동변환된다.
		System.out.println("2.result :" + result);
		
		int atom;
		atom =1+2*3;
		System.out.println("atom :"+atom);
		
		char cc1='A';
		int res2 = cc1 +1;
		System.out.println("res : " + res2);
		System.out.printf("res2 = %d\n", res2);
		System.out.printf("res2 = %c\n", res2);
		System.out.println();
		
		String ss1 = "안녕하세요";
		System.out.println("ss1 : "+ss1);
		System.out.printf("ss1 : %s\n", ss1);
		
		double dd1 = 3.141592;
		System.out.println("dd1 : "+dd1);
		System.out.printf("dd1 : %f\n",dd1);
		System.out.printf("dd1 : %.2f\n",dd1); //소숫점 두번쨰 까지만 표시
		System.out.printf("dd1 : %6.2f\n",dd1); //소수점을 포함한 전체자릿수
		
	}
}
