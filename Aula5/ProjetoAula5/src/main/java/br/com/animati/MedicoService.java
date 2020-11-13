package br.com.animati;

import java.util.List;

public interface MedicoService {

	public void add(Medico m) throws Exception;
	public void edit(Medico m);
	public List<Medico> list();
	public void delete(long idMedico);
	public Medico findById(long idMedico);
	public Medico findMedicoByCrm(String crm);
	public Medico findMedicoByCrmAndEstado(String crm);
	public Medico findMedicoByExecutor();
	public Medico findMedicoByProvisorio();


}
