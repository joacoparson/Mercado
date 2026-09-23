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
}
