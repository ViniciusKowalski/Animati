package br.com.aula2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio1Lista {

	public static void main(String[] args) {
		//String[] vetor = new String[10];
		List<String> vetor = new ArrayList<String>(); // porem sem tamanho fixo

		for (int i = 0; i < 5; i++) {
			vetor.add("NOME " + i);
		}

		int m = Integer.valueOf(JOptionPane.showInputDialog(null, "Qual posicao vc quer ler?"));

		System.out.println(vetor.get(m));
	}

}
