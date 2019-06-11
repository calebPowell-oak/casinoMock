package com.groupFour;

import java.util.Stack;

public class Deck {

    private Stack<Integer> draw;
    private Stack<Integer> discard;

    public Deck() {
        // set up a fresh deck
    }

    // Other constructors for modified decks, multiple decks, etc.

    public void shuffle(Stack<Integer> pickDeck){}

    public Integer getCard(Stack<Integer> pickDeck){
        return null; // return a pop off the stack
    }

    public Integer putCard(Stack<Integer> pickDeck){
        return null; // push a card onto the stack
    }

    public void renewDraw(){
        // Shuffle discard into draw pile
    }
}
