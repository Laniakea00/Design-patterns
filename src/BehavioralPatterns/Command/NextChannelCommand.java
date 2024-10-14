package BehavioralPatterns.Command;

// Команда для переключения на следующий канал
public class NextChannelCommand implements Command {
    private Television tv;

    public NextChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }
}
