package org.example;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//Clase para realizar la conexión a la API de conversión de monedas.
public class api {
    public static final String API_KEY = "33c987499314fe8b85dedca7";

    public static final String URL_STR = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static JsonObject conectar(String moneda) throws IOException {
        System.out.println("Conectando a la API de conversión de monedas...");

        //Objeto JSON a retornar.
        JsonObject obj = null;

        try{

            //Hacemos la peticion
            URL url = new URL(URL_STR + moneda);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            //Convertimos a JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            //Hacemos copia del objeto y lo retornamos.
            obj = jsonobj;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
