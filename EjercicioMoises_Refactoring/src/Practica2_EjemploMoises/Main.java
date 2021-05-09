package Practica2_EjemploMoises;

//Axel Sendros Cuenca

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
        public static void main(String[] args) throws ParseException {
    
            SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
    
            Vehicle vehicle1 = new Vehicle ("Tata", "Vista", Vehicle.BASIC);
            Date date = dateFormat.parse("2/8/2013");
            Lloguer lloguer1 = new Lloguer(date, 2, vehicle1);
    
            Vehicle vehicle2 = new Vehicle ("Audi", "RS5", Vehicle.LUXE);
            date = dateFormat.parse("10/10/2017");
            Lloguer lloguer2 = new Lloguer(date, 5, vehicle2);
    
            Vehicle vehicle3 = new Vehicle ("Fiat", "Multipla", Vehicle.GENERAL);
            date = dateFormat.parse("2/8/2019");
            Lloguer lloguer3 = new Lloguer(date, 7, vehicle3);
    
    
            Client cliente1 = new Client ("31221321312", "cliente 1", "66666666");
            cliente1.afegeix(lloguer1);
            cliente1.afegeix(lloguer2);
            cliente1.afegeix(lloguer3);
    
            System.out.println(GestorLloguerLite(cliente1));
    
        }
    
    public static String GestorLloguerLite(Client c) {
        return c.informe();
    }
}
