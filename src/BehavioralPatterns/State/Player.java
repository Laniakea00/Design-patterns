package BehavioralPatterns.State;

// Класс Player управляет текущим состоянием плеера и делегирует вызовы методам состояния
public class Player {
    private PlayerState currentState;

    public Player(){
        this.currentState = new StoppedState(); // Начальное состояние — остановка
    }

    public void setState(PlayerState state){
        this.currentState = state;
    }

    public void play(){
        currentState.play(this);
    }

    public void pause(){
        currentState.pause(this);
    }

    public void stop(){
        currentState.stop(this);
    }
}

