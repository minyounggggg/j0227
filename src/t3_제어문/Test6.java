package t3_제어문;

import java.util.Scanner;

//입력받은 수가 양수 음수 0인지 판별하시오
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String str ="";
		
		System.out.print("44숫자를 입력하시오? ");
		su = sc.nextInt();
		
		if (su > 0) str = "양수";
		else if (0 > su) str = "음수";
		else str = "0";
		
		System.out.println("입력된 수 "+su+" 는 "+str+" 입니다.");
		
		sc.close();
	}
}
