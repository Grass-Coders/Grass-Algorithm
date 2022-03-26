
import java.util.*;

class WordScrambleEx3 {
      public static void main(String[] args) {
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
            Scanner scanner = new Scanner(System.in);
                                            
            // [문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.           
            // hint : while문을 중첩해서(2개의 while문) 작성하세요.            
            
            Game : 
            while(true) {
                String answer = getAnswer(strArr);
                String question = getScrambledWord(answer);
                System.out.println("Question : " + question);
                System.out.println("Your answer is...");
                
                while(true) {
                	String userAnswer = scanner.nextLine();
                	
                	if(userAnswer.equals("q") || userAnswer.equals("Q")){
                		System.out.println("Game Over");
                		break Game;
                	}
                	
                	else if(userAnswer.equalsIgnoreCase(answer)== true) {
                		System.out.println("Correct!");
                		System.out.println("=====================================");
                		break;                	
                	 
                	}    
                	
                	else if(userAnswer.equalsIgnoreCase(answer)== false) {
                		System.out.println("Try again");
                	}                                	                       	
                }            	
            }                                    
      } // main

      public static String getAnswer(String[] strArr) {
            int idx = (int)(Math.random()*strArr.length);
            return strArr[idx];
      }
     
      public static String getScrambledWord(String str) {
            char[] chArr = str.toCharArray();

            for(int i=0;i < str.length();i++) {                 
                  int idx = (int)(Math.random()*str.length());
                 
                  char tmp = chArr[i];
                  chArr[i] = chArr[idx];
                  chArr[idx] = tmp;
            }
            return new String(chArr);
      } // scramble(String str)
}

/* ```[실행결과]

Question :IWVE
Your answer is :ievw
ievw은/는 정답이 아닙니다. 다시 시도해보세요.
Question :IWVE
Your answer is :view
정답입니다.

Question :HOEP
Your answer is :hope
정답입니다.

Question :GNCAEH
Your answer is :change
정답입니다.

Question :HECNAG
Your answer is :q
```

*/
