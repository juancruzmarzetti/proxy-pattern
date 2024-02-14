import java.util.ArrayList;

public class CloudService implements ICloud{
    private ArrayList<Documento> coleccionDocumentos;

    public CloudService() {
        this.coleccionDocumentos = new ArrayList<>();
    }

    public void setColeccionDocumentos(ArrayList<Documento> coleccionDocumentos) {
        this.coleccionDocumentos = coleccionDocumentos;
    }

    @Override
    public Documento acceso(String url, String email) {
        for(int i=0; i<coleccionDocumentos.size(); i++){
            if (coleccionDocumentos.get(i).getUrl().equals(url)
                    && coleccionDocumentos.get(i).getUsuarios().contains(email)){
                System.out.println(coleccionDocumentos);
                return coleccionDocumentos.get(i);
            }
        }
        System.out.println(coleccionDocumentos);
        System.out.println("El documento no ha sido encontrado");
        return null;
    }
}
