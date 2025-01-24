package org.sid.cinema.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Cinema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    @NotNull
    @Size(min=1,max = 29)
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    @NotNull
    @Min(0)
    private int nombreSalles;
    @ToString.Exclude
    @OneToMany(mappedBy ="cinema", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Collection<Salle> salles;
    @NotNull
    @ToString.Exclude
    @ManyToOne
    private Ville ville;
    
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cinema(Long id, @NotNull @Size(min = 1, max = 29) String name, double longitude, double latitude,
			double altitude, @NotNull @Min(0) int nombreSalles, Collection<Salle> salles, @NotNull Ville ville) {
		super();
		this.id = id;
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.nombreSalles = nombreSalles;
		this.salles = salles;
		this.ville = ville;
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

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public int getNombreSalles() {
		return nombreSalles;
	}

	public void setNombreSalles(int nombreSalles) {
		this.nombreSalles = nombreSalles;
	}

	public Collection<Salle> getSalles() {
		return salles;
	}

	public void setSalles(Collection<Salle> salles) {
		this.salles = salles;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
}