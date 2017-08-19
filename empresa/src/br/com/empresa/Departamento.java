package br.com.empresa;

public class Departamento {
	private String setor;
	private String nomeFantasia;
	

	public Departamento() {
	}
	
	public Departamento(String setor, String nomeFantasia) {
		
		this.setor = setor;
		this.nomeFantasia = nomeFantasia;
	}
	public void print() {
		System.out.println("Setor:" +this.setor);
		System.out.println("Nome da Fantasia: " +this.nomeFantasia);
	}
	
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
	
	
	
	

}
