package exemploProa;

import java.util.Scanner;

public class ExemploIfElseIfElse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite uma idade");
		
		int idade = sc.nextInt();
		
		if(idade<16) {
			System.out.println("Você não pode votar");
		}else
			System.out.println("O número digitado é maior que 18");

	}

}