package br.com.agenda.ini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.agenda.ini.model.Agenda;
import br.com.agenda.ini.service.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

	@Autowired
	private AgendaService agendaService;
	
	@GetMapping
	public List<Agenda> listaNome() {
	
			List<Agenda> con =  agendaService.findAll();
			return con;
	}

	@GetMapping(value = "/{data}")
	public List<Agenda> listaNome(@PathVariable String data) {

		if (data == null) {
			return agendaService.findAll();
			
		} else {	
			return agendaService.findByData(data);
		}

	}
	
	@PostMapping
	public Agenda create(@RequestBody Agenda agenda) {
		return agendaService.create(agenda);
		
	}
	
	@PutMapping(value = "/{id}")
	public Agenda alterar(@PathVariable Long id, @RequestBody(required = true) Agenda agenda) {
		return agendaService.alterar(id, agenda);
	}
	
	 @DeleteMapping(value= "/{id}") 
	 public void remover(@PathVariable Long id) { 
		 agendaService.remover(id);
	 }
}
