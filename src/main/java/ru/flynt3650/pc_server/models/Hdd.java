package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "hdd")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Hdd {

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

    @Column(name = "capacity")
    @NotNull(message = "Capacity is required")
    private int capacity;

    @Column(name = "rpm")
    @NotNull(message = "RPM is required")
    private int rpm;

    @Column(name = "cache_size")
    @NotNull(message = "CacheSize is required")
    private int cacheSize;

    @Column(name = "form_factor")
    @NotNull(message = "FormFactor is required")
    private String formFactor;

    @Column(name = "connection_interface")
    @NotNull(message = "ConnectionInterface is required")
    private String connectionInterface;

    /**
     * Builder constructor for all fields except {@code id}.
     */
    @Builder
    public Hdd(@NotNull String make,
               @NotNull String model,
               @NotNull int capacity,
               @NotNull int rpm,
               @NotNull int cacheSize,
               @NotNull String formFactor,
               @NotNull String connectionInterface) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.rpm = rpm;
        this.cacheSize = cacheSize;
        this.formFactor = formFactor;
        this.connectionInterface = connectionInterface;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Hdd hdd = (Hdd) o;
        return getId() != null && Objects.equals(getId(), hdd.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
