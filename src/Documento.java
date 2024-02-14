import java.util.ArrayList;

public class Documento {
    private Integer id;
    private String url;
    private String contenido;
    private ArrayList<String> usuarios;

    public Documento(Integer id, String url, String contenido, ArrayList<String> usuarios) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.usuarios = usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
    }
}
