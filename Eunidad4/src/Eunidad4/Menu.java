package Eunidad4;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer= new Scanner(System.in);
	
Arbol obj =new Arbol();
	  int año,elemento;
	 
	     
	     
    Nodo n1=new Nodo("Ana", 1997);
	Nodo n2=new Nodo("Joseline",2003);
	Nodo n3=new Nodo("Ramiro",2001);            
	Nodo n4=new Nodo("Lalo",2002);
	Nodo n5=new Nodo("Alicia",2009);
    Nodo n6=new Nodo("Cesar",2005);
	Nodo n7=new Nodo("Roberto",1982);
	Nodo n8=new Nodo("Fernando",1981);
    Nodo n9=new Nodo("Carmen",1970);
    Nodo n10=new Nodo("Cristal",1993);
	Nodo n11=new Nodo("Gustavo",1986);
	Nodo n12=new Nodo("Martha",1990);

	obj.insertar(n1);
    obj.insertar(n2);
	obj.insertar(n3);
	obj.insertar(n4);
	obj.insertar(n5);
	obj.insertar(n6);
	obj.insertar(n7);
	obj.insertar(n8);
	obj.insertar(n9);
	obj.insertar(n10);
	obj.insertar(n11);
	obj.insertar(n12); 
	
	            
	int opc,opcion;
	     	   
	 
	    	   
do{
	System.out.println("***Operaciones con arbol binario***");
  System.out.println("****************MENU**********************");
  System.out.println("1.-Quien es la persona mas pequeña y que edad tiene");
  System.out.println("2.- Quien es la persona mas grande y que edad tiene");
  System.out.println("3.-Cuantos años de diferencia tiene la persona mas grande y la persona mas chica");
  System.out.println("4.-Cuantos participantes hay");
  System.out.println("5.-Cuanto es la suma de las edades de los participantes");
  System.out.println("6.-Cual es el promedio de edad de los participantes");
  System.out.println("7.-Altura");
  System.out.println("8.-Recorido pre-orden");
  System.out.println("9.-Recorido in-Orden");
  System.out.println("10.-Recorido pos-orden");
  System.out.println("11.-Salir :c ");
  System.out.println("elige una opcion---> ");
  opc=leer.nextInt();
	        
  
  switch(opc){  
	        
	   case 1:  
		   System.out.println("**************************************");
		   System.out.println("Persona pequrña");
		   System.out.println("");
	            System.out.println(obj.menor(obj.nodoRaiz));
	            System.out.println("");
	            System.out.println(obj.menor.nombre);
	            System.out.println("");
	            System.out.println("");
	            System.out.println("");
	       System.out.println("\n**************************************");
	    break;
	    
	            
	   case 2:
		  System.out.println("*****************************************");
		   System.out.println("Persona grande ");
		   System.out.println(obj.mayor.nombre);
	       System.out.println(obj.mayor(obj.nodoRaiz));
	    System.out.println("\n**************************************");  
	         
	         break;
	            
	    case 3:
	    	
	    	System.out.println("**************************************");  
	         
	      int mayor=obj.mayor(obj.nodoRaiz);
	      int menor=obj.menor(obj.nodoRaiz);
	      System.out.print(obj.diferencia(mayor,menor));
	      System.out.println("\n**************************************");  
	                
	            
	        break;
	            
	      case 4:
	    	  System.out.println("**************************************");  
		      System.out.println("***+Total participantes+****");  
		      System.out.println("");    
	         System.out.println(obj.total);
	         System.out.println("");
	         System.out.println("\n**************************************");  
	              
	            break;
	            
	      case 5:
	    	  System.out.println("**************************************");  
	    	    System.out.println("");
	    	    System.out.println("La suma es ");
	        System.out.println(obj.suma(obj.nodoRaiz));
	          obj.suma=0;
	        System.out.println("\n**************************************");  
		           
	         
	         break;
	  
	      case 6:
	    	  
	           int suma=obj.suma(obj.nodoRaiz);
	         System.out.println("**************************************");  
		         
	         System.out.println("Promedio");   
	         System.out.println(obj.promedio(suma));
	         obj.suma=0;
	         System.out.println("\n**************************************");  
	         
	         break;
	            
	         case 7:
	        	 System.out.println("");
	        	 System.out.println("**************************************");  
		         
	        	System.out.println("Altura del arbol");
	            System.out.println( obj.altura(obj.nodoRaiz,1));
	            System.out.println("\n**************************************");  
		           
	            break;
	            
	        case 8:
	        	System.out.println("**************************************");  
		           
	        	obj.Preorden(obj.nodoRaiz);
	        	System.out.println("\n**************************************");  
		         
	        	break;
	        case 9:
	        	System.out.println("\n**************************************");  
		         
	         
	        	obj.inOrden(obj.nodoRaiz);
	        	System.out.println("\n**************************************");  
		         
	          break;
	            
	        
	       case 10:
	    System.out.println("**************************************");  
	    	obj.PosOrden(obj.nodoRaiz);
	    	   System.out.println("\n**************************************");  
		         
	    	   
	    	 break;
	            
	       default:
	            {
	            	System.out.println("Corazon la opcion que ingresaste es incorresta :c");
	            }
	        
	        }
	        
	    System.out.println("Quieres seguir en el menu 1) si  2) no ");
	     opcion=leer.nextInt();
	     
	    }
	       while(opcion==1);
	        
	        if(opcion==2){
	            System.out.println("Gracias por estar aqui, bay");
	
	                 }
	
	}
	}

