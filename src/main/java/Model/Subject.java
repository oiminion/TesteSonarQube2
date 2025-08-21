/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import View.Observer;

/**
 *
 * @author Arthur
 */
public interface Subject {
    void Subscribe(Observer observer);
    void Unsubscribe(Observer observer);
    void Notify(Acao Acoes);
}
