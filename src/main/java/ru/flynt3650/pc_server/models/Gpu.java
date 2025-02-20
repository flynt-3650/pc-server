package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "gpu")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Gpu {

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

    /**
     * Lombok builder constructor that includes all fields except {@code id}.
     */
    @Builder
    public Gpu(
            @NotNull String make,
            @NotNull String model,
            @NotNull int vramSize,
            @NotNull int clockSpeed,
            @NotNull int memBusWidth,
            @NotNull boolean hasHdmi,
            @NotNull boolean hasDp,
            @NotNull boolean hasUsbc,
            @NotNull boolean hasDvi,
            @NotNull boolean hasVga,
            @NotNull int powerConsumption
    ) {
        this.make = make;
        this.model = model;
        this.vramSize = vramSize;
        this.clockSpeed = clockSpeed;
        this.memBusWidth = memBusWidth;
        this.hasHdmi = hasHdmi;
        this.hasDp = hasDp;
        this.hasUsbc = hasUsbc;
        this.hasDvi = hasDvi;
        this.hasVga = hasVga;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Gpu gpu = (Gpu) o;
        return getId() != null && Objects.equals(getId(), gpu.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
