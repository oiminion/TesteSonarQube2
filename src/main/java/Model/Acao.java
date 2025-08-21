/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Arthur
 */
public class Acao {
    private float preco;
    private float preco_old;
    private String nome;
    public Acao(float preco, String nome)
    {
        this.preco_old = preco;
        this.preco = preco;
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public float getPreco()
    {
        return this.preco;
    }
    
    public float getStatus()
    {
        return preco - preco_old;
    }
    
    public void setPreco(float novo_preco)
    {
        this.preco_old = this.preco;
        this.preco = novo_preco;
    }
    
    public boolean CompareNome(Acao nova_acao)
    {
        return this.nome.equals(nova_acao.getNome());
    }
    
    public boolean ComparePreco(Acao nova_acao)
    {
        return this.preco != nova_acao.getPreco();
    }
}
