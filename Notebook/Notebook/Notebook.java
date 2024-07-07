package Notebook.Notebook;

import java.util.Objects;

// Notebook.Notebook.java
public class Notebook {
    private int id;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(int id, int ram, int hdd, String os, String color) {
        this.id = id;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook.Notebook{" +
                "id=" + id +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;

        if (obj == null || getClass() != obj.getClass()) return  false;

        Notebook notebook = (Notebook) obj;

        return id == notebook.id && ram == notebook.ram && hdd == notebook.hdd
                && os.equals(notebook.os) && color.equals(notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ram, hdd, os, color);
    }
}
