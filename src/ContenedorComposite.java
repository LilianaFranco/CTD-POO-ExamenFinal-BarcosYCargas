import java.util.ArrayList;

public class ContenedorComposite implements Transportable{

    //Atributos
    private String nombre;
    private String descripción;
    private ArrayList<Transportable> contenedor = new ArrayList<>();
    private Double pesoContendorVacio;

    //Constructor
    public ContenedorComposite(String nombre, String descripción, Double pesoContendorVacio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.pesoContendorVacio = pesoContendorVacio;
    }

    //Métodos
    public void agregarCarga(CargaSimple c){
        this.contenedor.add(c);
    }

    //Implementación de interface
    @Override
    public Double getPesoCarga() {
        Double pesoTotal = 0.0;
        for(Transportable t: this.contenedor){
            pesoTotal += t.getPesoCarga();
        }
        return pesoTotal+100;
    }

    //Getters and setter


    public ArrayList<Transportable> getContenedor() {
        return contenedor;
    }

    public void setContenedor(ArrayList<Transportable> contenedor) {
        this.contenedor = contenedor;
    }
}
