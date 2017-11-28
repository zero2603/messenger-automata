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
public class State8 extends State3{
    @Override
    public int getNext(char c){
        return 8;
    }
    
    @Override
    public void show(){
        System.out.println("Lack of Gender!");
    }
}
