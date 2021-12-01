package modelo;

public class PersonaAfectada extends Persona {
	private Boolean estadoFallecido;
	private Boolean estadoHerido;
	private Boolean estadoDesaparecido;

	public PersonaAfectada(String nombre ,int edad,Boolean estadoFallecido, Boolean estadoHerido, Boolean estadoDesaparecido) {
		super(nombre,edad);
		this.estadoFallecido = estadoFallecido;
		this.estadoHerido = estadoHerido;
		this.estadoDesaparecido = estadoDesaparecido;
	}

	public Boolean getestadoFallecido() {
		return this.estadoFallecido;
	}
	public Boolean getestadoHerido() {
		return this.estadoFallecido;
	}

	public Boolean getestadoDesaparecido() {
		return this.estadoFallecido;
	}

}