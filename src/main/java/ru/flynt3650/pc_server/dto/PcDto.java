package ru.flynt3650.pc_server.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * DTO for {@link ru.flynt3650.pc_server.models.Pc}
 */
@Data
public class PcDto {
    Integer id;
    @NotNull(message = "Name is required")
    String name;

    @Valid
    @NotNull(message = "Cpu is required")
    CpuDto cpu;

    @Valid
    @NotNull(message = "Gpu is required")
    GpuDto gpu;

    @Valid
    @NotNull(message = "Motherboard is required")
    MotherboardDto motherboard;

    @Valid
    @NotNull(message = "Ram is required")
    RamDto ram;

    @Valid
    @NotNull(message = "Ssd is required")
    SsdDto ssd;

    @Valid
    @NotNull(message = "Hdd is required")
    HddDto hdd;

    @Valid
    @NotNull(message = "Psu is required")
    PsuDto psu;

    @Valid
    @NotNull(message = "Case is required")
    CasingDto casing;

    @Valid
    @NotNull(message = "Cooling system is required")
    CoolingSystemDto coolingSystem;

    @Valid
    @NotNull(message = "Networking is required")
    NetworkingDto networking;

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Cpu}
     */
    @Data
    public static class CpuDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        int coreAmount;
        int threadAmount;
        double clockSpeed;
        double l3Size;
        @NotNull(message = "Socket is required")
        String socket;
        String igpu;
        int tdp;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Gpu}
     */
    @Data
    public static class GpuDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        int vramSize;
        int clockSpeed;
        int memBusWidth;
        boolean hasHdmi;
        boolean hasDp;
        boolean hasUsbc;
        boolean hasDvi;
        boolean hasVga;
        int powerConsumption;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Motherboard}
     */
    @Data
    public static class MotherboardDto {
        Integer id;
        @NotNull(message = "make is required")
        String make;
        @NotNull(message = "model is required")
        String model;
        @NotNull(message = "form_factor is required")
        String formFactor;
        @NotNull(message = "socket is required")
        String socket;
        @NotNull(message = "chipset is required")
        String chipset;
        int ramSlotAmount;
        @NotNull(message = "ram_type is required")
        String ramType;
        int pcie16Amount;
        int pcie4Amount;
        int pcie1Amount;
        int m2Amount;
        int sataAmount;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Ram}
     */
    @Data
    public static class RamDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        int capacity;
        int amount;
        @NotNull(message = "RamType is required")
        String ramType;
        int clock;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Ssd}
     */
    @Data
    public static class SsdDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        int capacity;
        @NotNull(message = "Type is required")
        String type;
        @NotNull(message = "FormFactor is required")
        String formFactor;
        @NotNull(message = "ConnectionInterface is required")
        String connectionInterface;
        int readSpeed;
        int writeSpeed;
        int tbw;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Hdd}
     */
    @Data
    public static class HddDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        int capacity;
        int rpm;
        int cacheSize;
        @NotNull(message = "FormFactor is required")
        String formFactor;
        @NotNull(message = "ConnectionInterface is required")
        String connectionInterface;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Psu}
     */
    @Data
    public static class PsuDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        int wattage;
        String efficiencyRating;
        @NotNull(message = "Modularity is required")
        String modularity;
        @NotNull(message = "Connectors is required")
        String connectors;
        String fanSize;
        String coolingType;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Casing}
     */
    @Data
    public static class CasingDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        @NotNull(message = "Form factor is required")
        String formFactor;
        String material;
        String coolingSupport;
        int expansionSlots;
        int driveBays35;
        int driveBays25;
        String frontPanelPorts;
        boolean includesRgb;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.CoolingSystem}
     */
    @Data
    public static class CoolingSystemDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        @NotNull(message = "Type is required")
        String type;
        String fanSize;
        String radiatorSize;
        String noiseLevel;
        @NotNull(message = "Socket compatibility is required")
        String socketCompatibility;
        int tdpSupport;
        boolean includesRgb;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Networking}
     */
    @Data
    public static class NetworkingDto {
        Integer id;
        @NotNull(message = "Make is required")
        String make;
        @NotNull(message = "Model is required")
        String model;
        @NotNull(message = "Type is required")
        String type;
        @NotNull(message = "ConnectionInterface is required")
        String connectionInterface;
        String wifiStandard;
        String ethernetSpeed;
        int antennas;
        String bluetoothVersion;
    }
}