package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "cooling_system")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CoolingSystem {

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

    /**
     * Lombok builder constructor for all fields except {@code id}.
     */
    @Builder
    public CoolingSystem(
            @NotNull String make,
            @NotNull String model,
            @NotNull String type,
            String fanSize,
            String radiatorSize,
            String noiseLevel,
            @NotNull String socketCompatibility,
            int tdpSupport,
            boolean includesRgb
    ) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.fanSize = fanSize;
        this.radiatorSize = radiatorSize;
        this.noiseLevel = noiseLevel;
        this.socketCompatibility = socketCompatibility;
        this.tdpSupport = tdpSupport;
        this.includesRgb = includesRgb;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        CoolingSystem that = (CoolingSystem) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
