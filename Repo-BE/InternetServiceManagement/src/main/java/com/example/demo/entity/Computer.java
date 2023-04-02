package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Computer {
    @Id
    private String computerId;
    private String computerLocation;
    private String computerStartUsedDate;
    private String computerWarrantyPeriod;
    private String computerConfiguration;

    @OneToMany(mappedBy = "computer", cascade = {CascadeType.ALL,CascadeType.REMOVE})
    Set<Order> orders;

    @ManyToOne(targetEntity = Manufacturer.class)
    @JoinColumn(name = "manufacturerId", referencedColumnName = "manufacturerId")
    private Manufacturer manufacturer;

    @ManyToOne(targetEntity = Status.class)
    @JoinColumn(name = "statusId", referencedColumnName = "statusId")
    private Status status;

    @ManyToOne(targetEntity = Type.class)
    @JoinColumn(name = "typeId", referencedColumnName = "typeId")
    private Type type;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "computer_game",
            joinColumns = @JoinColumn(name = "computerId"),
            inverseJoinColumns = @JoinColumn(name = "gameId")
    )
    private Set<Game> games;

    public Computer() {
    }


    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public String getComputerLocation() {
        return computerLocation;
    }

    public void setComputerLocation(String computerLocation) {
        this.computerLocation = computerLocation;
    }

    public String getComputerStartUsedDate() {
        return computerStartUsedDate;
    }

    public void setComputerStartUsedDate(String computerStartUsedDate) {
        this.computerStartUsedDate = computerStartUsedDate;
    }

    public String getComputerWarrantyPeriod() {
        return computerWarrantyPeriod;
    }

    public void setComputerWarrantyPeriod(String computerWarrantyPeriod) {
        this.computerWarrantyPeriod = computerWarrantyPeriod;
    }

    public String getComputerConfiguration() {
        return computerConfiguration;
    }

    public void setComputerConfiguration(String computerConfiguration) {
        this.computerConfiguration = computerConfiguration;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
