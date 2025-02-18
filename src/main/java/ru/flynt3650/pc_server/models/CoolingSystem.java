package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "cooling_system")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CoolingSystem {

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
}
