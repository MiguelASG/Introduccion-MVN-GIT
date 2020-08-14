package edu.escuelaing.arep.MeanStandardDev;
import java.io.*;




public class App 
{
    //Se crea un constructor para hacer una instancia que pueda ejecutarse
    public App(){

    }


    public static void main(String[] args) throws IOException{
        try{
            App a = new App();
        a.Resolver();
        }catch(Exception e){
            System.out.println("No fue posible leer el archivo");
        }     
    } 
    
    //Función donde se hace controla la lectura y captura los resultados
    public void Resolver() throws IOException{
        try {
            //Se lee el archivo en la carpeta origen
            File file = new File("input.in");
            //Se instancia el lector, que ayudara a controlar el archivo
            BufferedReader br = new BufferedReader(new FileReader(file));
            //Se crea la linked list
            LinkedListArep Lista = new LinkedListArep();
            //Se controlan los datos que entraran a la linked list
            String linea = br.readLine();
            while (linea!=null) {
                Lista.add(Double.parseDouble(linea));
                linea = br.readLine();
            }
            br.close();
            //Se piden los resultados con las funciones que posee la clase de linked list
            System.out.println("Media : " + Lista.Mean());
            System.out.println("Desviacion Estandar : " + Lista.StandardDev());

        } catch (final Exception e) {
            throw new IOException("No fue posible resolver el archivo",e);
        }
    	
    }
}
