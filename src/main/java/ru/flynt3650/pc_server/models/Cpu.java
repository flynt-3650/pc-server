package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "cpu")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Cpu {

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

    @Column(name = "core_amount")
    @NotNull
    private int coreAmount;

    @Column(name = "thread_amount")
    @NotNull
    private int threadAmount;

    @Column(name = "clock_speed")
    @NotNull
    private double clockSpeed;

    @Column(name = "l3_size")
    @NotNull
    private double l3Size;

    @Column(name = "socket")
    @NotNull
    private String socket;

    @Column(name = "igpu")
    private String igpu;

    @Column(name = "tdp")
    @NotNull
    private int tdp;
}
