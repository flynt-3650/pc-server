package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "hdd")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Hdd {

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

    @Column(name = "rpm")
    @NotNull
    private int rpm;

    @Column(name = "cache_size")
    @NotNull
    private int cacheSize;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "connection_interface")
    @NotNull
    private String connectionInterface;
}
