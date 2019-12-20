
package br.com.fis.model;


public class Gerente extends Empregado {
		long cpfGerente;
	public Gerente(String nome, String nomedepart, long cpf, int ID) {
		super(nome, nomedepart, cpf, ID);
		this.cpfGerente=cpf;
	}
    
	public void DevolveGerente(String nome,long cpf) {
		this.cpfGerente=cpf;
		System.out.println("O nome do gerente do departamento é "+nome+"\nE o seu CPF é"+cpfGerente);
	}
}
