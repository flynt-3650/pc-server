package ru.flynt3650.pc_server.models.pc_components;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "pc")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pc {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotNull(message = "Name is required")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cpu_id", referencedColumnName = "id")
    @NotNull(message = "Cpu is required")
    private Cpu cpu;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "gpu_id", referencedColumnName = "id")
    @NotNull(message = "Gpu is required")
    private Gpu gpu;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "motherboard_id", referencedColumnName = "id")
    @NotNull(message = "Motherboard is required")
    private Motherboard motherboard;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ram_id", referencedColumnName = "id")
    @NotNull(message = "Ram is required")
    private Ram ram;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ssd_id", referencedColumnName = "id")
    @NotNull(message = "Ssd is required")
    private Ssd ssd;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "hdd_id", referencedColumnName = "id")
    @NotNull(message = "Hdd is required")
    private Hdd hdd;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "psu_id", referencedColumnName = "id")
    @NotNull(message = "Psu is required")
    private Psu psu;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "case_id", referencedColumnName = "id")
    @NotNull(message = "Case is required")
    private Casing casing;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cooling_system_id", referencedColumnName = "id")
    @NotNull(message = "Cooling system is required")
    private CoolingSystem coolingSystem;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "networking_id", referencedColumnName = "id")
    @NotNull(message = "Networking is required")
    private Networking networking;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    /**
     * Builder constructor excluding {@code id}.
     */
    @Builder
    public Pc(
            String name,
            Cpu cpu,
            Gpu gpu,
            Motherboard motherboard,
            Ram ram,
            Ssd ssd,
            Hdd hdd,
            Psu psu,
            Casing casing,
            CoolingSystem coolingSystem,
            Networking networking,
            LocalDateTime createdAt,
            LocalDateTime updatedAt
    ) {
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.psu = psu;
        this.casing = casing;
        this.coolingSystem = coolingSystem;
        this.networking = networking;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Pc pc = (Pc) o;
        return getId() != null && Objects.equals(getId(), pc.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
