package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "networking")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Networking {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    /**
     * Builder constructor excluding {@code id}.
     */
    @Builder
    public Networking(
            @NotNull String make,
            @NotNull String model,
            @NotNull String type,
            @NotNull String connectionInterface,
            String wifiStandard,
            String ethernetSpeed,
            int antennas,
            String bluetoothVersion
    ) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.connectionInterface = connectionInterface;
        this.wifiStandard = wifiStandard;
        this.ethernetSpeed = ethernetSpeed;
        this.antennas = antennas;
        this.bluetoothVersion = bluetoothVersion;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Networking that = (Networking) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
