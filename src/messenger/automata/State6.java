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
public class State6 extends State4{
    @Override
    public int getNext(char c){
        return 6;
    }
    
    @Override
    public void show(){
        System.out.println("YES - STATE 6");
    }
}
