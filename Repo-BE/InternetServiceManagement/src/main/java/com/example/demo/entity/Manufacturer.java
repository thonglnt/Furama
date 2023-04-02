package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manufacturerId;
    private String manufacturerName;

    @OneToMany(mappedBy = "manufacturer",cascade = CascadeType.ALL)
    private Set<Computer> computers;

    public Manufacturer() {
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Set<Computer> getComputers() {
        return computers;
    }

    public void setComputers(Set<Computer> computers) {
        this.computers = computers;
    }
}
