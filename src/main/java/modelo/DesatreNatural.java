package modelo;

import java.util.ArrayList;
import modelo.Lugar;
import modelo.PersonaAfectada;

public class DesatreNatural {
	private int personasAfectadas;
	private int impactoEconomico;
	public Fecha Fecha;
	public ArrayList<Lugar> lugaresAfectados = new ArrayList<Lugar>();
	public ArrayList<PersonaAfectada> personasAfectada = new ArrayList<PersonaAfectada>();

	public DesatreNatural(int personasAfectadas, int impactoEconomico, Fecha Fecha, ArrayList<Lugar> lugaresAfectados, ArrayList<PersonaAfectada> personasAfectadas1) {
		Fecha fecha = new Fecha();
		this.personasAfectadas = personasAfectadas;
		this.impactoEconomico = impactoEconomico;
		this.Fecha = Fecha;
		this.lugaresAfectados = lugaresAfectados;
		this.personasAfectada = personasAfectadas1;
	}
	public PersonaAfectada agregarPersonaAfectada(String nombre ,int edad,Boolean estadoFallecido, Boolean estadoHerido, Boolean estadoDesaparecido ) {
		PersonaAfectada personaAfectada = new PersonaAfectada(nombre, edad,estadoFallecido,estadoHerido,estadoDesaparecido);
		this.personasAfectada.add(personaAfectada);
		return personaAfectada;
	}
	public Lugar agregarLugarAfectado(String pais, String ciudad, String latitud, String longitud ) {
		Lugar lugarAfectado = new Lugar(pais,ciudad,latitud,longitud);
		this.lugaresAfectados.add(lugarAfectado);
		return lugarAfectado;
	}
	public void visualizarLugarAfectado() {
		for (int i =0 ; i <lugaresAfectados.size(); i++){
			System.out.println("["+lugaresAfectados.get(i).getPais()+"]");
			System.out.println("["+lugaresAfectados.get(i).getCiudad()+"]");
			System.out.println("["+lugaresAfectados.get(i).getLatitud()+"]");
			System.out.println("["+lugaresAfectados.get(i).getLongitud()+"]");
		}
	}

	public void listaDesaparecidos() {
		throw new UnsupportedOperationException();
	}

	public void actualizarListaDesaparecidos() {
		throw new UnsupportedOperationException();
	}

	public DesatreNatural() {
		throw new UnsupportedOperationException();
	}

	public int getImpactoEconomico() {
		return this.impactoEconomico;
	}

	public void setImpactoEconomico(int impactoEconomico) {
		this.impactoEconomico = impactoEconomico;
	}

	public int getPersonasAfectadas() {
		return this.personasAfectadas;
	}

	public void setPersonasAfectadas(int personasAfectadas) {
		this.personasAfectadas = personasAfectadas;
	}
}