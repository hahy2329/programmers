package level1;



/*
	얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
	예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 
	1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.
	
	
 
 * */
public class Question1 {

	public static void main(String[] args) {
		String[] answer = {};
		
		
		
		
		
		String[] players = {"mumu", "soe", "poe", "kai", "mine"}; //선수들 
		String[] callings = {"kai", "kai", "mine", "mine"}; //해설진이 호명한 선수 이름 
		
		
		for(int i=0; i<callings.length; i++) {
			for(int j=0; j<players.length; j++) {
				if(callings[i].equals(players[j])) {
						String a = players[j];
						players[j] = players[j-1];
						players[j-1] = a;
				}
			}
		}
		
		
		
		answer = players;
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
		
		
			
		
		
		
		

	}

}
