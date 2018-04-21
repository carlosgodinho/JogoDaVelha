import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int jogada;
		String jogador;
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		String e = "";
		String f = "";
		String g = "";
		String h = "";
		String i = "";
		int contador = 0;
		int testa = 1;
		int venceu=0;

		
		System.out.println("Vamos começar o jogo!");
		System.out.println("Escolha qual começa x ou o?");
		jogador = entrada.next();
		while (contador < 9 && venceu ==0) { // while para empate ou vitória

			while (testa == 1) { // while para testar a entrada
				System.out.println("Escolha onde deseja jogar:\n"
								+ "" + "1	2	3\n"
								+ "" + "4 	5	6\n"
								+ "" + "7	8	9");
				jogada = entrada.nextInt();
				switch (jogada) {
				case 1:
					if (a == "") {
						testa = 0;
						a = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 2:
					if (b == "") {
						testa = 0;
						b = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 3:
					if (c == "") {
						testa = 0;
						c = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 4:
					if (d == "") {
						testa = 0;
						d = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 5:
					if (e == "") {
						testa = 0;
						e = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 6:
					if (f == "") {
						testa = 0;
						f = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 7:
					if (g == "") {
						testa = 0;
						g = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 8:
					if (h == "") {
						testa = 0;
						h = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				case 9:
					if (i == "") {
						testa = 0;
						i = jogador;
					} else {
						testa = 1;
						System.out.println("Já escolhido, escolha outro local\n");
					}
					break;
				}
			}
			System.out.println("Jogo atual:\n" // mostrar o jogo em andamento
					+ a + " " + b + " " + c + "\n"
					+ d + " " + e + " " + f + "\n"
					+ g + " " + h + " " + i+"\n");
			contador++;
			testa = 1;
			//ifs para determinar o vencedor
			if (a != "" && a.intern() == b.intern() && a.intern() == c.intern()) {
				System.out.println("Parabéns "+a.toUpperCase()+" venceu");
				venceu = 1;
			}	
			else if (d != "" && d.intern() == e.intern() && d.intern() == f.intern()) {
				System.out.println("Parabéns "+d.toUpperCase()+" venceu");
				venceu = 1;
			}
			 else if (g != "" && g.intern() == h.intern() && g.intern() == i.intern()) {
				System.out.println("Parabéns "+g.toUpperCase()+" venceu");
				venceu = 1;
			}
			else if (a != "" && a.intern() == d.intern() && a.intern() == g.intern()) {
				System.out.println("Parabéns "+a.toUpperCase()+" venceu");
				venceu = 1;
			}
			else if (b != "" && b.intern() == e.intern() && b.intern() == h.intern()) {
				System.out.println("Parabéns "+b.toUpperCase()+" venceu");
				venceu = 1;
			}
			else if (c != "" && c.intern() == f.intern() && c.intern() == i.intern()) {
				System.out.println("Parabéns "+c.toUpperCase()+" venceu");
				venceu = 1;
			}
			else if (a != "" && a.intern() == e.intern() && a.intern() == i.intern()) {
				System.out.println("Parabéns "+a.toUpperCase()+" venceu");
				venceu = 1;
			}
			else if (c != "" && c.intern() == e.intern() && c.intern() == g.intern()) {
				System.out.println("Parabéns "+c.toUpperCase()+" venceu");
				venceu = 1;
			}
			jogador = jogador == "o" ? "x":"o"; // mudar o jogador}
		
			
		if ( contador == 9) { //if em caso de empate
			System.out.println("Empate");
			
		}

		System.out.println("\nFim da partida!");
	}
}