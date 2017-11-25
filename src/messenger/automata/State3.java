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
public class State3 implements State{
    @Override
    public int getNext(char c){
        switch(c){
            case ' ': return 3;
            case 'G': return 4;
            case 'B': return 5;
            default: return 8;
        }
    }
    
    public void show(){
        System.out.println("Processing");
    }
}
