package br.com.zup.exercicio.um;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {
		
		// Iniciando Scanner
		Scanner scan = new Scanner(System.in);
		
		// Gerando numero aleatorio
		Random random = new Random();
		int sorteado = random.nextInt(51);

		int vidas = 10;
		int numeroUsuario;
		boolean vitoria = false;
		
		// Verificação
		while (vidas > 0 && vitoria == false) {
			System.out.println("Entre 0 e 50, qual número quer dar como palpite?");
			numeroUsuario = scan.nextInt();
			if (numeroUsuario != sorteado) {
				System.out.println("Errou");
				vidas--;
				System.out.println("Vidas = " + vidas);
			} else {
				System.out.println("Parabéns você acertou!");
				vitoria = true;
			}
		}
		
		if (vidas == 0) {
			System.out.println("Você morreu!");
		}
		scan.close();
		
		
	}

}
