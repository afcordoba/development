package dm.planesdiarios.dao;

import java.math.BigDecimal;

public class RegistroLluvia {
	private int id_encargado;
	private String fecha;
	private BigDecimal milimetros;
	private String lote;
	private String campo;
	private String localidad;
	private String zona;
	private BigDecimal geo_latitud;
	private BigDecimal geo_longitud;

	public int getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMilimetros() {
		return milimetros;
	}

	public void setMilimetros(BigDecimal milimetros) {
		this.milimetros = milimetros;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public BigDecimal getGeo_latitud() {
		return geo_latitud;
	}

	public void setGeo_latitud(BigDecimal geo_latitud) {
		this.geo_latitud = geo_latitud;
	}

	public BigDecimal getGeo_longitud() {
		return geo_longitud;
	}

	public void setGeo_longitud(BigDecimal geo_longitud) {
		this.geo_longitud = geo_longitud;
	}
}
