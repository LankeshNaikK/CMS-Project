package org.sid.cinema.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String name;
    @OneToMany(mappedBy ="categorie", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Collection<Film> films;
    
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(Long id, String name, Collection<Film> films) {
		super();
		this.id = id;
		this.name = name;
		this.films = films;
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

	public Collection<Film> getFilms() {
		return films;
	}

	public void setFilms(Collection<Film> films) {
		this.films = films;
	}
    
}
