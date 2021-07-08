package br.com.agenda.ini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String compromisso;
	private String data;
	
	public Agenda(){}
	
	
	public Agenda(String compromisso, String data) {
		super();
		this.compromisso = compromisso;
		this.data = data;
	}


	public Agenda(Long id, String compromisso, String data) {
		super();
		this.id = id;
		this.compromisso = compromisso;
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompromisso() {
		return compromisso;
	}
	public void setCompromisso(String compromisso) {
		this.compromisso = compromisso;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compromisso == null) ? 0 : compromisso.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (compromisso == null) {
			if (other.compromisso != null)
				return false;
		} else if (!compromisso.equals(other.compromisso))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
