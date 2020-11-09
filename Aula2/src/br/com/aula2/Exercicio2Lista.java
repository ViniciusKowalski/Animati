package br.com.aula2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2Lista {
	
	public static void main(String[] args) {

		Integer contador = 0;
		Integer soma = 0;
		List<Integer> vetor = new ArrayList<Integer>();
		
		try {
		contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos do vetor?"));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < contador; i++) {
			try {
			vetor.add(Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + (i+1) + " :")));
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(vetor);
			soma += vetor.get(i);
			System.out.println("A soma dos elementos: " + soma);
		}
		
		JOptionPane.showMessageDialog(null,"A soma dos valores do vetor com " + contador + " índices é: " + soma);
	}
}