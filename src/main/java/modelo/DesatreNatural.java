package modelo;

import java.util.ArrayList;
import modelo.Lugar;
import modelo.PersonaAfectada;

public class DesatreNatural {
	private int personasAfectadas;
	private int impactoEconomico;
	public Fecha unnamed_Fecha_;
	public ArrayList<Lugar> lugaresAfectados = new ArrayList<Lugar>();
	public ArrayList<PersonaAfectada> personasAfectadas = new ArrayList<PersonaAfectada>();

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