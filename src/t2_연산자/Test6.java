package t2_연산자;

//60점 이상은 합격 60미만은 불합격 (String 변수에 담아서 출력하시오)
public class Test6 {
	public static void main(String[] args) {
	
		String res;
		int su = 85;
		
		res = (su >=60) ? "합격" : "불합격" ;
		System.out.println("점수 "+su+"는 "+res+" 입니다.");
	}
}
