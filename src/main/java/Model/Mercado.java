/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.Observer;
import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Mercado implements Subject{
    private ArrayList<Acao> stage;
    private ArrayList<Observer> Observers;
    
    public Mercado()
    {
        this.stage = new ArrayList<>();
        this.Observers = new ArrayList<>();
    }
    
    @Override
    public void Subscribe(Observer observer)
    {
        Observers.add(observer);
    }
    
    @Override
    public void Unsubscribe(Observer observer)
    {
        for(int i = 0; i < Observers.size(); i++)
        {
            if(Observers.get(i).equals(observer))
            {
                Observers.remove(i);
                break;
            }
        }
    }
    
    @Override
    public void Notify(Acao nova_acao)
    {
        for(Observer O : Observers)
        {
            O.Update(nova_acao);
        }
    }
    
    public void Changed(Acao nova_acao)
    {
        Notify(nova_acao);
    }
    
    public void SetStage(Acao nova_acao)
    {
        boolean flag = false;
        boolean flag2 = false;
        for(Acao acao: stage)
        {
            if(acao.CompareNome(nova_acao))
            {
                flag2 = true;
                if(acao.ComparePreco(nova_acao))
                {
                    acao.setPreco(nova_acao.getPreco());
                    flag = true;
                }
            }
        }
        if(!flag && !flag2)
        {
            stage.add(nova_acao);
            flag = true;
        }
        if(flag)
        {
            Changed(nova_acao);
        }
    }
    public ArrayList<Acao> GetStage()
    {
        return stage;
    }
}
