package org.sid.cinema.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@lombok.Data
@Entity
public class Film {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String titre;
    private String descritption;
    @Column(length = 30)
    private String realisiateur;
    private Date dateSortie;
    private double duree;
    private String photo;
    @ManyToOne
    private Categorie categorie;
    @OneToMany(mappedBy = "film", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private Collection<Projection> projections;
    
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(Long id, String titre, String descritption, String realisiateur, Date dateSortie, double duree,
			String photo, Categorie categorie, Collection<Projection> projections) {
		super();
		this.id = id;
		this.titre = titre;
		this.descritption = descritption;
		this.realisiateur = realisiateur;
		this.dateSortie = dateSortie;
		this.duree = duree;
		this.photo = photo;
		this.categorie = categorie;
		this.projections = projections;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescritption() {
		return descritption;
	}

	public void setDescritption(String descritption) {
		this.descritption = descritption;
	}

	public String getRealisiateur() {
		return realisiateur;
	}

	public void setRealisiateur(String realisiateur) {
		this.realisiateur = realisiateur;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Collection<Projection> getProjections() {
		return projections;
	}

	public void setProjections(Collection<Projection> projections) {
		this.projections = projections;
	}
    
}
