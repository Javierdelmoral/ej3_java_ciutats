import java.util.*;

public class Fase4_prueba {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] city;
		
		city = new String [6];
		
			city[0]= "";
			city[1]= "";
			city[2]= "";
			city[3]= "";
			city[4]= "";
			city[5]= "";
			
				
	System.out.println("Introdueix el nom d'una ciutat:");
	
    Scanner input = new Scanner(System.in);
	
    for(int x=0;x<city.length;x++) {
    	
    	city[x] = input.next().toLowerCase();
    	
		char cityChar[] = city[x].toCharArray();

    	
    		System.out.println(city[x].toCharArray());
    		
    	
    	for (int i = cityChar.length-1; i >= 0 ; i--){
    	    	
    	    System.out.print(cityChar[i]);
    	   // System.out.print("\n");
    	    	
    	    }
        System.out.println("");

    		
    	}

    }
    
}
