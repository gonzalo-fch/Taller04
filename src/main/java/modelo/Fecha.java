package modelo;

import java.util.Date;

public class Fecha {
	private Date fecha;

	public Fecha() {
		Date fecha = new Date();
		this.fecha= fecha;
	}

	public Date getFecha() {
		return fecha;
	}
}