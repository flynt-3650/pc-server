package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Table(name = "casing")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Casing {

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

    @Column(name = "material")
    private String material;

    @Column(name = "cooling_support")
    private String coolingSupport;

    @Column(name = "expansion_slots")
    @NotNull
    private int expansionSlots;

    @Column(name = "drive_bays_35")
    private int driveBays35;

    @Column(name = "drive_bays_25")
    private int driveBays25;

    @Column(name = "front_panel_ports")
    private String frontPanelPorts;

    @Column(name = "includes_rgb")
    @NotNull
    private boolean includesRgb;
}
