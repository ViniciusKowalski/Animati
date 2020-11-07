package br.com.aula;

import javax.swing.JOptionPane;

public class ContabilizaVoto {

	public static void main(String[] args) {
		int opcaoMesario = 0;
		int votoEleitor = 0;
		int contadorCandidato1 = 0;
		int contadorCandidato2 = 0;
		int contadorCandidato3 = 0;
		int contadorCandidato4 = 0;
		int contadorCandidato5 = 0;

		do {
			opcaoMesario = Integer.parseInt(JOptionPane.showInputDialog("Mesário digite a opção - 1) Iniciar voto do próximo eleitor, 2) Finalizar Votação"));
			// Integer.valueOf
			if (opcaoMesario == 1) {

				votoEleitor = Integer.parseInt(JOptionPane.showInputDialog("Codigo: 1\n"
						+ "Nome: Angela Pepino\n"
						+ "Partido: PMDB\n"
						+ "\n"
						+ "Codigo: 2\n"
						+ "Nome: Gean da Silva\n"
						+ "Partido: PT\n"
						+ "\n"
						+ "Codigo: 3\n"
						+ "Nome: Cesar Souza Neto\n"
						+ "Partido: DEM\n"
						+ "\n"
						+ "Codigo: 4\n"
						+ "Voto Nulo\n"
						+ "\n"
						+ "Codigo: 5\n"
						+ "Voto em Branco\n"
						+ "\n"
						+ "Eleitor, em quem você deseja votar: "));

				if (votoEleitor == 1) {
					contadorCandidato1++;
				} else if (votoEleitor == 2){
					contadorCandidato2++;
				} else if(votoEleitor == 3) {
					contadorCandidato3++;
				}else if(votoEleitor == 4) {
					contadorCandidato4++;
				} else {
					contadorCandidato5++;
				}
			} else if (opcaoMesario == 2) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, digite uma opção válida!");
			}

		}
		while(opcaoMesario!=2);

		JOptionPane.showMessageDialog(null, "Codigo: 1\n"
				+ "Nome: Angela Pepino\n"
				+ "Partido: PMDB\n"
				+ "Total de votos: " + contadorCandidato1 + "\n"
				+ "\n"
				+ "Codigo: 2\n"
				+ "Nome: Gean da Silva\n"
				+ "Partido: PT\n"
				+ "Total de votos: " + contadorCandidato2 + "\n"
				+ "\n"
				+ "Codigo: 3\n"
				+ "Nome: Cesar Souza Neto\n"
				+ "Partido: DEM\n"
				+ "Total de votos: " + contadorCandidato3 + "\n"
				+ "\n"
				+ "Codigo: 4\n"
				+ "Voto Nulo\n"
				+ "Total de votos: " + contadorCandidato4 + "\n"
				+ "\n"
				+ "Codigo: 5\n"
				+ "Voto em Branco\n"
				+ "Total de votos: " + contadorCandidato5 + "\n"
				+ "\n"
				+ "Total de eleitores que votaram: " + (contadorCandidato1 + contadorCandidato2 + contadorCandidato3 + contadorCandidato4 + contadorCandidato5));
	}

}
