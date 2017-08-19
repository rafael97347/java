package main;

import br.com.empresa.Departamento;
import br.com.empresa.Dependente;
import br.com.empresa.Equipe;
import br.com.empresa.Funcionario;
import br.com.empresa.Projeto;

public class Principal {

	public static void main(String[] args) {
		Funcionario F= new Funcionario(1,"Rafael de lima","r.delimadosreis@gmail.com",1500);
		Equipe E = new Equipe("Alpha", "Analisar");
		Dependente D = new Dependente("Isadora de Lima","Filha");
		Projeto P = new Projeto();
		Departamento DP = new Departamento("Gestão","Batman");
		
		
		
		F.setEquipe(E);
		F.setDependente(new Dependente[] {D});
		
		E.setProjeto(new Projeto[] {P});
		E.setDepartamento(DP);
		E.setFuncionario(new Funcionario[] {F});
		
	
		
		
		F.print();
		E.print();
		DP.print();
		D.print();
		P.print();
		
		
		
		
	}

}
