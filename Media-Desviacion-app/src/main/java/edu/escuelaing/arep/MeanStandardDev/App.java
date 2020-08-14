package edu.escuelaing.arep.MeanStandardDev;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class App 
{
    public static void main(String[] args) {
        Resolver(args);
    } 
    

    public void Resolver(String datos) throws IOException{
        try {
            System.out.println("entro");
            FileReader fr = new FileReader(datos);
            System.out.println("entro1");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("entro2");
            LinkedListArep Lista = new LinkedListArep();
            System.out.println("entro3");
            String linea = br.readLine();
            System.out.println("entro4");
            while (linea!=null) {
                Lista.add(Double.parseDouble(linea));
                linea = br.readLine();
            }
            System.out.println("entro5");
            br.close();
            System.out.println("Media : " + Lista.Mean());
            System.out.println("Desviación Estandar : " + Lista.StandardDev());

        } catch (final Exception e) {
            System.out.println("No fue posible resolver el archivo");
        }
    	
    }
}
