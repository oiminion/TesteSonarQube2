/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;
import Model.Acao;
import Model.Subject;

/**
 *
 * @author Arthur
 */
public class ConcreteObserver implements Observer{
    private Acao stage;
    private UI screen;
    public ConcreteObserver(Subject subject, float preco, String nome)
    {
        stage = new Acao(preco, nome);
        screen = UI.getInstance();
        subject.Subscribe(this);
    }
    
    public void Display()
    {
        screen.updateList();
    }
    
    @Override
    public void Update(Acao nova_acao)
    {
        if(stage.CompareNome(nova_acao))
        {
            stage.setPreco(nova_acao.getPreco());
            Display();
        }
    }
}
