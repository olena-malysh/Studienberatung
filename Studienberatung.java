import java.util.*; 

public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String answer = scanner.nextLine();
		
		if(answer.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			answer = scanner.nextLine();
			if(answer.equalsIgnoreCase("j")){
				System.out.println("Hast du eine Berufsausbildung?");
				answer = scanner.nextLine();
				if(answer.equalsIgnoreCase("j")){
					System.out.println("Du kannst ja spaeter noch studieren.");	
				}
				else if(answer.equalsIgnoreCase("n")){
					System.out.println("Besser noch studieren.");	
				}
			}
			else if(answer.equalsIgnoreCase("n")){
				System.out.println("Nicht studieren.");
			}
		}
		else if(answer.equalsIgnoreCase("j")){
			System.out.println("Bist du wissbegierig?");

		}
	}
}