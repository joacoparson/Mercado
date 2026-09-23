import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tienda {

    private List<Producto> carroCompras;

    //Setters y Getters:
    public List<Producto> getCarroCompras() {return carroCompras;}
    public void setCarroCompras(List<Producto> carroCompras) {this.carroCompras = carroCompras;}

    public Tienda() {
        this.carroCompras = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.carroCompras.add(producto);
    }

    public double totalCarro() {
        return carroCompras.stream().mapToDouble(Producto::blackFriday).sum();
    }

    public void imprimirCarro() {
        Collections.sort(carroCompras);
        carroCompras.forEach(IO::println);
    }

    //Informa productos que tengan un descuento mayor al %50
    public void granOferta() {
        IO.println("Los siguientes productos tienen una gran oferta!");
        this.carroCompras.stream()
                .filter(producto -> producto.blackFriday() < (producto.getPrecio() / 2))
                .map(Producto::getNombre).forEach(IO::println);
    }

    public void copiarCarro() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("carro.txt"))) {
            for (Producto producto : carroCompras) {
                writer.write(producto.toString());
                writer.newLine();
            }
        } catch (IOException e) {IO.println(e.getMessage());}
    }
}
