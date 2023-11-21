/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics permitem que classes, interfaces e metodos possam ser parametrizados por tipo
 * seus benenficios sao
 * Reuso
 * Type safety
 * Performance
 * 
 */

public class exemploGenerics {

    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();
        list.add("Maria");
        String name = list.get(0);  // recupera o elemento 0
        
        System.out.println("Valor retornado e: " + name);
        
    }
    

    
}
