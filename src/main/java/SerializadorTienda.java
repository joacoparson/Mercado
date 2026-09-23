import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class SerializadorTienda implements Serializable {

    public static void guardarTienda(Tienda tienda, String ruta) {
        try (XMLEncoder encoder = new XMLEncoder(new FileOutputStream(ruta))) {
            encoder.writeObject(tienda);
        } catch (IOException e) {IO.println(e.getMessage());}
    }

    public static Tienda cargarTienda(String ruta) {
        try (XMLDecoder decoder = new XMLDecoder(new FileInputStream(ruta))) {
            return (Tienda) decoder.readObject();
        } catch (IOException e) {IO.println(e.getMessage());}
        return null;
    }
}
