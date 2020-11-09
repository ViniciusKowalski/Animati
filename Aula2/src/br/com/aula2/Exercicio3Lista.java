package br.com.aula2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio3Lista {

	public static void main(String[] args) {

		List<Integer> vetor = new ArrayList<Integer>();
		Integer contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos da lista?"));
		Integer elemento1 = 0;
		Integer ultimoElemento = contador - 1;

		for (int i = 0; i < contador; i++) {
			vetor.add(Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + (i+1) + " :")));
			System.out.println("Vetor " + i + " :" + vetor);
		}

		elemento1 = vetor.get(ultimoElemento);
		vetor.set(0, elemento1);
		System.out.println(vetor);
		System.out.println("O primeiro elemento passa a valer: " + vetor.get(0));
	}
}
