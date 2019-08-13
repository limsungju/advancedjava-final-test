package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		scanner.close();
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		//while(true) {
			if(operation.equals("+")) {
				Arithmetic ac = new Add();
				System.out.println(ac.calculate(a, b));
			} else if (operation.equals("-")) {
				Arithmetic ac = new Sub();
				System.out.println(ac.calculate(a, b));
			} else if (operation.equals("*")) {
				Arithmetic ac = new Mul();
				System.out.println(ac.calculate(a, b));
			} else if (operation.equals("/")) {
				Arithmetic ac = new Div();
				System.out.println(ac.calculate(a, b));
			}
//			} else {
//				try {
//					System.out.println();
//				} catch(Exception e) {
//					System.out.println("잘못된 연산 방식을 입력하였습니다.");
//					System.out.println("다시 입력해 주세요.");
//					continue;
//				}
//			}
		//}
		
		
		
		
		
	}
}
