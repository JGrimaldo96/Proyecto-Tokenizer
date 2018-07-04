package estDatosRep;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Lista implements ListaIF
     { Nodo encabezado;
    
       public Lista()
            { this.encabezado= null; }

       
       public void agregar(Object dato) 
            { this.encabezado = new Nodo(dato, this.encabezado); }

       
       public void muestraLista() 
            { Nodo inicia = this.encabezado;
              while(inicia != null)
                  { System.out.println(inicia.valor);
                    inicia = inicia.apuntador; 
                  }
            }
       public boolean buscar(Object dato)
       {
           return(contiene(dato) != null);
       }
       public Nodo contiene(Object dato)
       {
           Nodo paso = encabezado;
           while(paso != null && !paso.valor.equals(dato))
           {
               paso = paso.apuntador;
           }
           return paso;
       }
       
      public Nodo eliminar(Object dato ){
      Nodo paso=encabezado;
      Nodo anterior=null;
      while(paso!=null&&!paso.valor.equals(dato))
      {
          anterior=paso;
          paso=paso.apuntador;
      }
      if(paso!=null)
      {
          if (paso==encabezado)
          {
             encabezado=encabezado.apuntador; 
          }
          else 
          {
              anterior.apuntador=paso.apuntador;
          }
      }return paso;
      }
      
      public void sustituir(Object original, Object y){
          Nodo c=contiene(original);
          if(c!=null)
              c.valor=y;
      }
      
      public void guardar(String nombre){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        Nodo inicio = encabezado;
        
        try{
            f=new File(nombre);
            w=new FileWriter(f);
            bw=new BufferedWriter(w);
            wr=new PrintWriter(bw);
            
            while(inicio!=null){
            wr.write(inicio.valor.toString()+", ");
            inicio = inicio.apuntador; 
            }
            
            wr.close();
            bw.close();
            
        }
        catch (Exception e){
            System.out.println("Ha ocurrido un error");
        }
        
    }
     }
