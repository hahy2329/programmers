package level0;

/*	문제1.
 
	문자열 code가 주어집니다.
	code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
	
	mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
	
	mode가 0일 때
	code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
	code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
	mode가 1일 때
	code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
	code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
	문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
	
	만약 ret이 빈 문자열이면 "EMPTY"를 출력한다.
 
 	정답 : "acbac"
 * 
 * 
 * 
 */





public class Question1 {

	public static void main(String[] args) {
		
		String answer = "";
		String result = "abc1abc1abc";
		
		
		int mode = 0;
		
		
		
		
		
		for(int i =0; i<result.length(); i++) {
			
			if(result.charAt(i)=='1') {
				mode++;
				continue;
			}
			
			if(mode%2==1) {
				if(i%2==1) {
					answer+=result.charAt(i);
				}
			}
			
			if(mode%2==0) {
				if(i%2==0) {
					answer +=result.charAt(i);
				}
			}
		}
		
		if(answer.equals("")) {
			System.out.println("EMPTY");
		}
		
		System.out.println(answer);
		

	}

}
