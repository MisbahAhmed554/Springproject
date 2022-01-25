package com.examples.Springproject.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resource_request")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String resource_unit;
    private String resource_desc;
    private String resource_platform;
    

    public City() {
    }

    public City(int id, String resource_unit,String resource_desc,String resource_platform ) {
        this.id = id;
        this.resource_unit = resource_unit;
        this. resource_desc=resource_desc ;
        this.resource_platform=resource_platform;
    }

    

   
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResource_unit() {
		return resource_unit;
	}

	public void setResource_unit(String resource_unit) {
		this.resource_unit = resource_unit;
	}

	public String getResource_desc() {
		return resource_desc;
	}

	public void setResource_desc(String resource_desc) {
		this.resource_desc = resource_desc;
	}

	public String getResource_platform() {
		return resource_platform;
	}

	public void setResource_platform(String resource_platform) {
		this.resource_platform = resource_platform;
	}

	@Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.resource_unit);
        hash = 79 * hash + Objects.hashCode(this.resource_desc);
        hash = 79 * hash + Objects.hashCode(this.resource_platform);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (this.resource_platform != other.resource_platform) {
            return false;
        }
        if (!Objects.equals(this.resource_unit, other.resource_unit)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(",resource_unit ='").append(resource_unit).append('\'');
        sb.append(", resource_desc='").append(resource_desc).append('\'');
        sb.append(", resource_platform='").append(resource_platform).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
