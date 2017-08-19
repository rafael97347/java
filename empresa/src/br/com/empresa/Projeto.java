package br.com.empresa;

import java.time.LocalDate;

public class Projeto {
private int codigo;
private LocalDate dataInicioProgeto;
private LocalDate dataEmtrega;
private Equipe equipe;


public Projeto() {
}

public Projeto(int codigo, LocalDate dataInicioProgeto, LocalDate dataEmtrega, Equipe equipe) {
	this.codigo = codigo;
	this.dataInicioProgeto = dataInicioProgeto;
	this.dataEmtrega = dataEmtrega;
	this.equipe = equipe;
}


public void print() {
	System.out.println("Codigo: "+ this.codigo);
	System.out.println("Inicio: " + this.dataInicioProgeto);
	System.out.println("Entrega:" + this.dataEmtrega);
}


public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public LocalDate getDataInicioProgeto() {
	return dataInicioProgeto;
}
public void setDataInicioProgeto(LocalDate dataInicioProgeto) {
	this.dataInicioProgeto = dataInicioProgeto;
}
public LocalDate getDataEmtrega() {
	return dataEmtrega;
}
public void setDataEmtrega(LocalDate dataEmtrega) {
	this.dataEmtrega = dataEmtrega;
}



public Equipe getEquipe() {
	return equipe;
}


public void setEquipe(Equipe equipe) {
	this.equipe = equipe;
}

	
}





