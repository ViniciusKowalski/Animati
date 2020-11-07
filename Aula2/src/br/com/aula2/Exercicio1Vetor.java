package br.com.aula2;

import javax.swing.JOptionPane;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		String[] vetor = new String[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog(null, "digite o nome");
		}

		int m = Integer.valueOf(JOptionPane.showInputDialog(null, "qual posicao vc quer ler"));

		System.out.println(vetor[m]);

	}

}