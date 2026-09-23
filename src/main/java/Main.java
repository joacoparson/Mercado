void main() {

    IO.println("Proyecto de Mercado");
    Tienda mercadoNegro = new Tienda();
    mercadoNegro.agregarProducto(new DeElectronica("Galaxy A36", 500));
    mercadoNegro.agregarProducto(new DeLineaBlanca("Heladera LG", 3000));
    mercadoNegro.agregarProducto(new Electrodomestico("Microondas Samsung", 1200));
    IO.println("Valor del carrito: $" + mercadoNegro.totalCarro());
    mercadoNegro.imprimirCarro();

}