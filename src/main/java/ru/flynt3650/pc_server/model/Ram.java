package ru.flynt3650.pc_server.model;

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

    @Column(name = "capacity")
    @NotNull
    private int capacity;

    @Column(name = "amount")
    @NotNull
    private int amount;

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "clock")
    @NotNull
    private int clock;

    public Ram() {
    }

    public Ram(String make, int capacity, int amount, String type, int clock) {
        this.make = make;
        this.capacity = capacity;
        this.amount = amount;
        this.type = type;
        this.clock = clock;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", capacity=" + capacity +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", clock=" + clock +
                '}';
    }
}
