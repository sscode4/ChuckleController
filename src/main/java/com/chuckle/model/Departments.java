package com.chuckle.model;

import javax.persistence.*;

@Entity
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "custom_cooling_system_id")
    private CustomCoolingSystem customCoolingSystem;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "processor_id")
    private Processor processor;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cooling_system_id")
    private CoolingSystem coolingSystem;
    private String motherboard;
    private String memory;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String powerSupply;
    private String cabinets;

    // Constructors
    public Departments() {}

//    public Departments(String customCoolingSystem, String processor, String coolingSystem,
//                       String motherboard, String memory, String ram, String storage,
//                       String graphicsCard, String powerSupply, String cabinets) {
//        this.customCoolingSystem = customCoolingSystem;
//        this.processor = processor;
//        this.coolingSystem = coolingSystem;
//        this.motherboard = motherboard;
//        this.memory = memory;
//        this.ram = ram;
//        this.storage = storage;
//        this.graphicsCard = graphicsCard;
//        this.powerSupply = powerSupply;
//        this.cabinets = cabinets;
//    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CustomCoolingSystem getCustomCoolingSystem() {
        return customCoolingSystem;
    }

    public void setCustomCoolingSystem(CustomCoolingSystem customCoolingSystem) {

        this.customCoolingSystem = customCoolingSystem;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getCabinets() {
        return cabinets;
    }

    public void setCabinets(String cabinets) {
        this.cabinets = cabinets;
    }
}
