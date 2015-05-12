package dm.planesdiarios.dao;

public class PlantaPorEncargado {
	private int id_encargado;
	private String campania;
	private String cod_planta;
	private String desc_planta;
	public int getId_encargado() {
		return id_encargado;
	}
	public void setId_encargado(int id_encargado) {
		this.id_encargado = id_encargado;
	}
	public String getCampania() {
		return campania;
	}
	public void setCampania(String campania) {
		this.campania = campania;
	}
	public String getCod_planta() {
		return cod_planta;
	}
	public void setCod_planta(String cod_planta) {
		this.cod_planta = cod_planta;
	}
	public String getDesc_planta() {
		return desc_planta;
	}
	public void setDesc_planta(String desc_planta) {
		this.desc_planta = desc_planta;
	}

}
