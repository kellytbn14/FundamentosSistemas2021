import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {

    private static final Gson gson = new Gson();
    private static File fileUser;
    private static final String jsonFilePath = "src/main/resources/User.json";

    public static void main(String[] args) {
        User user = jsonToUser();
        System.out.println(user.toString());
    }

    static User jsonToUser(){
        User user = new User();
        try{
            fileUser = new File(jsonFilePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileUser));
            String line = "";
            String json = "";
            while ((line = bufferedReader.readLine())!=null){
                json = json + line;
            }
            bufferedReader.close();

            user = gson.fromJson(json, User.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
