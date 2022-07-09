public class TransportableFactory {

    private static TransportableFactory instancia;

    private TransportableFactory() {

    }

    public static TransportableFactory getInstance() {
        if (instancia == null) {
            instancia = new TransportableFactory();
        }
        return instancia;
    }

    public Transportable crearTransportable(String s) {
        switch (s) {
            case "Carga simple 1":
                CargaSimple cargaSimpleUno = new CargaSimple("TV", "32’ LCD", 3.0, false);
                return cargaSimpleUno;
            case "Carga simple 2":
                CargaSimple cargaSimpleDos = new CargaSimple("Caja", "Medicamentos", 2.0, true);
                return cargaSimpleDos;
            case "Contenedor":
                CargaSimple cargaSimpleTres = new CargaSimple("TV", "32’ LCD", 3.0, false);
                CargaSimple cargaSimpleCuatro = new CargaSimple("Caja", "Medicamentos", 2.0, true);
                ContenedorComposite contenedor = new ContenedorComposite("contendor", "varios", 100.0);
                contenedor.agregarCarga(cargaSimpleTres);
                contenedor.agregarCarga(cargaSimpleCuatro);
                return contenedor;
            default:
                return null;
        }
    }
}
