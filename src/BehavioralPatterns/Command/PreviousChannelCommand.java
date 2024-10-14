package BehavioralPatterns.Command;

// Команда для переключения на предыдущий канал
public class PreviousChannelCommand implements Command {
    private Television tv;

    public PreviousChannelCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.previousChannel();
    }
}