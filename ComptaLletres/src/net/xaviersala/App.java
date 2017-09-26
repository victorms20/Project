package net.xaviersala;

public class App {

	public static void main(String[] args) {
		String frase = "cantali a un ase i et contestara amb un pet";
		
		System.out.println("Hi ha una " 
		                    + frase.chars()
		                           .filter( c-> "aeiou".indexOf((char)c)!=-1)
		                           .count());		

	}

}
