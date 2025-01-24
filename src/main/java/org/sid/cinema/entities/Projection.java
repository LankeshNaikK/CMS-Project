package org.sid.cinema.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity

public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDeProjection;
    private double prix;
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private Film film;
    @OneToMany(mappedBy = "projection", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Collection<Ticket> tickets;
    @ManyToOne
    private Seance seance;
    
	public Projection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projection(Long id, Date dateDeProjection, double prix, Salle salle, Film film, Collection<Ticket> tickets,
			Seance seance) {
		super();
		this.id = id;
		this.dateDeProjection = dateDeProjection;
		this.prix = prix;
		this.salle = salle;
		this.film = film;
		this.tickets = tickets;
		this.seance = seance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateDeProjection() {
		return dateDeProjection;
	}

	public void setDateDeProjection(Date dateDeProjection) {
		this.dateDeProjection = dateDeProjection;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Collection<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(Collection<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}
    
}
