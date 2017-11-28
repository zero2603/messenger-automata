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
public class State5 extends  State3{
    @Override
    public int getNext(char c){
        if(c=='\u0000') return 5;
        else if((c>='A' && c<='Z') || (c>='a' && c<='z')) return 8;
        else return 6;
    }
    
    @Override
    public void show(){
        System.out.println("Yes - STATE5");
    }
}
