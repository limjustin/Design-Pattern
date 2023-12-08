package DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Integer> scores = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers)
            o.update();
    }

    public void addScore(int score) {
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScores() {
        return scores;
    }
}
