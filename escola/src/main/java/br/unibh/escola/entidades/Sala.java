package br.unibh.escola.entidades;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TB_SALA")
@NamedQueries({ @NamedQuery(name = "Sala.findByCapacidade", query = "select s from Sala s where s.capacidade >= :capacidade") })
public class Sala {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name = "codigo", length = 10, nullable = false, unique = true)
	private String codigo;

	@NotNull
	@Column(name = "capacidade", nullable = false)
	private int capacidade;


	@Column(name="possuiQuadroBranco", nullable=true) 
	private boolean possuiQuadroBranco;

	@Column(name="possuiDataShow", nullable=true)
	private boolean possuiDataShow;

	@Column(name="possuiComputador", nullable=true)
	private boolean possuiComputador;

	@Column(name = "observacao", length = 255, nullable = true)
	private String observacao;

	@Column(name="status", nullable=true)
	private int status;

	@Column(name="dataTerminoManutencao", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date dataTerminoManutencao;

	public Sala(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public boolean ispossuiQuadroBranco() {
		return possuiQuadroBranco;
	}

	public void setpossuiQuadroBranco(boolean possuiQuadroBranco) {
		this.possuiQuadroBranco = possuiQuadroBranco;
	}

	public boolean ispossuiDataShow() {
		return possuiDataShow;
	}

	public void setpossuiDataShow(boolean possuiDataShow) {
		this.possuiDataShow = possuiDataShow;
	}

	public boolean getPossuiComputador() {
		return possuiComputador;
	}

	public void setPossuiComputador(boolean possuiComputador) {
		this.possuiComputador = possuiComputador;
	}

	public String getobservacao() {
		return observacao;
	}

	public void setobservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getstatus() {
		return status;
	}

	public void setstatus(int status) {
		this.status = status;
	}

	public Date getdataTerminoManutencao() {
		return dataTerminoManutencao;
	}

	public void setdataTerminoManutencao(Date dataTerminoManutencao) {
		this.dataTerminoManutencao = dataTerminoManutencao;
	}
}
