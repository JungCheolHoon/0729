import java.util.Random;

public class DoWhileDemo2 {
	public static void main(String[] args) {
		//1부터 6까지의 랜덤값을 추출하되 서로 다른 2개를 출력하는 프로그램
		int a = (int)(Math.random()*45+1);
		int b = (int)(Math.random()*45+1);
		int c = (int)(Math.random()*45+1);
		int d = (int)(Math.random()*45+1);
		int e = (int)(Math.random()*45+1);
		int f = (int)(Math.random()*45+1);
		
//		int a,b;
//		
//		do {
//			a = (int)(Math.random()*10);
//			b = (int)(Math.random()*10);
//			System.out.printf("a의값 = %d, b의값 = %d\n",a,b);
//		} while(a==b);
//		
		
		
		do {
			a = (int)(Math.random()*45+1);
			b = (int)(Math.random()*45+1);
			c = (int)(Math.random()*45+1);
			d = (int)(Math.random()*45+1);
			e = (int)(Math.random()*45+1);
			f = (int)(Math.random()*45+1);
		}while(a==b || a==c || a==d || a==e || a==f || b==c || b==d || b==e || b==f || c==d || c==e || c==f || d==e || d==f || e==f);
		System.out.printf("%d , %d , %d , %d , %d , %d " ,a,b,c,d,e,f);
		
	}
}
