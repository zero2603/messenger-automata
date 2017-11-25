/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger.automata;

/**
 *
 * @author Pham Anh Thu
 */
public class State4 implements State{
    @Override
    public int getNext(char c){
        switch(c){
            case ' ':
            case '\u0000': return 4;
            default: return 6;
        }       
    } 
    
    public void show() {
        System.out.println("Yes");
    }
}
