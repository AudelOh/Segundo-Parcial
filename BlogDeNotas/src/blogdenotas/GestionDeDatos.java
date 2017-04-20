package blogdenotas;
//@autor Audel Oh

import java.io.*;

public class GestionDeDatos {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public GestionDeDatos(){
    }
    
    public String AbrirArchivo(File archivo){
        String contenido="";
        try{
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!=-1){
                char caracter = (char)ascci;
                contenido += caracter;
            }
        }catch(Exception e){
        }
        return contenido;
    }
    
    public String GuardarArchivo(File archivo, String contenido){
        String respuesta=null;
        try{
            salida=new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta="El archivo se guardo exitosamente";
        }catch(Exception e){
        }
        return respuesta;
    }
}
