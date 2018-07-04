package estDatosRep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class ListaToken  {
    Lista Lista01=new Lista();
    Lista Lista02=new Lista();
    Lista Lista03=new Lista();
    
    public void lectura (String archivo1) throws FileNotFoundException,IOException{
        File archivo=new File(archivo1);
        StreamTokenizer tokenizer=new StreamTokenizer(new FileReader(archivo));
        tokenizer.ordinaryChar('"');
        tokenizer.ordinaryChar('\'');
        for (int lexema=tokenizer.nextToken();lexema!=StreamTokenizer.TT_EOF;lexema=tokenizer.nextToken()){
            switch (lexema){
                case StreamTokenizer.TT_WORD:
                    if(Lista01.buscar(tokenizer.sval)==false)
                        Lista01.agregar(tokenizer.sval);
                        
                    break;
                    
                case StreamTokenizer.TT_NUMBER:
                    if(Lista02.buscar(tokenizer.nval)==false)
                    Lista02.agregar(tokenizer.nval);
                    break;
                    
                default:
                    break;
            }                   
        }
        Lista01.guardar("EDLista01.txt");
        Lista02.guardar("EDLista02.txt");
    }
    
     public void lectura2 (String archivo2) throws FileNotFoundException,IOException{
        File archivo=new File(archivo2);
        StreamTokenizer tokenizer=new StreamTokenizer(new FileReader(archivo));
        tokenizer.ordinaryChar('"');
        tokenizer.ordinaryChar('\'');
        for (int lexema=tokenizer.nextToken();lexema!=StreamTokenizer.TT_EOF;lexema=tokenizer.nextToken()){
            switch (lexema){
                case StreamTokenizer.TT_WORD:
                    if(Lista01.buscar(tokenizer.sval)==true)
                        if(Lista03.buscar(tokenizer.sval)==false)
                            Lista03.agregar(tokenizer.sval);
                    break;
                    
                case StreamTokenizer.TT_NUMBER:
                    if (Lista02.buscar(tokenizer.nval)==true)
                        if(Lista03.buscar(tokenizer.nval)==false)
                            Lista03.agregar(tokenizer.nval);
                    break;
                default:
                    break;
            }                   
        }
        Lista03.guardar("EDLista03.txt");
    }
     
     public void lectura3 (String archivo3) throws FileNotFoundException,IOException{
        File archivo=new File(archivo3);
        StreamTokenizer tokenizer=new StreamTokenizer(new FileReader(archivo));
        tokenizer.ordinaryChar('"');
        tokenizer.ordinaryChar('\'');
        for (int lexema=tokenizer.nextToken();lexema!=StreamTokenizer.TT_EOF;lexema=tokenizer.nextToken()){
            switch (lexema){
                case StreamTokenizer.TT_WORD:
                    if(Lista01.buscar(tokenizer.sval)==true)
                        Lista01.eliminar(tokenizer.sval);
                    break;
                    
                case StreamTokenizer.TT_NUMBER:
                    if (Lista02.buscar(tokenizer.nval)==true)
                        Lista02.eliminar(tokenizer.nval);
                    break;
                default:
                    break;
            }                   
        }
        Lista01.guardar("EDLista01.txt");
        Lista02.guardar("EDLista02.txt");
    }
}
