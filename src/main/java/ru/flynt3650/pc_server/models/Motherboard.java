package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "motherboard")
public class Motherboard {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model")
    @NotNull
    private String model;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "socket")
    @NotNull
    private String socket;

    @Column(name = "chipset")
    @NotNull
    private String chipset;

    @Column(name = "ram_slot_amount")
    @NotNull
    private int ramSlotAmount;

    @Column(name = "ram_type")
    @NotNull
    private String ramType;

    @Column(name = "pcie16_amount")
    @NotNull
    private int pcie16Amount;

    @Column(name = "pcie4_amount")
    private int pcie4Amount;

    @Column(name = "pcie1_amount")
    @NotNull
    private int pcie1Amount;

    @Column(name = "m2_amount")
    @NotNull
    private int m2Amount;

    @Column(name = "sata_amount")
    @NotNull
    private int sataAmount;

    public Motherboard() {}

    public Motherboard(String formFactor, String socket, String chipset,
                       int ramSlotAmount, String ramType, int pcie16Amount,
                       int pcie4Amount, int pcie1Amount, int m2Amount, int sataAmount) {
        this.formFactor = formFactor;
        this.socket = socket;
        this.chipset = chipset;
        this.ramSlotAmount = ramSlotAmount;
        this.ramType = ramType;
        this.pcie16Amount = pcie16Amount;
        this.pcie4Amount = pcie4Amount;
        this.pcie1Amount = pcie1Amount;
        this.m2Amount = m2Amount;
        this.sataAmount = sataAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getRamSlotAmount() {
        return ramSlotAmount;
    }

    public void setRamSlotAmount(int ramSlotAmount) {
        this.ramSlotAmount = ramSlotAmount;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getPcie16Amount() {
        return pcie16Amount;
    }

    public void setPcie16Amount(int pcie16Amount) {
        this.pcie16Amount = pcie16Amount;
    }

    public int getPcie4Amount() {
        return pcie4Amount;
    }

    public void setPcie4Amount(int pcie4Amount) {
        this.pcie4Amount = pcie4Amount;
    }

    public int getPcie1Amount() {
        return pcie1Amount;
    }

    public void setPcie1Amount(int pcie1Amount) {
        this.pcie1Amount = pcie1Amount;
    }

    public int getM2Amount() {
        return m2Amount;
    }

    public void setM2Amount(int m2Amount) {
        this.m2Amount = m2Amount;
    }

    public int getSataAmount() {
        return sataAmount;
    }

    public void setSataAmount(int sataAmount) {
        this.sataAmount = sataAmount;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", socket='" + socket + '\'' +
                ", chipset='" + chipset + '\'' +
                ", ramSlotAmount=" + ramSlotAmount +
                ", ramType='" + ramType + '\'' +
                ", pcie16Amount=" + pcie16Amount +
                ", pcie4Amount=" + pcie4Amount +
                ", pcie1Amount=" + pcie1Amount +
                ", m2Amount=" + m2Amount +
                ", sataAmount=" + sataAmount +
                '}';
    }
}
