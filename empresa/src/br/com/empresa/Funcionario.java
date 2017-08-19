package br.com.empresa;

public class Funcionario {
	private int matricula;
	private  String nome;
	private String email;
	private float salario;
	private Equipe equipe;
	private Dependente[] dependente;
	
	
	public Funcionario(int matricula, String nome, String email, float salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	

	public Funcionario() {
		
	}
	
	public void print() {
		 System.out.println("Matricula:" +this.matricula);
		 System.out.println("nome: " +this.nome);
		 System.out.println("Email:" +this.email);
		 System.out.println("Salario: "+this.salario);
		 if(this.equipe !=null)
		 System.out.println("Equipe participante:" +this.equipe.getNome());
		 else
			 System.out.println("Funcionario não está em nenhuma equipe");
		 
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public  String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}



	public Equipe getEquipe() {
		return equipe;
	}



	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}



	public Dependente[] getDependente() {
		return dependente;
	}



	public void setDependente(Dependente[] dependente) {
		this.dependente = dependente;
	}
	
	
	
	

}
