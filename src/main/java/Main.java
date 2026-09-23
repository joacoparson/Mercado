void main() {

    IO.println("Proyecto de Mercado");
    Tienda mercadoNegro = new Tienda();
    mercadoNegro.agregarProducto(new DeElectronica("Galaxy A36", 500));
    mercadoNegro.agregarProducto(new DeLineaBlanca("Heladera LG", 3000));
    mercadoNegro.agregarProducto(new Electrodomestico("Microondas Samsung", 1200));
    IO.println("Valor del carrito: $" + mercadoNegro.totalCarro());
    mercadoNegro.imprimirCarro();
    mercadoNegro.granOferta();
    SerializadorTienda.guardarTienda(mercadoNegro, "mercadonegro.xml");
    mercadoNegro = SerializadorTienda.cargarTienda("mercadonegro.xml");
    mercadoNegro.imprimirCarro();
    mercadoNegro.copiarCarro();

    IO.println(" ");
    IO.println("Leyendo de la copia de texto: ");
    try (Stream<String> lines = Files.lines(Path.of("carro.txt"))) {
        lines.forEach(IO::println);
    } catch (IOException e) {IO.println(e.getMessage());}

}