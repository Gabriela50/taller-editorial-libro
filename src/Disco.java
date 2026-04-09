public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco() {
    }

    public Disco(float duracionMinutos, String titulo, double precio) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "DISCO\n" +
                super.toString() +
                "\nDuracion en minutos: " + duracionMinutos;
    }
}