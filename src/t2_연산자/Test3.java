package t2_연산자;

//3항 연산자(조건삭 ? 참 : 거짓)
public class Test3 {
	public static void main(String[] args) {
		//점수가 90점 이상이면 A, 90점 미만은 B로 처리하시오
		
		char res;
		int jum = 95;
		
		res = (jum >= 95) ? 'A' : 'B';
		System.out.println("점수 : "+ jum +"은" + res+ "학점 입니다.");
	}
}
