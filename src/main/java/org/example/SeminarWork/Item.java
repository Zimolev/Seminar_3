package org.example.SeminarWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Item {
    private String name;
    private String country;
    private Integer volume;


    /**Весь этот код написан спомощью анатаций lombok

     public Item(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public Integer getVolume() {
        return volume;
    }
    public Item() {
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                '}';
    */
}
