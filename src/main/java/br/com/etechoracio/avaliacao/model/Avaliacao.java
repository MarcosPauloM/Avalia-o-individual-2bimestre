package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="software")
public class Avaliacao extends BaseORM{

	@Id
	@GeneratedValue
	@Column(name="Id")
	private Long id;
	
	@Column(name="tit")
	private String titulo;
	
	@Column(name="emp")
	private String Empresa;
	
	@Column(name="tip")
	private String tipo;
	
	@Column(name="chave")
	private int chave;
	
	@Column(name="lic")
	private String Licenças;
	
}
