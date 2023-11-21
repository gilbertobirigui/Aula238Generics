/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ilha Edição
 */
public class PrintService {
    
    
    private List<Integer> list = new ArrayList<>();  // ela tem internamente uma lista de numeros inteiros
    
    
    
    
    
    public void addValue(Integer value){   // operacao addValue recebe arg inteiro
        list.add(value);  // add na lista
        
    }
    
    public Integer first(){   // devolve primeiro elemento que esta armazenado no printservice
        if(list.isEmpty()){  // programacao defenciva - se a lista esta vazia
            throw new IllegalStateException("List is empty");  // se tiver vazia mostra mensagem 
        }
                
        return list.get(0);  // caso contrario retorna o primeiro elemento da lista
    }
    
    public void print(){    // imprimi na tela 
        System.out.print("[");
        if (!list.isEmpty()){  // se ela nao for vazia ja imprimo o primeiro valor 
            System.out.print(list.get(0));
        }
        // percorrer lista
        for (int i=0; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
    
    
}
