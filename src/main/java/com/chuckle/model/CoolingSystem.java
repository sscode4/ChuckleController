package com.chuckle.model;


import javax.persistence.*;

@Entity
public class CoolingSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diyOrCoolingSystem;
    private String aioLiquidCoolingKit;
    private String cpuFanCoolingKit;

    // Constructors
    public CoolingSystem() {}

    public CoolingSystem(String diyOrCoolingSystem, String aioLiquidCoolingKit, String cpuFanCoolingKit) {
        this.diyOrCoolingSystem = diyOrCoolingSystem;
        this.aioLiquidCoolingKit = aioLiquidCoolingKit;
        this.cpuFanCoolingKit = cpuFanCoolingKit;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiyOrCoolingSystem() {
        return diyOrCoolingSystem;
    }

    public void setDiyOrCoolingSystem(String diyOrCoolingSystem) {
        this.diyOrCoolingSystem = diyOrCoolingSystem;
    }

    public String getAioLiquidCoolingKit() {
        return aioLiquidCoolingKit;
    }

    public void setAioLiquidCoolingKit(String aioLiquidCoolingKit) {
        this.aioLiquidCoolingKit = aioLiquidCoolingKit;
    }

    public String getCpuFanCoolingKit() {
        return cpuFanCoolingKit;
    }

    public void setCpuFanCoolingKit(String cpuFanCoolingKit) {
        this.cpuFanCoolingKit = cpuFanCoolingKit;
    }
}