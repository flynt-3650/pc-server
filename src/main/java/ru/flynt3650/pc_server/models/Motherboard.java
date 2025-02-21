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
    @NotNull(message = "make is required")
    private String make;

    @Column(name = "model")
    @NotNull(message = "model is required")
    private String model;

    @Column(name = "form_factor")
    @NotNull(message = "form_factor is required")
    private String formFactor;

    @Column(name = "socket")
    @NotNull(message = "socket is required")
    private String socket;

    @Column(name = "chipset")
    @NotNull(message = "chipset is required")
    private String chipset;

    @Column(name = "ram_slot_amount")
    @NotNull(message = "ram_slot_amount is required")
    private int ramSlotAmount;

    @Column(name = "ram_type")
    @NotNull(message = "ram_type is required")
    private String ramType;

    @Column(name = "pcie16_amount")
    @NotNull(message = "pcie16_amount is required")
    private int pcie16Amount;

    @Column(name = "pcie4_amount")
    private int pcie4Amount;

    @Column(name = "pcie1_amount")
    @NotNull(message = "pcie1_amount is required")
    private int pcie1Amount;

    @Column(name = "m2_amount")
    @NotNull(message = "m2_amount is required")
    private int m2Amount;

    @Column(name = "sata_amount")
    @NotNull(message = "sata_amount is required")
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
