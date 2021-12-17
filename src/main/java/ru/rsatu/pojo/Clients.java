package ru.rsatu.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="clients")
public class Clients {
	@Id
	@SequenceGenerator(name = "clientSeq", sequenceName = "client_id_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "clientSeq")
	private Long clientID;
	private String name;
	private String contacts;
	public Long getclientID() {
		return clientID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
}
