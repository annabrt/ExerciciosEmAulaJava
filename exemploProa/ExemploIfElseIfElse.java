package exemploProa;

import java.util.Scanner;

public class ExemploIfElseIfElse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite uma idade");
		
		int idade = sc.nextInt();
		
		if(idade<16) {
			System.out.println("Voc� n�o pode votar");
		}else
			System.out.println("O n�mero digitado � maior que 18");

	}

}