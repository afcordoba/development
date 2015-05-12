package dm.planesdiarios.dao;

public class Usuario {
	
	private String clave;
	private String nombre;
	private int id_encargado;
	private String campaña;
	public String getCampaña() {
		return campaña;
	}
	public void setCampaña(String campaña) {
		this.campaña = campaña;
	}
	private String sociedad;
	private String sector;
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_encargado() {
		return id_encargado;
	}
	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}
	public String getSociedad() {
		return sociedad;
	}
	public void setSociedad(String sociedad) {
		this.sociedad = sociedad;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
}
