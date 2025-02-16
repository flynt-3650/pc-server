package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "networking")
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

    public Networking() {}

    public Networking(String make, String model, String type, String connectionInterface, String wifiStandard,
                      String ethernetSpeed, int antennas, String bluetoothVersion) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.connectionInterface = connectionInterface;
        this.wifiStandard = wifiStandard;
        this.ethernetSpeed = ethernetSpeed;
        this.antennas = antennas;
        this.bluetoothVersion = bluetoothVersion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConnectionInterface() {
        return connectionInterface;
    }

    public void setConnectionInterface(String connectionInterface) {
        this.connectionInterface = connectionInterface;
    }

    public String getWifiStandard() {
        return wifiStandard;
    }

    public void setWifiStandard(String wifiStandard) {
        this.wifiStandard = wifiStandard;
    }

    public String getEthernetSpeed() {
        return ethernetSpeed;
    }

    public void setEthernetSpeed(String ethernetSpeed) {
        this.ethernetSpeed = ethernetSpeed;
    }

    public int getAntennas() {
        return antennas;
    }

    public void setAntennas(int antennas) {
        this.antennas = antennas;
    }

    public String getBluetoothVersion() {
        return bluetoothVersion;
    }

    public void setBluetoothVersion(String bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
    }

    @Override
    public String toString() {
        return "Networking{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", connectionInterface='" + connectionInterface + '\'' +
                ", wifiStandard='" + wifiStandard + '\'' +
                ", ethernetSpeed='" + ethernetSpeed + '\'' +
                ", antennas=" + antennas +
                ", bluetoothVersion='" + bluetoothVersion + '\'' +
                '}';
    }
}
