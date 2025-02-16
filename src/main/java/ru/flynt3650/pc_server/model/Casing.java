package ru.flynt3650.pc_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "casing")
public class Casing {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make")
    @NotNull
    private String make;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "material")
    private String material;

    @Column(name = "cooling_support")
    private String coolingSupport;

    @Column(name = "expansion_slots")
    @NotNull
    private int expansionSlots;

    @Column(name = "drive_bays35")
    private int driveBays35;

    @Column(name = "drive_bays25")
    private int driveBays25;

    @Column(name = "front_panel_ports")
    private String frontPanelPorts;

    @Column(name = "includes_rgb")
    @NotNull
    private boolean includesRgb;

    public Casing() {}

    public Casing(String make, String formFactor, String material, String coolingSupport, int expansionSlots, int driveBays35, int driveBays25, String frontPanelPorts, boolean includesRgb) {
        this.make = make;
        this.formFactor = formFactor;
        this.material = material;
        this.coolingSupport = coolingSupport;
        this.expansionSlots = expansionSlots;
        this.driveBays35 = driveBays35;
        this.driveBays25 = driveBays25;
        this.frontPanelPorts = frontPanelPorts;
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

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCoolingSupport() {
        return coolingSupport;
    }

    public void setCoolingSupport(String coolingSupport) {
        this.coolingSupport = coolingSupport;
    }

    public int getExpansionSlots() {
        return expansionSlots;
    }

    public void setExpansionSlots(int expansionSlots) {
        this.expansionSlots = expansionSlots;
    }

    public int getDriveBays35() {
        return driveBays35;
    }

    public void setDriveBays35(int driveBays35) {
        this.driveBays35 = driveBays35;
    }

    public int getDriveBays25() {
        return driveBays25;
    }

    public void setDriveBays25(int driveBays25) {
        this.driveBays25 = driveBays25;
    }

    public String getFrontPanelPorts() {
        return frontPanelPorts;
    }

    public void setFrontPanelPorts(String frontPanelPorts) {
        this.frontPanelPorts = frontPanelPorts;
    }

    public boolean isIncludesRgb() {
        return includesRgb;
    }

    public void setIncludesRgb(boolean includesRgb) {
        this.includesRgb = includesRgb;
    }

    @Override
    public String toString() {
        return "Casing{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", material='" + material + '\'' +
                ", coolingSupport='" + coolingSupport + '\'' +
                ", expansionSlots=" + expansionSlots +
                ", driveBays35=" + driveBays35 +
                ", driveBays25=" + driveBays25 +
                ", frontPanelPorts='" + frontPanelPorts + '\'' +
                ", includesRgb=" + includesRgb +
                '}';
    }
}
