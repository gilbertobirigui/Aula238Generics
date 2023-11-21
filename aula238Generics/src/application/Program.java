/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.Scanner;
import service.PrintService;

/**
 *  fazer um programa que 
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N numeros inteiros
 * Ao final, imprima esse numeros de forma organizada conforme exemplo
 * Em seguida informar qual foi o primeiro valor informado
 * 
 * how many values: 3
 * 10
 * 8
 * 23
 * [10,8,23]
 * first:10
 * 
 */
public class Program {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();  // intanciar o printservice chamei ps
        
        System.out.println("How many Values: "); // quantos valores vc vai digitar
        int n = sc.nextInt();  // qtidade vai ser n 
        
        for (int i=0; i < n; i++){   // for para ler valores 
            int value = sc.nextInt();  // para cada valor vou ler
            ps.addValue(value);  // vou add esse valor no meu printservice que apelido ps usando operacao addValue
        }
        ps.print();  // chamo printservice a funcao print
        System.out.println("First: " + ps.first());  // aqui vai devolver o primeiro valor digitado 
        
        
        
        sc.close();
    }
    
    
}
