public abstract class persona {
    protected String nombre;

    public persona(String nombre) {
        this.nombre = nombre;
    }


    protected abstract void metodohijos();

    public String getNombre() {
        return nombre;
    }
}


