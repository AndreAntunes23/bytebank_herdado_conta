package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		int a = 3;
		String nome = "Alura"; //object literal
		//String outro = new String("Alura");
		
		//String outra = nome.replace("A", "a");
		
		String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
		
	}

}