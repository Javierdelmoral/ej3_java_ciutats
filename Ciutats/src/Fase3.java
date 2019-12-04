import java.util.*;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city1 = "";
		String city2 = "";
		String city3 = "";
		String city4 = "";
		String city5 = "";
		String city6 = "";
			
	System.out.println("Introdueix el nom d'una ciutat:");
	
	Scanner input = new Scanner(System.in);
	
		city1 = input.nextLine().toLowerCase();
		city2 = input.nextLine().toLowerCase();
		city3 = input.nextLine().toLowerCase();
		city4 = input.nextLine().toLowerCase();
		city5 = input.nextLine().toLowerCase();
		city6 = input.nextLine().toLowerCase();
	
	String arrayCitiesModified [] = {city1, city2, city3, city4, city5, city6};
	
	Arrays.sort(arrayCitiesModified);
	
	System.out.println("Ciutats ordenades alfabéticament: ");
	
	  for (String i : arrayCitiesModified) {
		  
          System.out.print(i + ", ");
          
	  }

			

	}
}
