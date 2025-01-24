package org.sid.cinema.web;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class TicketFrom {
    private String nomClient;
    private int codePayement;
    private List<Long> tickets = new ArrayList<>();
    
	public TicketFrom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketFrom(String nomClient, int codePayement, List<Long> tickets) {
		super();
		this.nomClient = nomClient;
		this.codePayement = codePayement;
		this.tickets = tickets;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public int getCodePayement() {
		return codePayement;
	}

	public void setCodePayement(int codePayement) {
		this.codePayement = codePayement;
	}

	public List<Long> getTickets() {
		return tickets;
	}

	public void setTickets(List<Long> tickets) {
		this.tickets = tickets;
	}
    
}

