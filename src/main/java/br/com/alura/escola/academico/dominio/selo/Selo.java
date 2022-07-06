package br.com.alura.escola.academico.dominio.selo;

import br.com.alura.escola.academico.dominio.aluno.CPF;

public class Selo {
	private CPF cpfDoAluno;
	private String nomeSelo;
	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}
	public String getNomeSelo() {
		return nomeSelo;
	}
	public Selo(CPF cpfDoAluno, String nomeSelo) {
		this.cpfDoAluno = cpfDoAluno;
		this.nomeSelo = nomeSelo;
	}
	

}
