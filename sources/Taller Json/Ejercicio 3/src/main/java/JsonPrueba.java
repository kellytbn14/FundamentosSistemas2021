import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonPrueba {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor(26, "Kelly", "Tobón");
        Vendedor vendedor2 = new Vendedor(25, "Stefania", "Montoya");
        Vendedor vendedor3 = new Vendedor(21, "Alan", "Perez");

        Cliente cliente1 = new Cliente("Sergio Tobón", "Calle 13", "3128501902");
        Cliente cliente2 = new Cliente("Monica Montoya", "Carrera 15", "3108319987");
        Cliente cliente3 = new Cliente("William Tobón", "Calle 48", "3207742404");

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        JSONObject jsonVendedor1 = new JSONObject(vendedor1);
        JSONArray jsonClientes = new JSONArray();

        try{
            for (Cliente cliente : clientes){
                JSONObject jsonCliente = new JSONObject();
                jsonCliente.put("nombre", cliente.getNombre());
                jsonCliente.put("direccion", cliente.getDireccion());
                jsonCliente.put("telefono", cliente.getTelefono());
                jsonClientes.put(jsonCliente);
            }
            JSONObject jsonVendedorClientes = new JSONObject();
            jsonVendedorClientes.put("vendedor", jsonVendedor1);
            jsonVendedorClientes.put("clientes", jsonClientes);

            System.out.println(jsonVendedorClientes);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
