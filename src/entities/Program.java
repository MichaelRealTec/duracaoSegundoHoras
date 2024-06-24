package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 Problema "duracao"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/duracao.java
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos.
Exemplo 1:
Digite a duracao em segundos: 300
0:5:0
Exemplo 2:
Digite a duracao em segundos: 12506
3:28:26
Exemplo 3:
Digite a duracao em segundos: 140811
39:6:51
		 */
		// Resolução simples
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Variáveis
		
		int qtdSegundos, horas, minutos, segundos, resto;
		
		System.out.print("Digite a duração em segundos: ");
		qtdSegundos = sc.nextInt();
		
		horas = qtdSegundos / 3600;
		resto = qtdSegundos % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
		sc.close();
	}

}
