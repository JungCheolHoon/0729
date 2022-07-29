
import java.util.Scanner;


public class MyCalender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.print("Year : ");
		int year = sc.nextInt();		
		System.out.print("Month : ");
		int month = sc.nextInt();
		
		int day = 1;
		int sum = 0;
//		for(int i =1 ; i <= year ; i++) {
//			if(i%400==0 || ((i%4 ==0) &&( i%100 !=0))) {										//i가 윤년입니까?
//				sum += 366;											//i가 윤년이라면
//			}
//			else {
//				sum += 365;											//i가 윤년이 아니라면	
//			}
//		}
		
		for(int i1 = 2001 ; i1 <year ; i1++) {
			for (int i = 1; i <=12 ; i++) {
				sum += getLastDay(i1,i);
			}
		}
		for (int i = 1; i <month ; i++) {
			sum += getLastDay(year,i);
		}//올해 6월까지 합
		sum++;
		System.out.println("2001-01-01 부터 현재까지 총 " + sum +"일만큼 지났습니다.");
		 // 6월 마지막날 다음날
		int space = sum%7;
		int count = 0;
		int lastDay = getLastDay(year,month);
		for(int i =1 ; i<=7 ; i++) {
			switch(i) {
			case 1: System.out.print("일\t"); break;
			case 2: System.out.print("월\t"); break;	
			case 3: System.out.print("화\t"); break;
			case 4: System.out.print("수\t"); break;
			case 5: System.out.print("목\t"); break;
			case 6: System.out.print("금\t"); break;
			case 7: System.out.print("토\n"); break;
			}
		}
		for(int i =1; i<= lastDay+(sum%7) ;i++) {
			
			if((space)>0) {
				System.out.print("★\t");
				space--;
			}
			else
			System.out.print(i-(sum%7) + "\t");
		
			if(i%7==0) {
				System.out.println();
			}
		}
		
	
//		switch(sum%7) {													//선택한 년월의 처음 일 수
//		case 0: System.out.println("SUN"); break;
//		case 1: System.out.println("MON"); break;	
//		case 2: System.out.println("TUE"); break;
//		case 3: System.out.println("WED"); break;
//		case 4: System.out.println("THU"); break;
//		case 5: System.out.println("FRI"); break;
//		case 6: System.out.println("SAT"); break;
//				
//		}
	}	

	static int getLastDay(int year , int month) {
		int lastDay=0;
		if(month == 2) {
			if(year%400==0 || ((year%4 ==0) && (year%100 !=0)))
				lastDay = 29;
			else
				lastDay = 28;
		}
		else if(month != 2) {
			if(month == 1|| month == 3|| month == 5|| month == 7|| month == 8|| month == 10|| month == 12 )
				lastDay = 31;
			else if(month == 4||month == 6||month == 9||month == 11)
				lastDay = 30;
		}
		return lastDay;
	}
}