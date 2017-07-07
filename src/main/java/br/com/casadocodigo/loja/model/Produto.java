package br.com.casadocodigo.loja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProduto;

	private String titulo;
	private String descricao;
	private Integer paginas;
	
	@Override
	public String toString() {
		return "Produto: [ Título: " + titulo + "Descrição: " + descricao + "Páginas: " + paginas + "]" ;
	}
	
	public Produto() {
		
	}
	

	public Produto(String titulo, String descricao, Integer paginas) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.paginas = paginas;
	}

	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	
	
}
