package t2_연산자;

import java.util.Scanner;

//60점 이상은 합격 60미만은 불합격 (String 변수에 담아서 출력하시오)
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		int su;
		
		System.out.print("점수를 입력하세요? "); // println이 아닌 print를 쓰면 줄바꿈 하지 않는다.
		su = sc.nextInt();
		
		res = (su >=60) ? "합격" : "불합격" ;
		System.out.println("점수 "+su+"점은 "+res+" 입니다.");
		
		sc.close();
	}
}
