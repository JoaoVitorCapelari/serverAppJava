package br.com.lenovo.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Manutencao {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	@ManyToOne
	private Server server;
		
	//@PrePersist   ---> Poderia utilizar esse EntityListner ao invés do CallBack acima para gravar a data da última atualização 
	//@PreUpdate    ---> Para testar é só gravar uma manutenção sem data e verificar se o callback foi chamado
	//public void preAltera() {
	//System.out.println("Atualizando a data da manutencao");
	//this.setData(LocalDateTime.now());
	//}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public Server getServer() {
		return server;
	}
	public void setServer(Server server) {
		this.server = server;
	}
}
