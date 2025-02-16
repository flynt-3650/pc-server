package ru.flynt3650.pc_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ssd")
public class Ssd {

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

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "connection_interface")
    @NotNull
    private String connectionInterface;

    @Column(name = "read_speed")
    @NotNull
    private int readSpeed;

    @Column(name = "write_speed")
    @NotNull
    private int writeSpeed;

    @Column(name = "tbw")
    private int tbw;

    public Ssd() {}

    public Ssd(String make, int capacity, String type, String formFactor, String connectionInterface, int readSpeed, int writeSpeed, int tbw) {
        this.make = make;
        this.capacity = capacity;
        this.type = type;
        this.formFactor = formFactor;
        this.connectionInterface = connectionInterface;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.tbw = tbw;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public int getTbw() {
        return tbw;
    }

    public void setTbw(int tbw) {
        this.tbw = tbw;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", connectionInterface='" + connectionInterface + '\'' +
                ", readSpeed=" + readSpeed +
                ", writeSpeed=" + writeSpeed +
                ", tbw=" + tbw +
                '}';
    }
}
