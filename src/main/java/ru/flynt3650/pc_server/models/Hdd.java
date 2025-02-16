package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "hdd")
public class Hdd {

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

    @Column(name = "capacity")
    @NotNull
    private int capacity;

    @Column(name = "rpm")
    @NotNull
    private int rpm;

    @Column(name = "cache_size")
    @NotNull
    private int cacheSize;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "connection_interface")
    @NotNull
    private String connectionInterface;

    public Hdd() {}

    public Hdd(String make, String model, int capacity, int rpm, int cacheSize, String formFactor, String connectionInterface) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.rpm = rpm;
        this.cacheSize = cacheSize;
        this.formFactor = formFactor;
        this.connectionInterface = connectionInterface;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getConnectionInterface() {
        return connectionInterface;
    }

    public void setConnectionInterface(String connectionInterface) {
        this.connectionInterface = connectionInterface;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", rpm=" + rpm +
                ", cacheSize=" + cacheSize +
                ", formFactor='" + formFactor + '\'' +
                ", connectionInterface='" + connectionInterface + '\'' +
                '}';
    }
}
