import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("¡Bienvenido al Barco Liliana!");
        TransportableFactory f = TransportableFactory.getInstance();
        Transportable carga1 = f.crearTransportable("Carga simple 1");
        Transportable carga2 = f.crearTransportable("Carga simple 2");
        Transportable carga3 = f.crearTransportable("Contenedor");

        System.out.println("La carga uno pesa: " + carga1.getPesoCarga());
        System.out.println("La carga do pesa: " + carga2.getPesoCarga());
        System.out.println("El contenedor pesa: " + carga3.getPesoCarga());

        Barco barcoLiliana =  new Barco();
        barcoLiliana.agregarProducto(carga1);
        barcoLiliana.agregarProducto(carga2);
        barcoLiliana.agregarProducto(carga3);
        barcoLiliana.generarReporte();
    }
}