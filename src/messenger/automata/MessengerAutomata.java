/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger.automata;

import java.util.Scanner;

/**
 *
 * @author Pham Anh Thu
 */
public class MessengerAutomata {
    public static State0[] arrayState = {new State0(), new State1(), new State2(),
                                new State3(), new State4(), new State5(),
                                new State6(), new State7(), new State8()};
    
    public static State0 getState(int index){
        return arrayState[index];
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        State0 s = arrayState[0];
        int nextState;
        String input;
        
        System.out.println("Enter the message: ");
        Scanner scanIn = new Scanner(System.in);
        input = scanIn.nextLine();
        
        for(int i=0; i<input.length(); i++) {
            nextState = s.getNext(input.charAt(i));
            s = MessengerAutomata.getState(nextState);
        }
        nextState = s.getNext('\u0000');
        s = MessengerAutomata.getState(nextState);
        s.show();
        
    }
    
}
