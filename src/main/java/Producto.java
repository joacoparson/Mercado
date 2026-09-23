public abstract class Producto implements Comparable<Producto> {

    private String nombre;
    private double precio;

    //Setters y Getters:
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    //Constructor Vacío para XML:
    public Producto() {}

    public abstract double blackFriday();

    @Override
    public String toString() {
        return (nombre + " / Valor original: $" + precio + " / Black Friday: $" + this.blackFriday());
    }

    @Override
    public int compareTo(Producto producto) {
        return Double.compare(this.getPrecio(), producto.getPrecio());
    }

}
