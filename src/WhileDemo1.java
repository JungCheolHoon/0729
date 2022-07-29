import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = 'y' ;
		
		while(x == 'y'||x == 'Y') {
			
			System.out.print("정수를 입력하시오 : ");
			int su = sc.nextInt();
			sc.nextLine();
			System.out.println(su + "은 " + ((su%2==0)? "짝수입니다":"홀수입니다"));
			System.out.print("Again(y/n) ? : ");
			String a = sc.nextLine();
			x = a.charAt(0);
		}
		System.out.println("Program is over..");
		
	}
}
