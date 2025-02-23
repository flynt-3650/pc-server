package ru.flynt3650.pc_server.models.pc_components;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "ram")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Ram {

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

    @Column(name = "amount")
    @NotNull(message = "Amount is required")
    private int amount;

    @Column(name = "ram_type")
    @NotNull(message = "RamType is required")
    private String ramType;

    @Column(name = "clock")
    @NotNull(message = "Clock is required")
    private int clock;

    /**
     * Builder constructor excluding {@code id}.
     */
    @Builder
    public Ram(
            @NotNull String make,
            @NotNull String model,
            @NotNull int capacity,
            @NotNull int amount,
            @NotNull String ramType,
            @NotNull int clock
    ) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.amount = amount;
        this.ramType = ramType;
        this.clock = clock;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Ram ram = (Ram) o;
        return getId() != null && Objects.equals(getId(), ram.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
