package examen.EpnPlus;

public class EpnPlus {
    // ATRIBUTOS
    private int id;
    private String fecha;
    private double precio;

    // CONSTRUCTORES

    public EpnPlus(int id, String fecha, double precio) {
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
    }

    // GETT Y SETT
    public void setId(int id) {this.id = id;}
    public String getFecha() {return fecha;}
    public double getPrecio() {return precio;}

    // TO string
    @Override
    public String toString() {
        return "EPNPLUS: " +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", precio=" + precio;
    }
}
