package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "psu")
public class Psu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make")
    @NotNull
    private String make;

    @Column(name = "model")
    @NotNull
    private String model;

    @Column(name = "wattage")
    @NotNull
    private int wattage;

    @Column(name = "efficiency_rating")
    private String efficiencyRating;

    @Column(name = "modularity")
    @NotNull
    private String modularity;

    @Column(name = "connectors")
    @NotNull
    private String connectors;

    @Column(name = "fan_size")
    private String fanSize;

    @Column(name = "cooling_type")
    private String coolingType;

    public Psu() {}

    public Psu(String make, String model, int wattage, String efficiencyRating, String modularity, String connectors,
               String fanSize, String coolingType) {
        this.make = make;
        this.model = model;
        this.wattage = wattage;
        this.efficiencyRating = efficiencyRating;
        this.modularity = modularity;
        this.connectors = connectors;
        this.fanSize = fanSize;
        this.coolingType = coolingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getEfficiencyRating() {
        return efficiencyRating;
    }

    public void setEfficiencyRating(String efficiencyRating) {
        this.efficiencyRating = efficiencyRating;
    }

    public String getModularity() {
        return modularity;
    }

    public void setModularity(String modularity) {
        this.modularity = modularity;
    }

    public String getConnectors() {
        return connectors;
    }

    public void setConnectors(String connectors) {
        this.connectors = connectors;
    }

    public String getFanSize() {
        return fanSize;
    }

    public void setFanSize(String fanSize) {
        this.fanSize = fanSize;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }

    @Override
    public String toString() {
        return "Psu{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", wattage=" + wattage +
                ", efficiencyRating='" + efficiencyRating + '\'' +
                ", modularity='" + modularity + '\'' +
                ", connectors='" + connectors + '\'' +
                ", fanSize='" + fanSize + '\'' +
                ", coolingType='" + coolingType + '\'' +
                '}';
    }
}
