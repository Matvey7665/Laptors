public class Laptop {
    private String brand;
    private int ram;//ОЗУ
    private int hddSize;//Объем жд
    private String os;//Операционная система
    private String color;

    public Laptop(String brand, int ram, int hddSize, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ноутбук[Бренд: "+brand+",ОЗУ: "+ram+"GB,Объем жд:"+hddSize+",OC: "+os+",Цвет: "+color+"]";
    }
}
