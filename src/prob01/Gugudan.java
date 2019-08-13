package prob01;
import java.util.Scanner;


public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		
		// 랜덤값 저장
		resultNumber = l * r;
		
		int[] answerNumbers = randomizeAnswers();
		int loc = randomize( 0, 8 );
		answerNumbers[ loc ] = resultNumber;
		
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}
		
		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in );
		int answer = s.nextInt();
		if(answer == resultNumber) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
	}
	
	// 1~9까지 랜덤 반환
	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	
	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;
		
		// 9칸짜리 배열 만듬
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			// 1~81까지 랜덤 저장
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false;
	        // 정답에 중복값이 있는지 비교
	        // 중복값이 있다면 while문 처음으로 이동후 다시 뽑기
	        for( int i = 0; i < occupied; i++ ) {
	        	if( boardNumbers[i] == random || resultNumber == random) {
	        		evaluted = true;
	        		break;
	        	}
	        }
	        // 중복값이 없다면 랜덤값을 boardNumbers배열에 추가
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	
}
