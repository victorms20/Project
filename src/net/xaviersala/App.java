package net.xaviersala;

public class App {

	public static void main(String[] args) {
		String frase = "Cantali a un ase i et contestara amb un pet";
		
		System.out.println("Hi ha" 
		                    + frase.chars()
		                           .filter( c-> "aeiou".indexOf((char)c)!=-1)
		                           .count());		

	}

}
