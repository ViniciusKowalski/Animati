package br.com.aula2;

import javax.swing.JOptionPane;

public class Exercício3Vetor {

	public static void main(String[] args) {

		int contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos do vetor?"));
		int[] vetor = new int[contador];
		int elemento1 = 0;
		int ultimoElemento = contador - 1;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + (i+1) + " :"));
			System.out.println("Vetor " + i + " :" + vetor[i]);
		}
		elemento1 = vetor[0];
		vetor[0] = vetor[ultimoElemento];
		System.out.println("O primeiro elemento que era " + elemento1 + " passa a valer: " + vetor[0]);
		//JOptionPane.showMessageDialog(null, "");
	}

}