package com.chuckle.items.model;

import javax.persistence.*;

@Entity
public abstract class CustomCoolingSystem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String hydro_x_series;

  private String  ekwb;

  private String byksky;

  public CustomCoolingSystem() {
  }

  public CustomCoolingSystem(Integer id, String hydro_x_series, String ekwb, String byksky) {
    this.id = id;
    this.hydro_x_series = hydro_x_series;
    this.ekwb = ekwb;
    this.byksky = byksky;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getHydro_x_series() {
    return hydro_x_series;
  }

  public void setHydro_x_series(String hydro_x_series) {
    this.hydro_x_series = hydro_x_series;
  }

  public String getEkwb() {
    return ekwb;
  }

  public void setEkwb(String ekwb) {
    this.ekwb = ekwb;
  }

  public String getByksky() {
    return byksky;
  }

  public void setByksky(String byksky) {
    this.byksky = byksky;
  }

  @Override
  public String toString() {
    return "CustomCoolingSystem{" +
            "id=" + id +
            ", hydro_x_series='" + hydro_x_series + '\'' +
            ", ekwb='" + ekwb + '\'' +
            ", byksky='" + byksky + '\'' +
            '}';
  }

  public abstract CustomCoolingSystem getAllCoolingSystem(Long id);
}

