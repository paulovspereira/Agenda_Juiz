package br.com.agenda.ini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.ini.model.Agenda;

@Repository
public interface AgendaRespository extends JpaRepository<Agenda, Long> {

	List<Agenda> findByData(String nome);

	Agenda findByCompromisso(String compromisso);

}
