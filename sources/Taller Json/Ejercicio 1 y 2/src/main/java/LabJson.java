import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class LabJson {
    public static int PRETTY_PRINT_IDENT_FACTOR = 4;
    public static String XML_STRING =
        "<listacompras>\n" +
        "    <venta>\n" +
        "        <ventaacredito>\n" +
        "            <fechafinpago>22-10-2021</fechafinpago>\n" +
        "            <cantidad>21000</cantidad>\n" +
        "        </ventaacredito>\n" +
        "    </venta>\n" +
        "    <venta>\n" +
        "        <ventainmediata>\n" +
        "            <cantidad>1800</cantidad>\n" +
        "            <divisa>euros</divisa>\n" +
        "        </ventainmediata>\n" +
        "    </venta>\n" +
        "    <venta>\n" +
        "        <ventaacredito>\n" +
        "            <cantidad>21000</cantidad>\n" +
        "        </ventaacredito>\n" +
        "    </venta>\n" +
        "</listacompras>";

    public static void main(String[] args) {
        try{
            JSONObject jsonObject = XML.toJSONObject(XML_STRING);
            String jsonPretty = jsonObject.toString(PRETTY_PRINT_IDENT_FACTOR);
            System.out.println(jsonPretty);
        }catch (JSONException jex){
            System.out.println(jex.toString());
        }
    }
}

