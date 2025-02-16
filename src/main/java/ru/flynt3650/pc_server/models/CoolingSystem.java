package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cooling_system")
public class CoolingSystem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make")
    @NotNull
    private String make;

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "fan_size")
    private String fanSize;

    @Column(name = "radiator_size")
    private String radiatorSize;

    @Column(name = "noise_level")
    private String noiseLevel;

    @Column(name = "socket_compatibility")
    @NotNull
    private String socketCompatibility;

    @Column(name = "tdp_support")
    private int tdpSupport;

    @Column(name = "includes_rgb")
    @NotNull
    private boolean includesRgb;

    public CoolingSystem() {}

    public CoolingSystem(String make, String type, String fanSize, String radiatorSize, String noiseLevel,
                         String socketCompatibility, int tdpSupport, boolean includesRgb) {
        this.make = make;
        this.type = type;
        this.fanSize = fanSize;
        this.radiatorSize = radiatorSize;
        this.noiseLevel = noiseLevel;
        this.socketCompatibility = socketCompatibility;
        this.tdpSupport = tdpSupport;
        this.includesRgb = includesRgb;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFanSize() {
        return fanSize;
    }

    public void setFanSize(String fanSize) {
        this.fanSize = fanSize;
    }

    public String getRadiatorSize() {
        return radiatorSize;
    }

    public void setRadiatorSize(String radiatorSize) {
        this.radiatorSize = radiatorSize;
    }

    public String getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(String noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public String getSocketCompatibility() {
        return socketCompatibility;
    }

    public void setSocketCompatibility(String socketCompatibility) {
        this.socketCompatibility = socketCompatibility;
    }

    public int getTdpSupport() {
        return tdpSupport;
    }

    public void setTdpSupport(int tdpSupport) {
        this.tdpSupport = tdpSupport;
    }

    public boolean isIncludesRgb() {
        return includesRgb;
    }

    public void setIncludesRgb(boolean includesRgb) {
        this.includesRgb = includesRgb;
    }

    @Override
    public String toString() {
        return "CoolingSystem{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", fanSize='" + fanSize + '\'' +
                ", radiatorSize='" + radiatorSize + '\'' +
                ", noiseLevel='" + noiseLevel + '\'' +
                ", socketCompatibility='" + socketCompatibility + '\'' +
                ", tdpSupport=" + tdpSupport +
                ", includesRgb=" + includesRgb +
                '}';
    }
}
