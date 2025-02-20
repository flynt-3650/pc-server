package ru.flynt3650.pc_server.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * DTO for {@link ru.flynt3650.pc_server.models.Pc}
 */
@Data
public class PcDto {
    Integer id;
    String name;
    CpuDto cpu;
    GpuDto gpu;
    MotherboardDto motherboard;
    RamDto ram;
    SsdDto ssd;
    HddDto hdd;
    PsuDto psu;
    CasingDto casing;
    CoolingSystemDto coolingSystem;
    NetworkingDto networking;

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Cpu}
     */
    @Data
    public static class CpuDto {
        Integer id;
        @NotNull
        String make;
        @NotNull
        String model;
        int coreAmount;
        int threadAmount;
        double clockSpeed;
        double l3Size;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
        String model;
        @NotNull
        String formFactor;
        @NotNull
        String socket;
        @NotNull
        String chipset;
        int ramSlotAmount;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
        String model;
        int capacity;
        int amount;
        @NotNull
        String ramType;
        int clock;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Ssd}
     */
    @Data
    public static class SsdDto {
        Integer id;
        @NotNull
        String make;
        @NotNull
        String model;
        int capacity;
        @NotNull
        String type;
        @NotNull
        String formFactor;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
        String model;
        int capacity;
        int rpm;
        int cacheSize;
        @NotNull
        String formFactor;
        @NotNull
        String connectionInterface;
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Psu}
     */
    @Data
    public static class PsuDto {
        Integer id;
        @NotNull
        String make;
        @NotNull
        String model;
        int wattage;
        String efficiencyRating;
        @NotNull
        String modularity;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
        String model;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
        String model;
        @NotNull
        String type;
        String fanSize;
        String radiatorSize;
        String noiseLevel;
        @NotNull
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
        @NotNull
        String make;
        @NotNull
        String model;
        @NotNull
        String type;
        @NotNull
        String connectionInterface;
        String wifiStandard;
        String ethernetSpeed;
        int antennas;
        String bluetoothVersion;
    }
}