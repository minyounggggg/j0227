package t2_연산자;

//3항 연산자(조건삭 ? 참 : 거짓)
public class Test4 {
	public static void main(String[] args) {
		//점수가 90점 이상이면 A, 80점 이상은 B 70 C 60 D 60미만 F
		
		char res;
		int jum = 75;
		
		//res = (jum >= 90) ? 'A' : (jum >= 80) ? 'B' : 'C';
		res = (jum >= 90) ? 'A' : (jum >= 80) ? 'B' : (jum >= 70) ? 'C' : 'D';
		System.out.println("점수 : "+ jum + "은" +res+ "학점 입니다.");
	}
	
}

