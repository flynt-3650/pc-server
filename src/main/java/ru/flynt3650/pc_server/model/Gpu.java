package ru.flynt3650.pc_server.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
@Table(name = "gpu")
public class Gpu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make")
    @NotNull
    private String make;

    @Column(name = "vram_size")
    @NotNull
    private int vramSize;

    @Column(name = "clock_speed")
    @NotNull
    private int clockSpeed;

    @Column(name = "mem_bus_width")
    @NotNull
    private int memBusWidth;

    @Column(name = "has_hdmi")
    @NotNull
    private boolean hasHdmi;

    @Column(name = "has_dp")
    @NotNull
    private boolean hasDp;

    @Column(name = "has_usbc")
    @NotNull
    private boolean hasUsbc;

    @Column(name = "has_dvi")
    @NotNull
    private boolean hasDvi;

    @Column(name = "has_vga")
    @NotNull
    private boolean hasVga;

    @Column(name = "power_consumption")
    @NotNull
    private int powerConsumption;

    public Gpu() {
    }

    public Gpu(String make, int vramSize, int clockSpeed, int memBusWidth, boolean hasHdmi, boolean hasDp, boolean hasUsbc, boolean hasDvi, boolean hasVga, int powerConsumption) {
        this.make = make;
        this.vramSize = vramSize;
        this.clockSpeed = clockSpeed;
        this.memBusWidth = memBusWidth;
        this.hasHdmi = hasHdmi;
        this.hasDp = hasDp;
        this.hasUsbc = hasUsbc;
        this.hasDvi = hasDvi;
        this.hasVga = hasVga;
        this.powerConsumption = powerConsumption;
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

    public int getVramSize() {
        return vramSize;
    }

    public void setVramSize(int vramSize) {
        this.vramSize = vramSize;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getMemBusWidth() {
        return memBusWidth;
    }

    public void setMemBusWidth(int memBusWidth) {
        this.memBusWidth = memBusWidth;
    }

    public boolean doesHaveHdmi() {
        return hasHdmi;
    }

    public void setHasHdmi(boolean hasHdmi) {
        this.hasHdmi = hasHdmi;
    }

    public boolean doesHaveDp() {
        return hasDp;
    }

    public void setHasDp(boolean hasDp) {
        this.hasDp = hasDp;
    }

    public boolean doesHaveUsbc() {
        return hasUsbc;
    }

    public void setHasUsbc(boolean hasUsbc) {
        this.hasUsbc = hasUsbc;
    }

    public boolean doesHaveDvi() {
        return hasDvi;
    }

    public void setHasDvi(boolean hasDvi) {
        this.hasDvi = hasDvi;
    }

    public boolean doesHaveVga() {
        return hasVga;
    }

    public void setHasVga(boolean hasVga) {
        this.hasVga = hasVga;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", vramSize=" + vramSize +
                ", clockSpeed=" + clockSpeed +
                ", memBusWidth=" + memBusWidth +
                ", hasHdmi=" + hasHdmi +
                ", hasDp=" + hasDp +
                ", hasUsbc=" + hasUsbc +
                ", hasDvi=" + hasDvi +
                ", hasVga=" + hasVga +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
