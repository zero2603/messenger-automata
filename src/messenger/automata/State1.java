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
public class State1 extends State0{
    @Override
    public int getNext(char c){
        switch(c){
            case 'Q': return 2;
            default: return 7;
        }
    }
    
    @Override
    public void show(){
        System.out.println("Processing");
    }
}
