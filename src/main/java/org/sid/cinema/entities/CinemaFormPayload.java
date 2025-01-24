package org.sid.cinema.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CinemaFormPayload {
    private Long id;
    @NotNull
    @Size(min=1,max = 29)
    private String name;
    private double longitude;
    private double latitude;
    private double altitude;
    @NotNull
    @Min(0)
    private int nombreSalles;
    @NotNull
    private Long cityId;
    
	public CinemaFormPayload() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CinemaFormPayload(Long id, @NotNull @Size(min = 1, max = 29) String name, double longitude, double latitude,
			double altitude, @NotNull @Min(0) int nombreSalles, @NotNull Long cityId) {
		super();
		this.id = id;
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.nombreSalles = nombreSalles;
		this.cityId = cityId;
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

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
    
}
