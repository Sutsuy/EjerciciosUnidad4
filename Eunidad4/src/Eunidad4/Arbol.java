package Eunidad4;

public class Arbol {
	
	
    Nodo nodoPadre=null;
    Nodo nodoRaiz=null;
    int altura;
    int total=0;
    public boolean arbolVacio()
    {
    return nodoRaiz == null;
   
    }
    
    
    
 public void insertar(Nodo nodoActual){
    nodoActual.edad=2020-nodoActual.año;
     if(nodoPadre==null)
     {
     nodoPadre=nodoActual;
     nodoRaiz=nodoActual;
     
     total++;  
    }
     
     else
    {
      if(nodoActual.año<nodoPadre.año)
      {
      if(nodoPadre.izquierdo==null)
      {
        nodoPadre.izquierdo=nodoActual;
        nodoPadre=nodoRaiz;
         total++;  
         }
         else
             {
                 nodoPadre=nodoPadre.izquierdo;
                 insertar(nodoActual);
             }
         }
        else{
             
      if(nodoPadre.derecho==null)
      {
              nodoPadre.derecho=nodoActual;
              nodoPadre=nodoRaiz;
              total++;  
      }
             else{
              nodoPadre=nodoPadre.derecho;
              insertar(nodoActual);
             }     
        }    
     }
    }
 
    

public void Preorden(Nodo nodoRaiz2){
    if(arbolVacio()){
        System.out.println("El arbol esta vacio");
    }
    else{
    if(nodoRaiz2==null){
     }
  else{
    System.out.print(nodoRaiz2.nombre + "|");
    Preorden(nodoRaiz2.izquierdo);
    Preorden(nodoRaiz2.derecho);
}
}
}

 
public void inOrden(Nodo nodoRaiz2){
if(nodoRaiz2==null){
}
else{
    inOrden(nodoRaiz2.izquierdo);
    System.out.print(nodoRaiz2.nombre+"| ");
    inOrden(nodoRaiz2.derecho);
}
}


public void PosOrden(Nodo nodoRaiz2){
if(nodoRaiz2==null){
}
else{
    PosOrden(nodoRaiz2.izquierdo);
    PosOrden(nodoRaiz2.derecho);
    System.out.print(nodoRaiz2.nombre+"| ");
}
}

 
   public int altura(Nodo reco, int nivel){
       if(reco!=null){
           altura(reco.izquierdo,nivel++);
           if(nivel>altura)
           altura=nivel;
           altura(reco.derecho,nivel++);
       }
   return altura;
   }

   
   
   Nodo menor=null;
    public  int menor(Nodo raiz) {
      Nodo aux=raiz;
        if (menor==null){
            menor=raiz;
        }
        if(aux!=null){
            if(aux.edad<menor.edad){
                menor=aux;
            }
           menor(aux.izquierdo);
            menor(aux.derecho);
        }
        
   return menor.edad;
        }
    
  Nodo mayor=null;
    public  int mayor(Nodo raiz) {
      Nodo aux=raiz;
        if (mayor==null){
            mayor=raiz;
        }
        if(aux!=null){
            if(aux.edad>mayor.edad){
                mayor=aux;
            }
            mayor(aux.izquierdo);
            mayor(aux.derecho);
        }
   return mayor.edad;
        }
       
   public int diferencia(int mayor, int menor){
       int res;
       res=mayor-menor;
       return res;
       
   }
  int suma;
   public  int suma(Nodo raiz) { 
       suma=suma+raiz.edad;
       if(raiz.izquierdo!=null){
            suma(raiz.izquierdo);
        }
        if(raiz.derecho!=null)
        {
            suma(raiz.derecho);
        }        
   return suma;
   }

   
 int totalpromedio=0;

 
  public int  promedio(int prom)
  {
   totalpromedio =suma;	  
   totalpromedio=prom/12;  
  
   return totalpromedio;
  
  }
	
	

}
