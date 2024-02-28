package t3_제어문;

import java.util.Scanner;

//점수가 60점 이상이면 합격 미만이면 불합격을 출력하시오

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum = 0;
		String res = "";
		
		System.out.print("점수를 입력하시오? ");
		jum = sc.nextInt();
		
		if(jum >=60) 
			res = "합격"; //한줄일때는 {}생략가능
		
		else 
			res = "불합격"; //한줄일때는 {}생략가능
		
		
		System.out.println("점수 "+jum+"는 "+res+"입니다.");
		
		sc.close();
	}
}
