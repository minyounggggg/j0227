package t2_연산자;

public class Test1 {
	public static void main(String[] args) {
		int su = 0;
		System.out.println("1.su : "+su);
		
		su = su + 1;
		System.out.println("2.su : "+su);
		
		su += 1;
		System.out.println("3.su : "+su);
		
		++su;
		System.out.println("4.su : "+su);
		
		su++;
		System.out.println("5.su : "+su);
		System.out.println("=====================");
		
		int res =0;
		res = su;
		System.out.println("6su : "+su+", res : " + res);
		
		res = ++su +10; //su->5 ress->15\
		System.out.println("7su : "+su+", res : " + res);
		
		res = su++ +10; //su->6 ress->15\
		System.out.println("8su : "+su+", res : " + res);
		
		res = --su +10; //su->5 ress->15\
		System.out.println("8su : "+su+", res : " + res);
		
		res = su-- +10; //su->4 ress->15\
		System.out.println("8su : "+su+", res : " + res);
		
		res = ++su + su-- +10; //su->4 res->20
		System.out.println("8su : "+su+", res : " + res);
	}
}
