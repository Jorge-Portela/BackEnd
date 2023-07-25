package br.com.bytebank.banco.modelo;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
