package br.com.empresa;

public class Dependente {
	private String nome;
	private String filiacao;
	private Funcionario funcionario;
	
	
	
	
	
	
	public Dependente() {
	}
	public Dependente(String nome, String filiacao) {
		this.nome = nome;
		this.filiacao = filiacao;
	}
	
	public void print() {
		System.out.println("Nome do Dependente: "+this.nome);
		System.out.println("Grau de Parentesco: " +this.filiacao);
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	

}
