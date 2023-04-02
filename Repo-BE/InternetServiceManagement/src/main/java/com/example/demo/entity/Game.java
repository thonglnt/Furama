package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Game {
    @Id
    private String gameId;
    private String gameName;
    private String gameCategory;
    @Column(length = 255)
    private String gameImage;
    private String description;

    @ManyToMany(mappedBy = "games", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Computer> computers;

    public Game() {
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getGameImage() {
        return gameImage;
    }

    public void setGameImage(String gameImage) {
        this.gameImage = gameImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Computer> getComputers() {
        return computers;
    }

    public void setComputers(Set<Computer> computers) {
        this.computers = computers;
    }
}
