package ru.flynt3650.pc_server.model;

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

    @Column(name = "interface_type")
    @NotNull
    private String interfaceType;

    public Hdd() {}

    public Hdd(String make, int capacity, int rpm, int cacheSize, String formFactor, String interfaceType) {
        this.make = make;
        this.capacity = capacity;
        this.rpm = rpm;
        this.cacheSize = cacheSize;
        this.formFactor = formFactor;
        this.interfaceType = interfaceType;
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

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", capacity=" + capacity +
                ", rpm=" + rpm +
                ", cacheSize=" + cacheSize +
                ", formFactor='" + formFactor + '\'' +
                ", interfaceType='" + interfaceType + '\'' +
                '}';
    }
}
