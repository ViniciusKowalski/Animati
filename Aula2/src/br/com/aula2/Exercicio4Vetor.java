package br.com.aula2;

import javax.swing.JOptionPane;

public class Exercicio4Vetor {
	public static void main(String[] args) {

		int contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos do vetor?"));
		int[] vetor = new int[contador];
		int elementosPares = 0;
		int elementosImpares = 0;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + (i+1) + " :"));
			System.out.println("Vetor " + i + " :" + vetor[i]);
			if (vetor[i]%2 == 0) {
				elementosPares++;
			} else {
				elementosImpares++;
			}
		}
		JOptionPane.showMessageDialog(null, 
				"Número de elementos pares: " + elementosPares + "\n"
						+ "Número de elementos ímpares: " + elementosImpares);
	}
}
