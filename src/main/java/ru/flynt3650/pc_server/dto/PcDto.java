package ru.flynt3650.pc_server.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * DTO for {@link ru.flynt3650.pc_server.models.Pc}
 */
public class PcDto {
    private final String name;
    private final CpuDto cpu;
    private final GpuDto gpu;
    private final MotherboardDto motherboard;
    private final RamDto ram;
    private final SsdDto ssd;
    private final HddDto hdd;
    private final PsuDto psu;
    private final CasingDto casing;
    private final CoolingSystemDto coolingSystem;
    private final NetworkingDto networking;

    public PcDto(String name, CpuDto cpu, GpuDto gpu, MotherboardDto motherboard, RamDto ram, SsdDto ssd, HddDto hdd, PsuDto psu, CasingDto casing, CoolingSystemDto coolingSystem, NetworkingDto networking) {
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
    }

    public String getName() {
        return name;
    }

    public CpuDto getCpu() {
        return cpu;
    }

    public GpuDto getGpu() {
        return gpu;
    }

    public MotherboardDto getMotherboard() {
        return motherboard;
    }

    public RamDto getRam() {
        return ram;
    }

    public SsdDto getSsd() {
        return ssd;
    }

    public HddDto getHdd() {
        return hdd;
    }

    public PsuDto getPsu() {
        return psu;
    }

    public CasingDto getCasing() {
        return casing;
    }

    public CoolingSystemDto getCoolingSystem() {
        return coolingSystem;
    }

    public NetworkingDto getNetworking() {
        return networking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcDto entity = (PcDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.cpu, entity.cpu) &&
                Objects.equals(this.gpu, entity.gpu) &&
                Objects.equals(this.motherboard, entity.motherboard) &&
                Objects.equals(this.ram, entity.ram) &&
                Objects.equals(this.ssd, entity.ssd) &&
                Objects.equals(this.hdd, entity.hdd) &&
                Objects.equals(this.psu, entity.psu) &&
                Objects.equals(this.casing, entity.casing) &&
                Objects.equals(this.coolingSystem, entity.coolingSystem) &&
                Objects.equals(this.networking, entity.networking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpu, gpu, motherboard, ram, ssd, hdd, psu, casing, coolingSystem, networking);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "cpu = " + cpu + ", " +
                "gpu = " + gpu + ", " +
                "motherboard = " + motherboard + ", " +
                "ram = " + ram + ", " +
                "ssd = " + ssd + ", " +
                "hdd = " + hdd + ", " +
                "psu = " + psu + ", " +
                "casing = " + casing + ", " +
                "coolingSystem = " + coolingSystem + ", " +
                "networking = " + networking + ")";
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Cpu}
     */
    public static class CpuDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        private final int coreAmount;
        private final int threadAmount;
        private final double clockSpeed;
        private final double l3Size;
        @NotNull
        private final String socket;
        private final String igpu;
        private final int tdp;

        public CpuDto(int id, String make, String model, int coreAmount, int threadAmount, double clockSpeed, double l3Size, String socket, String igpu, int tdp) {
            this.id = id;
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

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getCoreAmount() {
            return coreAmount;
        }

        public int getThreadAmount() {
            return threadAmount;
        }

        public double getClockSpeed() {
            return clockSpeed;
        }

        public double getL3Size() {
            return l3Size;
        }

        public String getSocket() {
            return socket;
        }

        public String getIgpu() {
            return igpu;
        }

        public int getTdp() {
            return tdp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CpuDto entity = (CpuDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.coreAmount, entity.coreAmount) &&
                    Objects.equals(this.threadAmount, entity.threadAmount) &&
                    Objects.equals(this.clockSpeed, entity.clockSpeed) &&
                    Objects.equals(this.l3Size, entity.l3Size) &&
                    Objects.equals(this.socket, entity.socket) &&
                    Objects.equals(this.igpu, entity.igpu) &&
                    Objects.equals(this.tdp, entity.tdp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, coreAmount, threadAmount, clockSpeed, l3Size, socket, igpu, tdp);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "coreAmount = " + coreAmount + ", " +
                    "threadAmount = " + threadAmount + ", " +
                    "clockSpeed = " + clockSpeed + ", " +
                    "l3Size = " + l3Size + ", " +
                    "socket = " + socket + ", " +
                    "igpu = " + igpu + ", " +
                    "tdp = " + tdp + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Gpu}
     */
    public static class GpuDto {
        private final int id;
        @NotNull
        private final String make;
        private final int vramSize;
        private final int clockSpeed;
        private final int memBusWidth;
        private final boolean hasHdmi;
        private final boolean hasDp;
        private final boolean hasUsbc;
        private final boolean hasDvi;
        private final boolean hasVga;
        private final int powerConsumption;
        @NotNull
        private final String model;

        public GpuDto(int id, String make, int vramSize, int clockSpeed, int memBusWidth, boolean hasHdmi, boolean hasDp, boolean hasUsbc, boolean hasDvi, boolean hasVga, int powerConsumption, String model) {
            this.id = id;
            this.make = make;
            this.vramSize = vramSize;
            this.clockSpeed = clockSpeed;
            this.memBusWidth = memBusWidth;
            this.hasHdmi = hasHdmi;
            this.hasDp = hasDp;
            this.hasUsbc = hasUsbc;
            this.hasDvi = hasDvi;
            this.hasVga = hasVga;
            this.powerConsumption = powerConsumption;
            this.model = model;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public int getVramSize() {
            return vramSize;
        }

        public int getClockSpeed() {
            return clockSpeed;
        }

        public int getMemBusWidth() {
            return memBusWidth;
        }

        public boolean getHasHdmi() {
            return hasHdmi;
        }

        public boolean getHasDp() {
            return hasDp;
        }

        public boolean getHasUsbc() {
            return hasUsbc;
        }

        public boolean getHasDvi() {
            return hasDvi;
        }

        public boolean getHasVga() {
            return hasVga;
        }

        public int getPowerConsumption() {
            return powerConsumption;
        }

        public String getModel() {
            return model;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GpuDto entity = (GpuDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.vramSize, entity.vramSize) &&
                    Objects.equals(this.clockSpeed, entity.clockSpeed) &&
                    Objects.equals(this.memBusWidth, entity.memBusWidth) &&
                    Objects.equals(this.hasHdmi, entity.hasHdmi) &&
                    Objects.equals(this.hasDp, entity.hasDp) &&
                    Objects.equals(this.hasUsbc, entity.hasUsbc) &&
                    Objects.equals(this.hasDvi, entity.hasDvi) &&
                    Objects.equals(this.hasVga, entity.hasVga) &&
                    Objects.equals(this.powerConsumption, entity.powerConsumption) &&
                    Objects.equals(this.model, entity.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, vramSize, clockSpeed, memBusWidth, hasHdmi, hasDp, hasUsbc, hasDvi, hasVga, powerConsumption, model);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "vramSize = " + vramSize + ", " +
                    "clockSpeed = " + clockSpeed + ", " +
                    "memBusWidth = " + memBusWidth + ", " +
                    "hasHdmi = " + hasHdmi + ", " +
                    "hasDp = " + hasDp + ", " +
                    "hasUsbc = " + hasUsbc + ", " +
                    "hasDvi = " + hasDvi + ", " +
                    "hasVga = " + hasVga + ", " +
                    "powerConsumption = " + powerConsumption + ", " +
                    "model = " + model + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Motherboard}
     */
    public static class MotherboardDto {
        private final int id;
        @NotNull
        private final String model;
        @NotNull
        private final String formFactor;
        @NotNull
        private final String socket;
        @NotNull
        private final String chipset;
        private final int ramSlotAmount;
        @NotNull
        private final String ramType;
        private final int pcie16Amount;
        private final int pcie4Amount;
        private final int pcie1Amount;
        private final int m2Amount;
        private final int sataAmount;
        @NotNull
        private final String make;

        public MotherboardDto(int id, String model, String formFactor, String socket, String chipset, int ramSlotAmount, String ramType, int pcie16Amount, int pcie4Amount, int pcie1Amount, int m2Amount, int sataAmount, String make) {
            this.id = id;
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
            this.make = make;
        }

        public int getId() {
            return id;
        }

        public String getModel() {
            return model;
        }

        public String getFormFactor() {
            return formFactor;
        }

        public String getSocket() {
            return socket;
        }

        public String getChipset() {
            return chipset;
        }

        public int getRamSlotAmount() {
            return ramSlotAmount;
        }

        public String getRamType() {
            return ramType;
        }

        public int getPcie16Amount() {
            return pcie16Amount;
        }

        public int getPcie4Amount() {
            return pcie4Amount;
        }

        public int getPcie1Amount() {
            return pcie1Amount;
        }

        public int getM2Amount() {
            return m2Amount;
        }

        public int getSataAmount() {
            return sataAmount;
        }

        public String getMake() {
            return make;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MotherboardDto entity = (MotherboardDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.formFactor, entity.formFactor) &&
                    Objects.equals(this.socket, entity.socket) &&
                    Objects.equals(this.chipset, entity.chipset) &&
                    Objects.equals(this.ramSlotAmount, entity.ramSlotAmount) &&
                    Objects.equals(this.ramType, entity.ramType) &&
                    Objects.equals(this.pcie16Amount, entity.pcie16Amount) &&
                    Objects.equals(this.pcie4Amount, entity.pcie4Amount) &&
                    Objects.equals(this.pcie1Amount, entity.pcie1Amount) &&
                    Objects.equals(this.m2Amount, entity.m2Amount) &&
                    Objects.equals(this.sataAmount, entity.sataAmount) &&
                    Objects.equals(this.make, entity.make);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, model, formFactor, socket, chipset, ramSlotAmount, ramType, pcie16Amount, pcie4Amount, pcie1Amount, m2Amount, sataAmount, make);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "model = " + model + ", " +
                    "formFactor = " + formFactor + ", " +
                    "socket = " + socket + ", " +
                    "chipset = " + chipset + ", " +
                    "ramSlotAmount = " + ramSlotAmount + ", " +
                    "ramType = " + ramType + ", " +
                    "pcie16Amount = " + pcie16Amount + ", " +
                    "pcie4Amount = " + pcie4Amount + ", " +
                    "pcie1Amount = " + pcie1Amount + ", " +
                    "m2Amount = " + m2Amount + ", " +
                    "sataAmount = " + sataAmount + ", " +
                    "make = " + make + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Ram}
     */
    public static class RamDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        private final int capacity;
        private final int amount;
        @NotNull
        private final String ramType;
        private final int clock;

        public RamDto(int id, String make, String model, int capacity, int amount, String ramType, int clock) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.capacity = capacity;
            this.amount = amount;
            this.ramType = ramType;
            this.clock = clock;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getCapacity() {
            return capacity;
        }

        public int getAmount() {
            return amount;
        }

        public String getRamType() {
            return ramType;
        }

        public int getClock() {
            return clock;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RamDto entity = (RamDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.capacity, entity.capacity) &&
                    Objects.equals(this.amount, entity.amount) &&
                    Objects.equals(this.ramType, entity.ramType) &&
                    Objects.equals(this.clock, entity.clock);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, capacity, amount, ramType, clock);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "capacity = " + capacity + ", " +
                    "amount = " + amount + ", " +
                    "ramType = " + ramType + ", " +
                    "clock = " + clock + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Ssd}
     */
    public static class SsdDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        private final int capacity;
        @NotNull
        private final String type;
        @NotNull
        private final String formFactor;
        @NotNull
        private final String connectionInterface;
        private final int readSpeed;
        private final int writeSpeed;
        private final int tbw;

        public SsdDto(int id, String make, String model, int capacity, String type, String formFactor, String connectionInterface, int readSpeed, int writeSpeed, int tbw) {
            this.id = id;
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

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getType() {
            return type;
        }

        public String getFormFactor() {
            return formFactor;
        }

        public String getConnectionInterface() {
            return connectionInterface;
        }

        public int getReadSpeed() {
            return readSpeed;
        }

        public int getWriteSpeed() {
            return writeSpeed;
        }

        public int getTbw() {
            return tbw;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SsdDto entity = (SsdDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.capacity, entity.capacity) &&
                    Objects.equals(this.type, entity.type) &&
                    Objects.equals(this.formFactor, entity.formFactor) &&
                    Objects.equals(this.connectionInterface, entity.connectionInterface) &&
                    Objects.equals(this.readSpeed, entity.readSpeed) &&
                    Objects.equals(this.writeSpeed, entity.writeSpeed) &&
                    Objects.equals(this.tbw, entity.tbw);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, capacity, type, formFactor, connectionInterface, readSpeed, writeSpeed, tbw);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "capacity = " + capacity + ", " +
                    "type = " + type + ", " +
                    "formFactor = " + formFactor + ", " +
                    "connectionInterface = " + connectionInterface + ", " +
                    "readSpeed = " + readSpeed + ", " +
                    "writeSpeed = " + writeSpeed + ", " +
                    "tbw = " + tbw + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Hdd}
     */
    public static class HddDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        private final int capacity;
        private final int rpm;
        private final int cacheSize;
        @NotNull
        private final String formFactor;
        @NotNull
        private final String connectionInterface;

        public HddDto(int id, String make, String model, int capacity, int rpm, int cacheSize, String formFactor, String connectionInterface) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.capacity = capacity;
            this.rpm = rpm;
            this.cacheSize = cacheSize;
            this.formFactor = formFactor;
            this.connectionInterface = connectionInterface;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getCapacity() {
            return capacity;
        }

        public int getRpm() {
            return rpm;
        }

        public int getCacheSize() {
            return cacheSize;
        }

        public String getFormFactor() {
            return formFactor;
        }

        public String getConnectionInterface() {
            return connectionInterface;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HddDto entity = (HddDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.capacity, entity.capacity) &&
                    Objects.equals(this.rpm, entity.rpm) &&
                    Objects.equals(this.cacheSize, entity.cacheSize) &&
                    Objects.equals(this.formFactor, entity.formFactor) &&
                    Objects.equals(this.connectionInterface, entity.connectionInterface);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, capacity, rpm, cacheSize, formFactor, connectionInterface);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "capacity = " + capacity + ", " +
                    "rpm = " + rpm + ", " +
                    "cacheSize = " + cacheSize + ", " +
                    "formFactor = " + formFactor + ", " +
                    "connectionInterface = " + connectionInterface + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Psu}
     */
    public static class PsuDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        private final int wattage;
        private final String efficiencyRating;
        @NotNull
        private final String modularity;
        @NotNull
        private final String connectors;
        private final String fanSize;
        private final String coolingType;

        public PsuDto(int id, String make, String model, int wattage, String efficiencyRating, String modularity, String connectors, String fanSize, String coolingType) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.wattage = wattage;
            this.efficiencyRating = efficiencyRating;
            this.modularity = modularity;
            this.connectors = connectors;
            this.fanSize = fanSize;
            this.coolingType = coolingType;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getWattage() {
            return wattage;
        }

        public String getEfficiencyRating() {
            return efficiencyRating;
        }

        public String getModularity() {
            return modularity;
        }

        public String getConnectors() {
            return connectors;
        }

        public String getFanSize() {
            return fanSize;
        }

        public String getCoolingType() {
            return coolingType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PsuDto entity = (PsuDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.wattage, entity.wattage) &&
                    Objects.equals(this.efficiencyRating, entity.efficiencyRating) &&
                    Objects.equals(this.modularity, entity.modularity) &&
                    Objects.equals(this.connectors, entity.connectors) &&
                    Objects.equals(this.fanSize, entity.fanSize) &&
                    Objects.equals(this.coolingType, entity.coolingType);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, wattage, efficiencyRating, modularity, connectors, fanSize, coolingType);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "wattage = " + wattage + ", " +
                    "efficiencyRating = " + efficiencyRating + ", " +
                    "modularity = " + modularity + ", " +
                    "connectors = " + connectors + ", " +
                    "fanSize = " + fanSize + ", " +
                    "coolingType = " + coolingType + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Casing}
     */
    public static class CasingDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        @NotNull
        private final String formFactor;
        private final String material;
        private final String coolingSupport;
        private final int expansionSlots;
        private final int driveBays35;
        private final int driveBays25;
        private final String frontPanelPorts;
        private final boolean includesRgb;

        public CasingDto(int id, String make, String model, String formFactor, String material, String coolingSupport, int expansionSlots, int driveBays35, int driveBays25, String frontPanelPorts, boolean includesRgb) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.formFactor = formFactor;
            this.material = material;
            this.coolingSupport = coolingSupport;
            this.expansionSlots = expansionSlots;
            this.driveBays35 = driveBays35;
            this.driveBays25 = driveBays25;
            this.frontPanelPorts = frontPanelPorts;
            this.includesRgb = includesRgb;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String getFormFactor() {
            return formFactor;
        }

        public String getMaterial() {
            return material;
        }

        public String getCoolingSupport() {
            return coolingSupport;
        }

        public int getExpansionSlots() {
            return expansionSlots;
        }

        public int getDriveBays35() {
            return driveBays35;
        }

        public int getDriveBays25() {
            return driveBays25;
        }

        public String getFrontPanelPorts() {
            return frontPanelPorts;
        }

        public boolean getIncludesRgb() {
            return includesRgb;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CasingDto entity = (CasingDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.formFactor, entity.formFactor) &&
                    Objects.equals(this.material, entity.material) &&
                    Objects.equals(this.coolingSupport, entity.coolingSupport) &&
                    Objects.equals(this.expansionSlots, entity.expansionSlots) &&
                    Objects.equals(this.driveBays35, entity.driveBays35) &&
                    Objects.equals(this.driveBays25, entity.driveBays25) &&
                    Objects.equals(this.frontPanelPorts, entity.frontPanelPorts) &&
                    Objects.equals(this.includesRgb, entity.includesRgb);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, formFactor, material, coolingSupport, expansionSlots, driveBays35, driveBays25, frontPanelPorts, includesRgb);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "formFactor = " + formFactor + ", " +
                    "material = " + material + ", " +
                    "coolingSupport = " + coolingSupport + ", " +
                    "expansionSlots = " + expansionSlots + ", " +
                    "driveBays35 = " + driveBays35 + ", " +
                    "driveBays25 = " + driveBays25 + ", " +
                    "frontPanelPorts = " + frontPanelPorts + ", " +
                    "includesRgb = " + includesRgb + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.CoolingSystem}
     */
    public static class CoolingSystemDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        @NotNull
        private final String type;
        private final String fanSize;
        private final String radiatorSize;
        private final String noiseLevel;
        @NotNull
        private final String socketCompatibility;
        private final int tdpSupport;
        private final boolean includesRgb;

        public CoolingSystemDto(int id, String make, String model, String type, String fanSize, String radiatorSize, String noiseLevel, String socketCompatibility, int tdpSupport, boolean includesRgb) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.type = type;
            this.fanSize = fanSize;
            this.radiatorSize = radiatorSize;
            this.noiseLevel = noiseLevel;
            this.socketCompatibility = socketCompatibility;
            this.tdpSupport = tdpSupport;
            this.includesRgb = includesRgb;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String getType() {
            return type;
        }

        public String getFanSize() {
            return fanSize;
        }

        public String getRadiatorSize() {
            return radiatorSize;
        }

        public String getNoiseLevel() {
            return noiseLevel;
        }

        public String getSocketCompatibility() {
            return socketCompatibility;
        }

        public int getTdpSupport() {
            return tdpSupport;
        }

        public boolean getIncludesRgb() {
            return includesRgb;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CoolingSystemDto entity = (CoolingSystemDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.type, entity.type) &&
                    Objects.equals(this.fanSize, entity.fanSize) &&
                    Objects.equals(this.radiatorSize, entity.radiatorSize) &&
                    Objects.equals(this.noiseLevel, entity.noiseLevel) &&
                    Objects.equals(this.socketCompatibility, entity.socketCompatibility) &&
                    Objects.equals(this.tdpSupport, entity.tdpSupport) &&
                    Objects.equals(this.includesRgb, entity.includesRgb);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, type, fanSize, radiatorSize, noiseLevel, socketCompatibility, tdpSupport, includesRgb);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "type = " + type + ", " +
                    "fanSize = " + fanSize + ", " +
                    "radiatorSize = " + radiatorSize + ", " +
                    "noiseLevel = " + noiseLevel + ", " +
                    "socketCompatibility = " + socketCompatibility + ", " +
                    "tdpSupport = " + tdpSupport + ", " +
                    "includesRgb = " + includesRgb + ")";
        }
    }

    /**
     * DTO for {@link ru.flynt3650.pc_server.models.Networking}
     */
    public static class NetworkingDto {
        private final int id;
        @NotNull
        private final String make;
        @NotNull
        private final String model;
        @NotNull
        private final String type;
        @NotNull
        private final String connectionInterface;
        private final String wifiStandard;
        private final String ethernetSpeed;
        private final int antennas;
        private final String bluetoothVersion;

        public NetworkingDto(int id, String make, String model, String type, String connectionInterface, String wifiStandard, String ethernetSpeed, int antennas, String bluetoothVersion) {
            this.id = id;
            this.make = make;
            this.model = model;
            this.type = type;
            this.connectionInterface = connectionInterface;
            this.wifiStandard = wifiStandard;
            this.ethernetSpeed = ethernetSpeed;
            this.antennas = antennas;
            this.bluetoothVersion = bluetoothVersion;
        }

        public int getId() {
            return id;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String getType() {
            return type;
        }

        public String getConnectionInterface() {
            return connectionInterface;
        }

        public String getWifiStandard() {
            return wifiStandard;
        }

        public String getEthernetSpeed() {
            return ethernetSpeed;
        }

        public int getAntennas() {
            return antennas;
        }

        public String getBluetoothVersion() {
            return bluetoothVersion;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NetworkingDto entity = (NetworkingDto) o;
            return Objects.equals(this.id, entity.id) &&
                    Objects.equals(this.make, entity.make) &&
                    Objects.equals(this.model, entity.model) &&
                    Objects.equals(this.type, entity.type) &&
                    Objects.equals(this.connectionInterface, entity.connectionInterface) &&
                    Objects.equals(this.wifiStandard, entity.wifiStandard) &&
                    Objects.equals(this.ethernetSpeed, entity.ethernetSpeed) &&
                    Objects.equals(this.antennas, entity.antennas) &&
                    Objects.equals(this.bluetoothVersion, entity.bluetoothVersion);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, make, model, type, connectionInterface, wifiStandard, ethernetSpeed, antennas, bluetoothVersion);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ", " +
                    "make = " + make + ", " +
                    "model = " + model + ", " +
                    "type = " + type + ", " +
                    "connectionInterface = " + connectionInterface + ", " +
                    "wifiStandard = " + wifiStandard + ", " +
                    "ethernetSpeed = " + ethernetSpeed + ", " +
                    "antennas = " + antennas + ", " +
                    "bluetoothVersion = " + bluetoothVersion + ")";
        }
    }
}