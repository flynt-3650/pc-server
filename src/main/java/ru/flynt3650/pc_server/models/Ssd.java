package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "ssd")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Ssd {

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

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "connection_interface")
    @NotNull
    private String connectionInterface;

    @Column(name = "read_speed")
    @NotNull
    private int readSpeed;

    @Column(name = "write_speed")
    @NotNull
    private int writeSpeed;

    @Column(name = "tbw")
    private int tbw;
}
