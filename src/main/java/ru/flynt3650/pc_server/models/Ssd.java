package ru.flynt3650.pc_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Table(name = "ssd")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Ssd {

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

    @Column(name = "capacity")
    @NotNull
    private int capacity;

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "form_factor")
    @NotNull
    private String formFactor;

    @Column(name = "connection_interface")
    @NotNull
    private String connectionInterface;

    @Column(name = "read_speed")
    @NotNull
    private int readSpeed;

    @Column(name = "write_speed")
    @NotNull
    private int writeSpeed;

    @Column(name = "tbw")
    private int tbw;

    /**
     * Builder constructor excluding {@code id}.
     */
    @Builder
    public Ssd(
            @NotNull String make,
            @NotNull String model,
            @NotNull int capacity,
            @NotNull String type,
            @NotNull String formFactor,
            @NotNull String connectionInterface,
            @NotNull int readSpeed,
            @NotNull int writeSpeed,
            int tbw
    ) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.type = type;
        this.formFactor = formFactor;
        this.connectionInterface = connectionInterface;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.tbw = tbw;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Ssd ssd = (Ssd) o;
        return getId() != null && Objects.equals(getId(), ssd.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy proxy ? proxy.getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
