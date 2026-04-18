package com.bootcamp.lab3.lab33;

public interface IPlayable {
    void play();

    default void stop(){
        System.out.println("Da dung!");
    }
}
