package br.com.empresa;

public class Equipe {
	private String nome;
	private String descricao;
	private Funcionario[]funcionario;
	private Projeto[] projeto;
	private Departamento departamento;
	
	
	public Equipe() {
		
	}



	public Equipe(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	

	public void print() {
		System.out.println("Nome: "+ this.nome);
		 System.out.println("Descricao:" +this.descricao);
		 System.out.println("Departamento,setor" +this.departamento.getSetor());
		 System.out.println("Funcionarios da Equipe");
		 for(Funcionario funcionario:funcionario);{
			 System.out.println(funcionario.length);
		 }
	}
	
	
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	public Funcionario[] getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}


	public Projeto[] getProjeto() {
		return projeto;
	}


	public void setProjeto(Projeto[] projeto) {
		this.projeto = projeto;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
