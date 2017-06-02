import java.util.*;

public class ArrayListador  {
//hola que
	public static void main(String[] args) {
	  int n;
	  Scanner teclado=new Scanner(System.in);
      System.out.println("Ingrese valor entero");
      	n=teclado.nextInt();
      	int m;
      	ArrayList <Integer> array = new ArrayList <Integer> ();
        String resp="";
      	do{
      		System.out.println("Ingrese valor/es");
          	m=teclado.nextInt();
	          	if(m>n){
	          		array.add(m);}
      		do{
      			System.out.println("¿Desea seguir? si/no");
      			resp=teclado.next();
      		}while(!resp.equals("si") && !resp.equals("no"));
      	}while(resp.equals("si"));
      	
      	System.out.println("--------------------------/n");
      	System.out.println("Valores mayores a "+n);
      	
		if(array.isEmpty()){
      	System.out.println("No los hay");}
      	for(int r:array)
      	{ 
      		System.out.println(r);
      	}
      	
      	teclado.close();
	}

}
