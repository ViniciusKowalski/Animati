package br.com.aula2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio4Lista {
	public static void main(String[] args) {

		List<Integer> vetor = new ArrayList<Integer>();
		Integer contador = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual o número de elementos do vetor?"));
		Integer elementosPares = 0;
		Integer elementosImpares = 0;

		for (int i = 0; i < contador; i++) {
			vetor.add(Integer.valueOf(JOptionPane.showInputDialog(null, "Digite o elemento da posição " + (i+1) + " :")));
			System.out.println("Vetor " + i + " :" + vetor);
			if (vetor.get(i) % 2 == 0) {
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
