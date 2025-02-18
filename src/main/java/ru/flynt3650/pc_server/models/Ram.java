package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "ram")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Ram {

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

    @Column(name = "capacity")
    @NotNull
    private int capacity;

    @Column(name = "amount")
    @NotNull
    private int amount;

    @Column(name = "ram_type")
    @NotNull
    private String ramType;

    @Column(name = "clock")
    @NotNull
    private int clock;
}
