package ru.flynt3650.pc_server.models.pc_components;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "psu")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Psu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "make")
    @NotNull(message = "Make is required")
    private String make;

    @Column(name = "model")
    @NotNull(message = "Model is required")
    private String model;

    @Column(name = "wattage")
    @NotNull(message = "Wattage is required")
    private int wattage;

    @Column(name = "efficiency_rating")
    private String efficiencyRating;

    @Column(name = "modularity")
    @NotNull(message = "Modularity is required")
    private String modularity;

    @Column(name = "connectors")
    @NotNull(message = "Connectors is required")
    private String connectors;

    @Column(name = "fan_size")
    private String fanSize;

    @Column(name = "cooling_type")
    private String coolingType;

    /**
     * Builder constructor excluding {@code id}.
     */
    @Builder
    public Psu(
            @NotNull String make,
            @NotNull String model,
            @NotNull int wattage,
            String efficiencyRating,
            @NotNull String modularity,
            @NotNull String connectors,
            String fanSize,
            String coolingType
    ) {
        this.make = make;
        this.model = model;
        this.wattage = wattage;
        this.efficiencyRating = efficiencyRating;
        this.modularity = modularity;
        this.connectors = connectors;
        this.fanSize = fanSize;
        this.coolingType = coolingType;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Psu psu = (Psu) o;
        return getId() != null && Objects.equals(getId(), psu.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
