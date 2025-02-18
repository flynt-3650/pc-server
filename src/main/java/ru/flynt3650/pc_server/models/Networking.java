package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "networking")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Networking {

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

    @Column(name = "connection_interface")
    @NotNull
    private String connectionInterface;

    @Column(name = "wifi_standard")
    private String wifiStandard;

    @Column(name = "ethernet_speed")
    private String ethernetSpeed;

    @Column(name = "antennas")
    private int antennas;

    @Column(name = "bluetooth_version")
    private String bluetoothVersion;
}
