public class DeElectronica extends Producto {

    public DeElectronica(String nombre, double precio) {
        super.setNombre(nombre);
        super.setPrecio(precio);
    }

    public DeElectronica() {}

    @Override
    public double blackFriday() {
        return (super.getPrecio() * 0.6); //Descuento de %40
    }
}
