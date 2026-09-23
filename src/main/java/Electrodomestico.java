public class Electrodomestico extends Producto {

    public Electrodomestico(String nombre, double precio) {
        super.setNombre(nombre);
        super.setPrecio(precio);
    }

    @Override
    public double blackFriday() {
        return (super.getPrecio() * 0.4); //Descuento de %60
    }

}
