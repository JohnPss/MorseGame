import java.util.*;


public class Date {
	
	static Random random = new Random();
	static Scanner scan = new Scanner(System.in);
	
    private static HashMap<String, String> morseKeys;
    
    static {
        morseKeys = new HashMap<String, String>();
        morseKeys.put("a", ".-");
        morseKeys.put("b", "-...");
        morseKeys.put("c", "-.-.");
        morseKeys.put("d", "-..");
        morseKeys.put("e", ".");
        morseKeys.put("f", "..-.");
        morseKeys.put("g", "--.");
        morseKeys.put("h", "....");
        morseKeys.put("i", "..");
        morseKeys.put("j", ".---");
        morseKeys.put("k", "-.-");
        morseKeys.put("l", ".-..");
        morseKeys.put("m", "--");
        morseKeys.put("n", "-.");
        morseKeys.put("o", "---");
        morseKeys.put("p", ".--.");
        morseKeys.put("q", "--.-");
        morseKeys.put("r", ".-.");
        morseKeys.put("s", "...");
        morseKeys.put("t", "-");
        morseKeys.put("u", "..-");
        morseKeys.put("v", "...-");
        morseKeys.put("w", ".--");
        morseKeys.put("x", "-..-");
        morseKeys.put("y", "-.--");
        morseKeys.put("z", "--..");
    }
    
    
     static void morseGame() {
    	
    	
    	String[] arrayDeKeys = morseKeys.keySet().toArray(new String[0]);
    	
    	
    		for (int e = 0; e<3; e++) {
    			int indexKeys = random.nextInt(arrayDeKeys.length);
    			String codigoMorse = morseKeys.get(arrayDeKeys[indexKeys]);
    			String letra = arrayDeKeys[indexKeys];
    			//System.out.println(letra);
    			
    			System.out.println("Qual letra é esta? " + codigoMorse);
    			String resposta = scan.next().toLowerCase();
    		
    			
    			if(resposta.equals(letra)) {
    				System.out.println("Parabens, você acertou.");
    				System.out.println("------------------------");
    			}else {
    				System.out.println("Opss, você errou, a resposta correta é: " + letra);
    				System.out.println("------------------------");
    			}
    		}	
    }
    // -----------------------------------------------------------------------------------------------
     static void escreverEmMorse() {
    	    System.out.println("Qual palavra você quer escrever em Morse? ");
    	    String frase = scan.next();

    	    char[] fraseArr = frase.toCharArray();
    	    String codigoMorse = "";
    	    
    	    System.out.println(fraseArr);

    	    for (char letra : fraseArr) {
    	        String codigo = morseKeys.get(Character.toString(letra));
    	        if (codigo != null) {
    	            codigoMorse += codigo;
    	        } 
    	    }

    	    //codigoMorse = codigoMorse.trim();
    	    System.out.println(codigoMorse);
    	}
	
}




 





/*
 * static void escreverEmMorse() {
    	 ArrayList<String> arrMorse = new ArrayList<String>();
    	
    	 System.out.println("Qual palavra voce quer escrever em Morse? ");
    	 String frase = scan.next();
    	 
    	 char[] fraseArr = new char[frase.length()];
    	 
    		 for (int i = 0; i < frase.length(); i++) {
    			 fraseArr[i] = frase.charAt[i];
    	    }
    		 
    		 for (char x : fraseArr) {
    		      arrMorse.add(morseKeys.get(x));
    		    }
    		 
    		 System.out.println(arrMorse);

    	 
     }
 */

