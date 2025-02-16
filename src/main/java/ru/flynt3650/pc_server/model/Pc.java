package ru.flynt3650.pc_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "pc")
public class Pc {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "cpu_id", referencedColumnName = "id")
    private Cpu cpu;

    @ManyToOne
    @JoinColumn(name = "gpu_id", referencedColumnName = "id")
    private Gpu gpu;

    @ManyToOne
    @JoinColumn(name = "motherboard_id", referencedColumnName = "id")
    private Motherboard motherboard;

    @ManyToOne
    @JoinColumn(name = "ram_id", referencedColumnName = "id")
    private Ram ram;

    @ManyToOne
    @JoinColumn(name = "ssd_id", referencedColumnName = "id")
    private Ssd ssd;

    @ManyToOne
    @JoinColumn(name = "hdd_id", referencedColumnName = "id")
    private Hdd hdd;

    @ManyToOne
    @JoinColumn(name = "psu_id", referencedColumnName = "id")
    private Psu psu;

    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "id")
    private Casing casing;

    @ManyToOne
    @JoinColumn(name = "cooling_system_id", referencedColumnName = "id")
    private CoolingSystem coolingSystem;

    @ManyToOne
    @JoinColumn(name = "networking_id", referencedColumnName = "id")
    private Networking networking;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public Pc() {
    }

    public Pc(String name, Cpu cpu, Gpu gpu, Motherboard motherboard, Ram ram, Ssd ssd, Hdd hdd, Psu psu,
              Casing casing, CoolingSystem coolingSystem, Networking networking, Instant createdAt) {
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.psu = psu;
        this.casing = casing;
        this.coolingSystem = coolingSystem;
        this.networking = networking;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Psu getPsu() {
        return psu;
    }

    public void setPsu(Psu psu) {
        this.psu = psu;
    }

    public Casing getCasing() {
        return casing;
    }

    public void setCasing(Casing casing) {
        this.casing = casing;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public Networking getNetworking() {
        return networking;
    }

    public void setNetworking(Networking networking) {
        this.networking = networking;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", motherboard=" + motherboard +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", hdd=" + hdd +
                ", psu=" + psu +
                ", casing=" + casing +
                ", coolingSystem=" + coolingSystem +
                ", networking=" + networking +
                ", createdAt=" + createdAt +
                '}';
    }
}
