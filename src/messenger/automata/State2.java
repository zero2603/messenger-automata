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
public class State2 extends State1{

    @Override
    public int getNext(char c) {
        switch(c){
            case ' ': return 3;
            default: return 8;
        }
    }
}
