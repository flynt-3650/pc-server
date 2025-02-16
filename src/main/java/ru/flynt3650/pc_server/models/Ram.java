package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ram")
public class Ram {

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

    @Column(name = "amount")
    @NotNull
    private int amount;

    @Column(name = "ram_type")
    @NotNull
    private String ramType;

    @Column(name = "clock")
    @NotNull
    private int clock;

    public Ram() {
    }

    public Ram(String make, String model, int capacity, int amount, String ramType, int clock) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.amount = amount;
        this.ramType = ramType;
        this.clock = clock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", amount=" + amount +
                ", ramType='" + ramType + '\'' +
                ", clock=" + clock +
                '}';
    }
}
