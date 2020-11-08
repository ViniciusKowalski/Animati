package br.com.aula2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2Lista {
	
	public static void main(String[] args) {

		int contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos do vetor?"));
		int soma = 0;
		List<int> vetor = new ArrayList<int>();

		for (int i = 0; i < contador.length; i++) {
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + i + " :"));
			System.out.println(vetor[i]);
			soma = soma + vetor[i];
			System.out.println("A soma dos elementos: " + soma);
		}
		
		JOptionPane.showMessageDialog(null,"A soma dos valores do vetor com " + contador + " índices é: " + soma);
	}
}
