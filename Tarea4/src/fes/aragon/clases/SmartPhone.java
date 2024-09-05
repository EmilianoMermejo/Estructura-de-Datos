package fes.aragon.clases;

public class SmartPhone {
    private String marca;
    private int almacenamiento;
    private String color;
    private int AnioDeFabricacion;
    private int ram;
    private int posicion;

    public SmartPhone(int posicion ,String marca, int anioDeFabricacion, int ram, int almacenamiento, String color){
        this.marca = marca;
        AnioDeFabricacion = anioDeFabricacion;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.color = color;
        this.posicion =posicion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioDeFabricacion() {
        return AnioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        AnioDeFabricacion = anioDeFabricacion;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return
                "\n\tSmartPhone '" + posicion + '\'' +
                        "\n\tMarca: '" + marca + '\'' +
                        ",\n\tAño de Fabricación: " + AnioDeFabricacion +
                        ",\n\tRAM: " + ram + " GB" +
                        ",\n\tAlmacenamiento: " + almacenamiento + " GB" +
                        ",\n\tColor: '" + color + '\'';
    }

}
