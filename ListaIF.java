package estDatosRep;

public interface ListaIF {
    public void agregar(Object dato);
    public void muestraLista();
    public boolean buscar(Object dato);
    public Nodo contiene (Object dato);
    public Nodo eliminar (Object dato);
    public void sustituir(Object x, Object y);
}
