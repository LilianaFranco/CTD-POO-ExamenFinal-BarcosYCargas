public class CargaSimple implements Transportable{

    //Atributos
    private String nombre;
    private String descripción;
    private Double peso;
    private boolean refrigeracion;

    //Constructor
    public CargaSimple(String nombre, String descripción, Double peso, boolean refrigeracion ) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.peso = peso;
        this.refrigeracion = refrigeracion;
    }

    //Implementación interface
    @Override
    public Double getPesoCarga() {
        if (this.refrigeracion){
            return this.peso*1.1;
        }
        return this.peso;
    }

    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }
}
