public class Temas {

    private int idTemas ;

    private String nombre;

    private Categoria mainteme;

    public Temas(int idTemas, String nombre, Categoria mainteme) {
        this.idTemas = idTemas;
        this.nombre = nombre;
        this.mainteme = mainteme;
    }

    public int getIdTemas() {
        return idTemas;
    }

    public void setIdTemas(int idTemas) {
        this.idTemas = idTemas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getMainteme() {
        return mainteme;
    }

    public void setMainteme(Categoria mainteme) {
        this.mainteme = mainteme;
    }
}



