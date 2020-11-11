package br.com.animati;

import java.util.List;
import java.util.ArrayList;

public class PacienteCrudImpl implements PacienteCrud {
	
	private ArrayList<Paciente> pacientes;
	
	public ArrayList<Paciente> getPaciente() {
		return pacientes;
	}
	
	public PacienteCrudImpl() {
		this.pacientes = new ArrayList<Paciente>();
	}

	@Override
	public void add(Paciente p) {
		 pacientes.add(p);
	}

	@Override
	public void edit(Paciente p) {
		Paciente pacienteEditar = findById(p.getIdPaciente());
		
		if (pacienteEditar != null) {
			pacienteEditar.setEmpresa(p.getEmpresa());
			pacienteEditar.setNome(p.getNome());
			pacienteEditar.setNomeSocial(p.getNomeSocial());
			pacienteEditar.setNomeMae(p.getNomeMae());
			pacienteEditar.setCpf(p.getCpf());
			pacienteEditar.setPassword(p.getPassword());
			pacienteEditar.setRg(p.getRg());
			pacienteEditar.setSexo(p.getSexo());
			pacienteEditar.setDataNacimento(p.getDataNacimento());
			pacienteEditar.setCep(p.getCep());
			pacienteEditar.setEndereço(p.getEndereço());
			pacienteEditar.setNumero(p.getNumero());
			pacienteEditar.setComplemento(p.getComplemento());
			pacienteEditar.setBairro(p.getBairro());
			pacienteEditar.setMunicipio(p.getMunicipio());
			pacienteEditar.setProfissao(p.getProfissao());
			pacienteEditar.setNacionalidade(p.getNacionalidade());
			pacienteEditar.setEmail(p.getEmail());
			pacienteEditar.setTelefone(p.getTelefone());
			pacienteEditar.setTelefoneCelular(p.getTelefoneCelular());
			pacienteEditar.setTelefoneTrabalho(p.getTelefoneTrabalho());
			pacienteEditar.setPatid(p.getPatid());
			pacienteEditar.setCartaoSus(p.getCartaoSus());
			
		} else {
			System.out.println("Por favor, verifique o Id do paciente.");
		}
	}
	
	@Override
	public List<Paciente> list() {
		return pacientes;
	}

	@Override
	public void delete(long idPaciente) {
		Paciente pacienteExcluir = findById(idPaciente);
		
		if(pacienteExcluir != null) {
			pacientes.remove(pacienteExcluir);
		} else {
			System.out.println("Por favor, verifique o Id do paciente.");
		}
	}

	@Override
	public Paciente findById(long idPaciente) {
		
		Paciente pacienteLocalizar;
		
		for (int i = 0; i < pacientes.size(); i++) {
			pacienteLocalizar = pacientes.get(i);
			if (pacienteLocalizar.getIdPaciente() == idPaciente) {
				return pacienteLocalizar;
			}
		}
		
		return null;
	}

}