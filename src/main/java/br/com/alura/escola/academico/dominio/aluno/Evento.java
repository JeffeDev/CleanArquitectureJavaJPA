package br.com.alura.escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

public abstract class Evento {
	protected void reageAo(Evento evento) {
		
	}
	protected boolean deveProcessar(Evento evento) {
		return false;
	}
	public DateTimeFormatter momento() {
		// TODO Auto-generated method stub
		return null;
	}
}
