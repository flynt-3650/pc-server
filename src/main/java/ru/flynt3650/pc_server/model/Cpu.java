package ru.flynt3650.pc_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "cpu")
public class Cpu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make")
    @NotNull
    private String make;

    @Column(name = "core_amount")
    @NotNull
    private int coreAmount;

    @Column(name = "thread_amount")
    @NotNull
    private int threadAmount;

    @Column(name = "clock_speed")
    @NotNull
    private double clockSpeed;

    @Column(name = "l3_size")
    @NotNull
    private double l3Size;

    @Column(name = "socket")
    @NotNull
    private String socket;

    @Column(name = "igpu")
    private String igpu;

    @Column(name = "tdp")
    @NotNull
    private int tdp;

    public Cpu() {
    }

    public Cpu(String make, int coreAmount, int threadAmount, double clockSpeed, double l3Size,
               String socket, String igpu, int tdp) {
        this.make = make;
        this.coreAmount = coreAmount;
        this.threadAmount = threadAmount;
        this.clockSpeed = clockSpeed;
        this.l3Size = l3Size;
        this.socket = socket;
        this.igpu = igpu;
        this.tdp = tdp;
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

    public int getCoreAmount() {
        return coreAmount;
    }

    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    public int getThreadAmount() {
        return threadAmount;
    }

    public void setThreadAmount(int threadAmount) {
        this.threadAmount = threadAmount;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public double getL3Size() {
        return l3Size;
    }

    public void setL3Size(double l3Size) {
        this.l3Size = l3Size;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getIgpu() {
        return igpu;
    }

    public void setIgpu(String igpu) {
        this.igpu = igpu;
    }

    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", coreAmount=" + coreAmount +
                ", threadAmount=" + threadAmount +
                ", clockSpeed=" + clockSpeed +
                ", l3Size=" + l3Size +
                ", socket='" + socket + '\'' +
                ", igpu='" + igpu + '\'' +
                ", tdp=" + tdp +
                '}';
    }
}
