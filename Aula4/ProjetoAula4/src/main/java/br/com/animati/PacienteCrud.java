package br.com.animati;

import java.awt.List;

public interface PacienteCrud {
	
	public void add(Paciente p);
	public void edit(Paciente p);
	public List list(Paciente p);
	public void delete(long idPaciente);
	public Paciente findById(long idPaciente);
	
}