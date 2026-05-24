package org.example;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien{id=" + id + ", name='" + name + "'}";
    }
}
