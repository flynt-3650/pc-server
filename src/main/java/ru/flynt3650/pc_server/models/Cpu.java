package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "cpu")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cpu {

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

    @Column(name = "core_amount")
    @NotNull
    private int coreAmount;

    @Column(name = "thread_amount")
    @NotNull
    private int threadAmount;

    @Column(name = "clock_speed")
    @NotNull
    private double clockSpeed;

    @Column(name = "l3_size")
    @NotNull
    private double l3Size;

    @Column(name = "socket")
    @NotNull
    private String socket;

    @Column(name = "igpu")
    private String igpu;

    @Column(name = "tdp")
    @NotNull
    private int tdp;

    /**
     * Lombok builder constructor for all fields except {@code id}.
     */
    @Builder
    public Cpu(@NotNull String make,
               @NotNull String model,
               @NotNull int coreAmount,
               @NotNull int threadAmount,
               @NotNull double clockSpeed,
               @NotNull double l3Size,
               @NotNull String socket,
               String igpu,
               @NotNull int tdp) {
        this.make = make;
        this.model = model;
        this.coreAmount = coreAmount;
        this.threadAmount = threadAmount;
        this.clockSpeed = clockSpeed;
        this.l3Size = l3Size;
        this.socket = socket;
        this.igpu = igpu;
        this.tdp = tdp;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Cpu cpu = (Cpu) o;
        return getId() != null && Objects.equals(getId(), cpu.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
