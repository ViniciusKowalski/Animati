package br.com.aula2;

import javax.swing.JOptionPane;

public class Exercício3Vetor {


	public static void main(String[] args) {

		int[] vetor = new int[4];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i]++;
			System.out.println(vetor[i]);
			
		}
		//JOptionPane.showMessageDialog(null, "A soma dos valores do vetor com " + contador + " índices é: " + soma);
	}

}