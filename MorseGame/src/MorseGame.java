import java.util.*;

public class MorseGame {
	
	    
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
		
		for (int i = 0; i<i+1; i++) {
			//Date.randomNum();
			System.out.println("O que você deseja fazer?");
			System.out.println("1: Converter uma palavra para morse");
			System.out.println("2: Fazer um teste rapido em codigo morse?");
			int resp = scan.nextInt();
			
			if (resp == 1) {
				Date.escreverEmMorse();
			}else if (resp == 2){
				Date.morseGame();
			}else {
				System.out.println("Não entendi sua resposta!");
			}
			System.out.println(" ");
			System.out.println("-----------------------------");
			System.out.println(" ");
			
				
			
		}
	}
}
