package vo;

import java.util.Objects;

public class Name{
	
	//atributos
	private String posicao;
	private String nome;
	private String telefone;
	
	//construtores
	public Name(String posicao, String nome, String telefone) {
		
		this.posicao = posicao;
		this.nome = nome;
		this.telefone = telefone;
	}
	public Name(String[]csv) {
		this.posicao = csv[0];
		this.nome = csv[1];
		this.telefone = csv[2];
		
	}
	
	//getset
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//chave
	@Override
	public int hashCode() {
		return Objects.hash(posicao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(posicao, other.posicao);
	}
	
	//to string
	
	@Override
	public String toString() {
		return posicao + "\t" + nome + "\t" +  telefone + "\n";
	}

	public String toCSV() {
		return posicao + ";" + nome + ";" + telefone + "\r\n";
	}
	
	public String toHTML() {
		return "<tr><td>" + posicao + "</td><td>" + nome + "</td><td>" + telefone + "</td></tr>";
	}
	
}


	
