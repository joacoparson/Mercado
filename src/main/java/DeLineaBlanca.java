public class DeLineaBlanca extends Producto {

    public DeLineaBlanca(String nombre, double precio) {
        super.setNombre(nombre);
        super.setPrecio(precio);
    }

    @Override
    public double blackFriday() {
        return (super.getPrecio() * 0.65); //Descuento de %35
    }

}
