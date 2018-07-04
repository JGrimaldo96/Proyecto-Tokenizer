package estDatosRep;

public class Nodo 
     { 
        Object valor;
        Nodo apuntador; 
    
       public Nodo(Object dato,Nodo N)
            { 
                this.valor = dato;
                this.apuntador = N;
            }
     }
