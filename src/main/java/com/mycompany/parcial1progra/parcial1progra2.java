package com.mycompany.parcial1progra;

import java.util.Scanner;

/**
 *
 * @author Lorent
 */

public class parcial1progra2 {

 static Scanner entrar =new Scanner(System.in);

public static void  main(String[]Args){
    int op;
do{ 
System.out.println("1. resultados");
          System.out.println("2. menor y mayor ");
          System.out.println("3. salir");
        System.out.println("Introcudir una opcion");
        op=entrar.nextInt();
    switch(op){
    
    
        case 1:
            CargarDatos ();
            operaciones ();
            totalcolumnas();
            decorado ();
            
         break;
         
          case 2:
            MenorComision();
           comisionmayor();
         break;
         
          case 3:
            
         break;
         
          default:System.out.println(" ERROR!! Introdusca una opcion valida");
    
    }
            
    
}while(op!=3);

}

private static String[][] comision1 = new String [2][11];    
private static String[][] NOMINA = new String [6][11]; 

private static final int NOMBRE=0;//instanciando las variables 
private static final int ENERO=1;
private static final int FEBRERO=2;
private static final int MARZO=3;
private static final int ABRIL=4;
private static final int TOVENTAS=5;
private static final int PO20=6;
private static final int PO35=7;
private static final int TOVECO=0;
private static final int ISR=9;
private static final int LIQUIDO=10;


private static void CargarDatos (){

NOMINA[0][NOMBRE]=("LILIAN");
NOMINA[1][NOMBRE]=("KEVIN");
NOMINA[2][NOMBRE]=("LUIS");
NOMINA[3][NOMBRE]=("DORIS");
NOMINA[4][NOMBRE]=("ERICK");
NOMINA[5][NOMBRE]=("TOTAL");

NOMINA[0][ENERO]=("200");
NOMINA[1][ENERO]=("100");
NOMINA[2][ENERO]=("800");
NOMINA[3][ENERO]=("500");
NOMINA[4][ENERO]=("500");

NOMINA[0][FEBRERO]=("100");
NOMINA[1][FEBRERO]=("2000");
NOMINA[2][FEBRERO]=("800");
NOMINA[3][FEBRERO]=("500");
NOMINA[4][FEBRERO]=("200");

NOMINA[0][MARZO]=("100");
NOMINA[1][MARZO]=("600");
NOMINA[2][MARZO]=("400");
NOMINA[3][MARZO]=("100");
NOMINA[4][MARZO]=("300");

NOMINA[0][ABRIL]=("800");
NOMINA[1][ABRIL]=("500");
NOMINA[2][ABRIL]=("900");
NOMINA[3][ABRIL]=("400");
NOMINA[4][ABRIL]=("200");



}//fin de cargar datos

private static void decorado (){

for (int x=0; x < NOMINA.length; x++) {
  System.out.print("|");
    for (int y=0; y < NOMINA[x].length; y++) {
      System.out.print (NOMINA[x][y]);
      if (y!=NOMINA[x].length-1) System.out.print("\t");
    }
  System.out.println("|");
}
}//fin de decorado

private static void operaciones (){
    
    int toven, tovenpo,comi1,comi2;


    for (int i=0;i<5;i++){
toven=0;
    toven=Integer.valueOf(NOMINA[i][1]);
    toven=toven+Integer.valueOf(NOMINA [i][2]);
    toven=toven+Integer.valueOf(NOMINA [i][3]);
    toven=toven+Integer.valueOf(NOMINA [i][4]);
    NOMINA[i][5]=toven+"";
    
if(toven<2000){
    tovenpo=toven*20/100;
    NOMINA[i][6]=tovenpo+"";
    
    
        
    }else{
NOMINA[i][6]="0";
    
    
    } 
    if(toven>=2001){
    tovenpo=toven*35/100;
    NOMINA[i][7]=tovenpo+"";
    
    
        
    }else{
NOMINA[i][7]="0";
    
    } 
    
comi1=Integer.valueOf(NOMINA[i][6]);
int comi3=Integer.valueOf(NOMINA[i][7]);
comi2=toven+comi1+comi3;
    NOMINA[i][8]=comi2+"";
    tovenpo=comi2*5/100;
    NOMINA[i][9]=tovenpo+"";
    NOMINA[i][10]=comi2-tovenpo+"";
    }//fin for


}//fin operaciones    
public static void totalcolumnas(){//suma de las columnas
      
   for(int i=1;i<11;i++){
int columna=0;
columna=Integer.valueOf(NOMINA[1][i]);
columna = columna+Integer.valueOf(NOMINA[1][i]);
columna = columna+Integer.valueOf(NOMINA[2][i]);
columna = columna+Integer.valueOf(NOMINA[3][i]);
columna = columna+Integer.valueOf(NOMINA[4][i]);
NOMINA[5][i]=columna+"";
}        
       
}//fin columnas
    public static void MenorComision(){
        CargarDatos ();
        operaciones ();
       double menor=1000, monto=100;
        String y="lilian";
        menor=Double.parseDouble(NOMINA[0][LIQUIDO]);
        for (int i = 0; i < 5; i++) {
            monto=Double.parseDouble(NOMINA[i][LIQUIDO]);

            if (monto<menor) {
                menor=monto;
                y=NOMINA[i][LIQUIDO+10];
            }
            else{
                monto=menor;
            }

        }

        System.out.println("vendedor que menos recibe: " + y);
    }//fin menor comision

  public static void comisionmayor(){
        double mayor=0, monto=0;
        String y ="";
        for (int i = 0; i < 5; i++) {
            monto=Double.parseDouble(NOMINA[i][LIQUIDO]);

            if (monto>mayor) {
                mayor=monto;
                y=NOMINA[i][LIQUIDO-10];
            }
            else{
                monto=monto;

            }
        }

        System.out.println("Vendedor que recibe mas: " + y);
    }
}//fin estructura