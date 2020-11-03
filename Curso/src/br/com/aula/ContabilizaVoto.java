package br.com.aula;

import javax.swing.JOptionPane;

public class ContabilizaVoto {

	public static void main(String[] args) {
		int opcaoMesario = 0;
		int votoEleitor = 0;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		
		do {
			opcaoMesario = Integer.parseInt(JOptionPane.showInputDialog("Mesário digite a opção - 1) Iniciar voto do próximo eleitor, 2) Finalizar Votação"));
			
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
					contador1++;
				} else if (votoEleitor == 2){
					contador2++;
				} else if(votoEleitor == 3) {
					contador3++;
				}else if(votoEleitor == 4) {
					contador4++;
				} else {
					contador5++;
				}
			
		}
		while(opcaoMesario!=2);
		
		JOptionPane.showMessageDialog(null, "Codigo: 1\n"
				+ "Nome: Angela Pepino\n"
				+ "Partido: PMDB\n"
				+ "Total de votos: " + contador1 + "\n"
				+ "\n"
				+ "Codigo: 2\n"
				+ "Nome: Gean da Silva\n"
				+ "Partido: PT\n"
				+ "Total de votos: " + contador2 + "\n"
				+ "\n"
				+ "Codigo: 3\n"
				+ "Nome: Cesar Souza Neto\n"
				+ "Partido: DEM\n"
				+ "Total de votos: " + contador3 + "\n"
				+ "\n"
				+ "Codigo: 4\n"
				+ "Voto Nulo\n"
				+ "Total de votos: " + contador4 + "\n"
				+ "\n"
				+ "Codigo: 5\n"
				+ "Voto em Branco\n"
				+ "Total de votos: " + contador5 + "\n"
				+ "\n"
				+ "Total de eleitores que votaram: " + (contador1 + contador2 + contador3 + contador4 + contador5));
	}

}
