import java.util.Scanner;

public class BranchDemo {
	public static void main(String[] args) {
//		 for(int i = 1 ; i < 101 ; i++) {
//			 if(i%7==0) 
//				 System.out.println(i+"\t");
//			 else
//				 continue;	 
//		 }
		
		
//		outer : // for 문 라벨
//		for(int i = 65 ; i<91 ; i++) {
//			int j =65;
//			inner: // while문 라벨
//			while(j<=i) {
//				System.out.printf("%c",j);
//				if(j==70) {
//					break outer; // for 문의 루프를 나가라
//				}
//				j++;
//			}
//			System.out.println();
//		}
		
		String systemPassword = "ABCD";
		Scanner sc = new Scanner(System.in);
		System.out.print("Input password : ");
		String userPassword = sc.nextLine();
		
		for(int i = 0 ; i <4 ; i++) {
			if(systemPassword.charAt(i)==userPassword.charAt(i)) {
				if(i==4) {
					System.out.println("로그인 되었습니다.");
				}
				continue;
			}
			else {
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		
	}
}
