public class Termino {

private int idTermino;

private String palabra;

private int frecuencia;

private Documento documento;

    public Termino(int idTermino, String palabra, int frecuencia, Documento documento) {
        this.idTermino = idTermino;
        this.palabra = palabra;
        this.frecuencia = frecuencia;
        this.documento = documento;
    }

    public int getIdTermino() {
        return idTermino;
    }

    public void setIdTermino(int idTermino) {
        this.idTermino = idTermino;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
