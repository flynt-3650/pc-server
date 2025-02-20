package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "casing")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Casing {

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

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "material")
    private String material;

    @Column(name = "cooling_support")
    private String coolingSupport;

    @Column(name = "expansion_slots")
    @NotNull
    private int expansionSlots;

    @Column(name = "drive_bays_35")
    private int driveBays35;

    @Column(name = "drive_bays_25")
    private int driveBays25;

    @Column(name = "front_panel_ports")
    private String frontPanelPorts;

    @Column(name = "includes_rgb")
    @NotNull
    private boolean includesRgb;

    /**
     * Lombok Builder constructor that includes all fields except {@code id}.
     * This effectively acts like an "all-args constructor" without the {@code id}.
     */
    @Builder
    public Casing(
            @NotNull String make,
            @NotNull String model,
            @NotNull String formFactor,
            String material,
            String coolingSupport,
            int expansionSlots,
            int driveBays35,
            int driveBays25,
            String frontPanelPorts,
            boolean includesRgb
    ) {
        this.make = make;
        this.model = model;
        this.formFactor = formFactor;
        this.material = material;
        this.coolingSupport = coolingSupport;
        this.expansionSlots = expansionSlots;
        this.driveBays35 = driveBays35;
        this.driveBays25 = driveBays25;
        this.frontPanelPorts = frontPanelPorts;
        this.includesRgb = includesRgb;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Casing casing = (Casing) o;
        return getId() != null && Objects.equals(getId(), casing.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
