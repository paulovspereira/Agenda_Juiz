package br.com.agenda.ini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import br.com.agenda.ini.model.Agenda;
import br.com.agenda.ini.repository.AgendaRespository;

@Service
public class AgendaService {

	@Autowired
	private AgendaRespository agendaRespository;

	
	public List<Agenda> findAll() {
		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();

		List<Agenda> con = agendaRespository.findAll();
		
		if(con == null || con.isEmpty()) {
			headers.add("Erro: ", "Não existem juízes.");
			return con;
		}
		return con;
	}

	public List<Agenda> findByData(String data) {
		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		
		List<Agenda> con = agendaRespository.findByData(data);
		
		if(con == null || con.isEmpty()) {
			headers.add("Erro: ", "Não existem datas para esse compromisso.");
			return con;
		}
		return con;
	}

	public Agenda create(Agenda agenda) {
		agendaRespository.save(new Agenda(agenda.getCompromisso(), agenda.getData()));
		return null;
		
	}

	public Agenda alterar(Long id, Agenda agenda) {
		
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();

		Agenda age = agendaRespository.getOne(id);
		
		if(age == null) {
			headers.add("Erro: ", "Não existem juízes.");
			return age;
		}
		
		  age.setCompromisso(agenda.getCompromisso()); 
		  age.setData(agenda.getData());
		
		return agendaRespository.save(age);
		 		
	}

	public ResponseEntity<Void> remover(Long id) {
			
	    agendaRespository.deleteById(id);
	
	     return null;
	 }

}

