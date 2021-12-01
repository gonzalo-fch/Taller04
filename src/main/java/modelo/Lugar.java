package modelo;

public class Lugar {
	private String pais;
	private String ciudad;
	private String latitud;
	private String longitud;

	public Lugar(String pais, String ciudad, String latitud, String longitud) {
		this.pais = pais;
		this.ciudad = ciudad;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
}