package t2_연산자;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		int jum;
		
		System.out.print("점수를 입력하시오? ");
		jum = sc.nextInt();
		
		res = (jum >= 90) ? "A" : "B";
		System.out.println("점수"+jum+"는" +res+"학점 입니다.");
		
		sc.close();
	}
}
