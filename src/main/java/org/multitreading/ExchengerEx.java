package org.multitreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchengerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.SIZORS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SIZORS);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.ROCK);
        friend2Action.add(Action.ROCK);
        new BestFriend("Vanya", friend1Action, exchanger);
        new BestFriend("Oleg", friend2Action, exchanger);


    }
}

enum Action{
    ROCK, PAPER, SIZORS
}

class BestFriend extends Thread{
    String name;
    private List<Action> myActions;
    Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }
    private void whoWins(Action myAction, Action friendAction){
        if (myAction == Action.ROCK && friendAction == Action.SIZORS
                || myAction == Action.SIZORS && friendAction == Action.PAPER
                || myAction == Action.PAPER && friendAction == Action.ROCK){
            System.out.println(name + " wins");
        }
    }
    @Override
    public void run(){
        Action reply;
        for (Action ac: myActions
             ) {
            try {
                reply = exchanger.exchange(ac);
                whoWins(ac, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}