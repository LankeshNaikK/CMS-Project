package org.sid.cinema.entities;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "roles")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
    @OneToMany(mappedBy = "role", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<UserRole> userRoleList;
    
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Long id, String name, List<UserRole> userRoleList) {
		super();
		this.id = id;
		this.name = name;
		this.userRoleList = userRoleList;
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

	public List<UserRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRole> userRoleList) {
		this.userRoleList = userRoleList;
	}
	
}
