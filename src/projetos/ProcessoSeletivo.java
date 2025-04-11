package projetos;

import java.util.Scanner;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Processo seletivo");
		
		double salarioPretendido = sc.nextDouble();
		analisarCandidato(salarioPretendido);
		salarioPretendido = sc.nextDouble();
		analisarCandidato(salarioPretendido);
		salarioPretendido = sc.nextDouble();
		analisarCandidato(salarioPretendido);
		
		sc.close();

	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
	}

}
