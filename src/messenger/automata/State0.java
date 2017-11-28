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
public class State0{
    public int getNext(char c) {
        switch(c){
            case ' ': return 0;
            case 'L': return 1;
            default: return 7;
        }
    }

    public void show(){
        System.out.println("Initialize");
    }
}
