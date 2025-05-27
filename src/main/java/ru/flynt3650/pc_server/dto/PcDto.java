package ru.flynt3650.pc_server.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.flynt3650.pc_server.models.pc_components.*;

/**
 * DTO for {@link Pc}
 */
@Data
public class PcDto {
    private Integer id;

    @NotNull(message = "Name is required")
    private String name;

    private Double price;

    @Valid
    @NotNull(message = "Cpu is required")
    private CpuDto cpu;

    @Valid
    @NotNull(message = "Gpu is required")
    private GpuDto gpu;

    @Valid
    @NotNull(message = "Motherboard is required")
    private MotherboardDto motherboard;

    @Valid
    @NotNull(message = "Ram is required")
    private RamDto ram;

    @Valid
    @NotNull(message = "Ssd is required")
    private SsdDto ssd;

    @Valid
    @NotNull(message = "Hdd is required")
    private HddDto hdd;

    @Valid
    @NotNull(message = "Psu is required")
    private PsuDto psu;

    @Valid
    @NotNull(message = "Case is required")
    private CasingDto casing;

    @Valid
    @NotNull(message = "Cooling system is required")
    private CoolingSystemDto coolingSystem;

    @Valid
    @NotNull(message = "Networking is required")
    private NetworkingDto networking;

    /**
     * DTO for {@link Cpu}
     */
    @Data
    public static class CpuDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        private int coreAmount;
        private int threadAmount;
        private double clockSpeed;
        private double l3Size;
        @NotNull(message = "Socket is required")
        private String socket;
        private String igpu;
        private int tdp;
    }

    /**
     * DTO for {@link Gpu}
     */
    @Data
    public static class GpuDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        private int vramSize;
        private int clockSpeed;
        private int memBusWidth;
        private boolean hasHdmi;
        private boolean hasDp;
        private boolean hasUsbc;
        private boolean hasDvi;
        private boolean hasVga;
        private int powerConsumption;
    }

    /**
     * DTO for {@link Motherboard}
     */
    @Data
    public static class MotherboardDto {
        private Integer id;
        @NotNull(message = "make is required")
        private String make;
        @NotNull(message = "model is required")
        private String model;
        @NotNull(message = "form_factor is required")
        private String formFactor;
        @NotNull(message = "socket is required")
        private String socket;
        @NotNull(message = "chipset is required")
        private String chipset;
        private int ramSlotAmount;
        @NotNull(message = "ram_type is required")
        private String ramType;
        private int pcie16Amount;
        private int pcie4Amount;
        private int pcie1Amount;
        private int m2Amount;
        private int sataAmount;
    }

    /**
     * DTO for {@link Ram}
     */
    @Data
    public static class RamDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        private int capacity;
        private int amount;
        @NotNull(message = "RamType is required")
        private String ramType;
        private int clock;
    }

    /**
     * DTO for {@link Ssd}
     */
    @Data
    public static class SsdDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        private int capacity;
        @NotNull(message = "Type is required")
        private String type;
        @NotNull(message = "FormFactor is required")
        private String formFactor;
        @NotNull(message = "ConnectionInterface is required")
        private String connectionInterface;
        private int readSpeed;
        private int writeSpeed;
        private int tbw;
    }

    /**
     * DTO for {@link Hdd}
     */
    @Data
    public static class HddDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        private int capacity;
        private int rpm;
        private int cacheSize;
        @NotNull(message = "FormFactor is required")
        private String formFactor;
        @NotNull(message = "ConnectionInterface is required")
        private String connectionInterface;
    }

    /**
     * DTO for {@link Psu}
     */
    @Data
    public static class PsuDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        private int wattage;
        private String efficiencyRating;
        @NotNull(message = "Modularity is required")
        private String modularity;
        @NotNull(message = "Connectors is required")
        private String connectors;
        private String fanSize;
        private String coolingType;
    }

    /**
     * DTO for {@link Casing}
     */
    @Data
    public static class CasingDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        @NotNull(message = "Form factor is required")
        private String formFactor;
        private String material;
        private String coolingSupport;
        private int expansionSlots;
        private int driveBays35;
        private int driveBays25;
        private String frontPanelPorts;
        private boolean includesRgb;
    }

    /**
     * DTO for {@link CoolingSystem}
     */
    @Data
    public static class CoolingSystemDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        @NotNull(message = "Type is required")
        private String type;
        private String fanSize;
        private String radiatorSize;
        private String noiseLevel;
        @NotNull(message = "Socket compatibility is required")
        private String socketCompatibility;
        private int tdpSupport;
        private boolean includesRgb;
    }

    /**
     * DTO for {@link Networking}
     */
    @Data
    public static class NetworkingDto {
        private Integer id;
        @NotNull(message = "Make is required")
        private String make;
        @NotNull(message = "Model is required")
        private String model;
        @NotNull(message = "Type is required")
        private String type;
        @NotNull(message = "ConnectionInterface is required")
        private String connectionInterface;
        private String wifiStandard;
        private String ethernetSpeed;
        private int antennas;
        private String bluetoothVersion;
    }
}
