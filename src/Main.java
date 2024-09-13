public class Main {
    public static void main(String[] args) {
        PersonalAdmvo personalAdmvo = new PersonalAdmvo("Tatiana", 200);
        ProfesorTitular profesorTitular = new ProfesorTitular("Edgar", 500);
        VoluntarioMiembro voluntarioMiembro = new VoluntarioMiembro("Jose", 80);


        personalAdmvo.calcularBono();
        profesorTitular.calcularBono();
        voluntarioMiembro.calcularBono();

        personalAdmvo.metodohijos();

    }
}