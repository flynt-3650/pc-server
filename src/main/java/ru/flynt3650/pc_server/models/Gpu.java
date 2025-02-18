package ru.flynt3650.pc_server.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "gpu")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Gpu {

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

    @Column(name = "vram_size")
    @NotNull
    private int vramSize;

    @Column(name = "clock_speed")
    @NotNull
    private int clockSpeed;

    @Column(name = "mem_bus_width")
    @NotNull
    private int memBusWidth;

    @Column(name = "has_hdmi")
    @NotNull
    private boolean hasHdmi;

    @Column(name = "has_dp")
    @NotNull
    private boolean hasDp;

    @Column(name = "has_usbc")
    @NotNull
    private boolean hasUsbc;

    @Column(name = "has_dvi")
    @NotNull
    private boolean hasDvi;

    @Column(name = "has_vga")
    @NotNull
    private boolean hasVga;

    @Column(name = "power_consumption")
    @NotNull
    private int powerConsumption;
}
