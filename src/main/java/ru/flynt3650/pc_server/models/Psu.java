package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "psu")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Psu {

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

    @Column(name = "wattage")
    @NotNull
    private int wattage;

    @Column(name = "efficiency_rating")
    private String efficiencyRating;

    @Column(name = "modularity")
    @NotNull
    private String modularity;

    @Column(name = "connectors")
    @NotNull
    private String connectors;

    @Column(name = "fan_size")
    private String fanSize;

    @Column(name = "cooling_type")
    private String coolingType;
}
