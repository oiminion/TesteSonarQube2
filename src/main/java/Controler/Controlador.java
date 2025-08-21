/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Acao;
import Model.Mercado;

/**
 *
 * @author Arthur
 */
public class Controlador {
    private static Controlador instance;
    
    private Controlador(){};
    
    public static Controlador getInstance()
    {
        if(instance == null)
        {
            instance = new Controlador();
        }
        return instance;
    }
    
    public void atualizarAcoes(Mercado merc, String Nome, String Preco)
    {
        System.out.println("Atualizacao manual");
        Acao nova_acao = new Acao(Float.parseFloat(Preco),Nome);
        merc.SetStage(nova_acao);
    }
}
