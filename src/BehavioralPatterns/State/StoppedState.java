package BehavioralPatterns.State;

// Состояние остановки
class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Запуск воспроизведения с начала.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер остановлен. Нельзя поставить на паузу.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер уже остановлен.");
    }
}

