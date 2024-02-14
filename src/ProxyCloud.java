import java.util.ArrayList;

public class ProxyCloud implements ICloud{
    private ArrayList<Accesos> listaAccesos;
    private CloudService cloudService;

    public ProxyCloud() {
        this.listaAccesos = new ArrayList<>();
    }

    @Override
    public Documento acceso(String url, String email) {
        Accesos newAcceso = new Accesos(url, email);
        if(!listaAccesos.contains(newAcceso)){
            listaAccesos.add(newAcceso);
            System.out.println("Acceso catalogado");
            return this.cloudService.acceso(url, email);
        }else{
            return this.cloudService.acceso(url, email);
        }
    }
    public void setCloudService(CloudService cloudService) {
        this.cloudService = cloudService;
    }
    public ArrayList<Accesos> getListaAccesos() {
        return listaAccesos;
    }
}
