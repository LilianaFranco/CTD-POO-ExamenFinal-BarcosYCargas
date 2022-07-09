import java.util.ArrayList;

public class Barco {

    //Atributos
    private ArrayList<Transportable> cargas;

    //Constructor
    public Barco() {
    }

    //Métodos
    public void agregarProducto(Transportable t) {
        if(this.cargas == null){
            this.cargas = new ArrayList<>();
        }
        this.cargas.add(t);
    }

    public void generarReporte(){
        for(Transportable t: this.cargas){
            System.out.println("La carga " + t.getClass() + " tiene un peso de " + t.getPesoCarga());
        }
    }

    //Getter and setter

    public ArrayList<Transportable> getCargas() {
        return cargas;
    }

    public void setCargas(ArrayList<Transportable> cargas) {
        this.cargas = cargas;
    }
}
