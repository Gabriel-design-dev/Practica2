/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.util.Scanner;

public class Servlet4 {
    

public static void main(String[] args) { 
int dado1, dado2; 
int punto = 0; 
Scanner en = new Scanner (System.in); 
System.out.println("Digite LANZAR para tirar los dados"); 
en.next(); 
System.out.println("Lanzamiento de dados:"); 
dado1 = (int)(Math.random() * 6) + 1; 
dado2 = (int)(Math.random() * 6) + 1; 
System.out.println(dado1); 
System.out.println(dado2); 

int suma = dado1 + dado2; 

if (suma == 7 || suma == 11){ 
System.out.println("<h1>Felicidades has ganado</h1>"); 
} 
if (suma == 2 || suma == 3 || suma == 12){ 
System.out.println("Lo siento has perdido"); 
} 
if (suma !=7 && suma != 11 && suma != 2 && suma != 3 && suma != 12){ 
punto = suma; 
System.out.println("Su Punto es: "+punto); 
System.out.println("Digite LANZAR para tirar los dados otra vez"); 
en.next(); 
dado1 = (int)(Math.random() * 6) + 1; 
dado2 = (int)(Math.random() * 6) + 1; 
System.out.println(dado1); 
System.out.println(dado2); 
suma = dado1 + dado2; 
if (suma == punto){ 
System.out.println("Felicidades has ganado"); 
} 
if (suma == 7){ 
System.out.println("Lo siento has perdido"); 
} 
do { 

System.out.println("Su Punto es: "+punto); 
System.out.println("Digite LANZAR para tirar los dados otra vez"); 
en.next(); 
dado1 = (int)(Math.random() * 6) + 1; 
dado2 = (int)(Math.random() * 6) + 1; 
System.out.println(dado1); 
System.out.println(dado2); 
suma = dado1 = dado2; 
} while (suma != 7 || suma != punto); 
if (suma == 7){ 
System.out.println("Lo siento has perdido"); 
} 
if (suma == punto){ 
System.out.print("Felicidades has ganado"); 
} 

} 

} 

}

