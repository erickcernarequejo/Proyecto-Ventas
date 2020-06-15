package com.cerna.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@ManyToOne // FK
	@JoinColumn(name = "id_persona", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_persona"))
	private Persona persona;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;
	
	@Positive(message = "Debe ingresar un importe mayor a 0")
	@Column(name = "importe", nullable = false)
	private Double importe;
	
	@Size(min = 1, message = "Debe ingresar al menos un detalle")
	@OneToMany(mappedBy = "venta", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<DetalleVenta> detalleVenta;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public List<DetalleVenta> getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
		this.detalleVenta = detalleVenta;
	}
	
	

}
