package com.mulesoft.training;

public  class Accounts implements java.io.Serializable, Comparable<Accounts>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1623570385258439061L;
    private Integer id;
    private String name;
    private String type;
    private String address;
    private Integer airMiles;
    private String createdAt;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getAirMiles() {
        return airMiles;
    }
    public void setAirMiles(Integer airMiles) {
        this.airMiles = airMiles;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
	@Override
	public int compareTo(Accounts o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
