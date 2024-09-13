public final class PersonalAdmvo extends asalariado {
    private double salario;

    public PersonalAdmvo(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    protected void metodohijos() {
        System.out.println("Método implementado por Personal Administrativo.");
    }

    @Override
    public void calcularBono() {
        double bono = salario * 0.05;
        System.out.println("El bono de " + nombre + " es: " + bono);
    }
}

