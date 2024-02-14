import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.print.Doc;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CloudServiceTest {
    @Test
    public void testCloudService(){
        ArrayList<String> listaAccesos = new ArrayList<String>();
        ArrayList<Documento> listaDocumentos = new ArrayList<Documento>();
        String acceso1 = "juan@gmail.com";
        String acceso2 = "jorge@jorge.com";
        listaAccesos.add(acceso1);
        listaAccesos.add(acceso2);
        Documento documentoTest = new Documento(1,"www.youtube.com","hola, soy el contenido", listaAccesos);
        listaDocumentos.add(documentoTest);
        CloudService cloudService = new CloudService();
        cloudService.setColeccionDocumentos(listaDocumentos);
        ProxyCloud proxyCloud = new ProxyCloud();
        proxyCloud.setCloudService(cloudService);

        Documento documentoEsperado = documentoTest;
        Documento realDocumento = proxyCloud.acceso("www.youtube.com", "juan@gmail.com");


        Assertions.assertTrue(documentoEsperado.getId().equals(realDocumento.getId()));
    }

}