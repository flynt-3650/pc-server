package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "motherboard")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Motherboard {

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

    @Column(name = "socket")
    @NotNull
    private String socket;

    @Column(name = "chipset")
    @NotNull
    private String chipset;

    @Column(name = "ram_slot_amount")
    @NotNull
    private int ramSlotAmount;

    @Column(name = "ram_type")
    @NotNull
    private String ramType;

    @Column(name = "pcie16_amount")
    @NotNull
    private int pcie16Amount;

    @Column(name = "pcie4_amount")
    private int pcie4Amount;

    @Column(name = "pcie1_amount")
    @NotNull
    private int pcie1Amount;

    @Column(name = "m2_amount")
    @NotNull
    private int m2Amount;

    @Column(name = "sata_amount")
    @NotNull
    private int sataAmount;

    /**
     * Builder constructor excluding {@code id}.
     */
    @Builder
    public Motherboard(
            @NotNull String make,
            @NotNull String model,
            @NotNull String formFactor,
            @NotNull String socket,
            @NotNull String chipset,
            @NotNull int ramSlotAmount,
            @NotNull String ramType,
            @NotNull int pcie16Amount,
            int pcie4Amount,
            @NotNull int pcie1Amount,
            @NotNull int m2Amount,
            @NotNull int sataAmount
    ) {
        this.make = make;
        this.model = model;
        this.formFactor = formFactor;
        this.socket = socket;
        this.chipset = chipset;
        this.ramSlotAmount = ramSlotAmount;
        this.ramType = ramType;
        this.pcie16Amount = pcie16Amount;
        this.pcie4Amount = pcie4Amount;
        this.pcie1Amount = pcie1Amount;
        this.m2Amount = m2Amount;
        this.sataAmount = sataAmount;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Motherboard that = (Motherboard) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
