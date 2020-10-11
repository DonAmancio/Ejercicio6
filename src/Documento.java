import java.util.Date;

public class Documento {

private int idDocumento;

private int numRegistro;

private String titulo;

private String url;

private long tamaño;

private Date fechaActualizacion;

private String checksum;

    public Documento(int idDocumento, int numRegistro, String titulo, String url, long tamaño, Date fechaActualizacion, String checksum) {
        this.idDocumento = idDocumento;
        this.numRegistro = numRegistro;
        this.titulo = titulo;
        this.url = url;
        this.tamaño = tamaño;
        this.fechaActualizacion = fechaActualizacion;
        this.checksum = checksum;
    }

    public Documento() {





    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }
}
