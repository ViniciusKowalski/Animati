package br.com.aula2;

import javax.swing.JOptionPane;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		
		int contador = 0;
		int soma = 0;
		int[] vetor = new int[contador];
		
		try {
		contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos do vetor?"));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + i + " :"));
			System.out.println(vetor[i]);
			soma += vetor[i];
			System.out.println("A soma dos elementos: " + soma);
		}
		JOptionPane.showMessageDialog(null,"A soma dos valores do vetor com " + contador + " índices é: " + soma);
	}

}