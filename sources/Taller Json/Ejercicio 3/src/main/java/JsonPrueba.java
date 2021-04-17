import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonPrueba {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(26, "Kelly", "Tobón");
        Cliente cliente1 = new Cliente("Sergio Tobón", "Calle 13", "3128501902");
        Cliente cliente2 = new Cliente("Monica Montoya", "Carrera 15", "3108319987");
        Cliente cliente3 = new Cliente("William Tobón", "Calle 48", "3207742404");

        List<Cliente> clientesV1 = new ArrayList<Cliente>();
        clientesV1.add(cliente1);
        clientesV1.add(cliente2);
        clientesV1.add(cliente3);
        vendedor1.setClientes(clientesV1);

        Vendedor vendedor2 = new Vendedor(25, "Stefania", "Montoya");
        Cliente cliente4 = new Cliente("Luisa Cardona", "Calle 32", "333555666");
        Cliente cliente5 = new Cliente("Carlos Lopez", "Carrera 232", "447778888");
        Cliente cliente6 = new Cliente("Luis Gomez", "Calle 2323", "778889999");

        List<Cliente> clientesV2 = new ArrayList<Cliente>();
        clientesV2.add(cliente4);
        clientesV2.add(cliente5);
        clientesV2.add(cliente6);
        vendedor2.setClientes(clientesV2);

        Vendedor vendedor3 = new Vendedor(21, "Alan", "Perez");
        Cliente cliente7 = new Cliente("Mercela Montoya", "Calle 2323", "745745545");
        Cliente cliente8 = new Cliente("Esteban Montoya", "Carrera e23", "785785785");

        List<Cliente> clientesV3 = new ArrayList<Cliente>();
        clientesV3.add(cliente7);
        clientesV3.add(cliente8);
        vendedor3.setClientes(clientesV3);

        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);

        parseToJson(vendedores);

    }

    public static void parseToJson(List<Vendedor> vendedores) {
        try {
            JSONArray jsonVendedorClientes = new JSONArray(vendedores);

            System.out.println(jsonVendedorClientes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
