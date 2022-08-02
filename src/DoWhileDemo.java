import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args) {
		//1~10까지 출력
		
		for(int i=1 ; i<=10; i++) {
			System.out.print(i+"\t");
		}//
		
		System.out.println();
		
		int j=1;
		while(j<=10) {
			System.out.print(j +"\t");
			j++;
		}
		
		System.out.println();
		
		int k=1;
		do {
			System.out.print(k +"\t");
			k++;
		}while(k<=10);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		char x = 'y' ;
		
		do {
			
			System.out.print("정수를 입력하시오 : ");
			int su = sc.nextInt();
			sc.nextLine();
			System.out.println(su + "은 " + ((su%2==0)? "짝수입니다":"홀수입니다"));
			System.out.print("Again(y/n) ? : ");
			String a = sc.nextLine();
			x = a.charAt(0);
		}while(x == 'y'||x == 'Y');
		System.out.println("Program is over..");
		
	}
}
