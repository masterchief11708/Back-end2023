package bookscoffe.itb.bookstcc2g.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cardapio")

public class Cardapio {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento 
	private Long id;
		
	private String nome;
	private String categoria;
	private String Statusproduto;
	private String preco;
	private String descricao;
	private String foto;
	
	//setters e getters
	
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getStatusproduto() {
		return Statusproduto;
	}
	public void setStatusproduto(String statusproduto) {
		Statusproduto = statusproduto;
	}
	public void setCodStatusCardapio11(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void setCodStatusCardapio1(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void setCodStatusCardapio(boolean b) {
		// TODO Auto-generated method stub
		
	}
	

	
}

   


   