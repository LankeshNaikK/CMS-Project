package org.sid.cinema.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity

public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String name;
    private int nombrePlace;
    @ToString.Exclude
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cinema cinema;
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "salle", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Collection<Place> places;
    @ToString.Exclude
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "salle", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Collection<Projection> projections;
    
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(Long id, String name, int nombrePlace, Cinema cinema, Collection<Place> places,
			Collection<Projection> projections) {
		super();
		this.id = id;
		this.name = name;
		this.nombrePlace = nombrePlace;
		this.cinema = cinema;
		this.places = places;
		this.projections = projections;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public Collection<Place> getPlaces() {
		return places;
	}

	public void setPlaces(Collection<Place> places) {
		this.places = places;
	}

	public Collection<Projection> getProjections() {
		return projections;
	}

	public void setProjections(Collection<Projection> projections) {
		this.projections = projections;
	}
    
}
