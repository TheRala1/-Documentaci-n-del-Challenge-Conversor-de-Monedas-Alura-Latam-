package org.example;


import com.google.gson.JsonObject;

import java.io.IOException;

//Clase para realizar las conversiones de monedas utilizando sus respectivos métodos.
public class Conversor {

    //Cada método realiza la conversión de una moneda a otra, asegurando la MONEDA BASE y la MONEDA DESTINO con la que se desea realizar la conversión.

    public static Double dolarAPesoArgentino(Double cantidad) throws IOException {
        //USD => ARS
        Double valor = 0.0;
        JsonObject obj = api.conectar("USD");
        JsonObject conversiones = obj.getAsJsonObject("conversion_rates");
        valor = cantidad * conversiones.get("ARS").getAsDouble();
        return valor;
    }

    public static Double pesoArgentinoADolar(Double cantidad) throws IOException {
        //ARS => USD
        Double valor = 0.0;
        JsonObject obj = api.conectar("ARS");
        JsonObject conversiones = obj.getAsJsonObject("conversion_rates");
        valor = cantidad * conversiones.get("USD").getAsDouble();
        return valor;
    }

    public static Double dolarARealBrasileño(Double cantidad) throws IOException {
        //USD => BRL
        Double valor = 0.0;
        JsonObject obj = api.conectar("USD");
        JsonObject conversiones = obj.getAsJsonObject("conversion_rates");
        valor = cantidad * conversiones.get("BRL").getAsDouble();
        return valor;
    }

    public static Double realBrasileñoADolar(Double cantidad) throws IOException {
        //BRL => USD
        Double valor = 0.0;
        JsonObject obj = api.conectar("BRL");
        JsonObject conversiones = obj.getAsJsonObject("conversion_rates");
        valor = cantidad * conversiones.get("USD").getAsDouble();
        return valor;
    }

    public static Double dolarAPesoColombiano(Double cantidad) throws IOException {
        //USD => COP
        Double valor = 0.0;
        JsonObject obj = api.conectar("USD");
        JsonObject conversiones = obj.getAsJsonObject("conversion_rates");
        valor = cantidad * conversiones.get("COP").getAsDouble();
        return valor;
    }

    public static Double pesoColombianoADolar(Double cantidad) throws IOException {
        //COP => USD
        Double valor = 0.0;
        JsonObject obj = api.conectar("COP");
        JsonObject conversiones = obj.getAsJsonObject("conversion_rates");
        valor = cantidad * conversiones.get("USD").getAsDouble();
        return valor;
    }
}