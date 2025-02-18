package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "motherboard")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Motherboard {

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
}
