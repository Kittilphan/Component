/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package score;

/**
 *
 * @author USER
 */
public interface Source {
    public void notifyObservers();
    public void register(MyObserver observer);
}
