package br.edu.univas.vo;

public class Secretaria {

	public void imprimeSituacao(Aluno aluno) {
		if (aluno.estaAprovado()) {
			System.out.println("O aluno est� aprovado");
		} else {
			System.out.println("O aluno est� reprovado");
		}
	}
	
}
