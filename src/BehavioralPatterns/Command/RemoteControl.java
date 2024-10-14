package BehavioralPatterns.Command;

// Класс RemoteControl: отвечает за назначение команд на кнопки пульта и выполнение команд
// при нажатии на соответствующие кнопки
public class RemoteControl {
    private Command[] commands; // Массив команд для кнопок пульта

    // Конструктор: инициализирует пульт с количеством кнопок
    public RemoteControl() {
        commands = new Command[6]; // 6 кнопок
    }

    // Метод для назначения команды на конкретную кнопку
    public void setCommand(int slot, Command command) {
        if (slot >= 0 && slot < commands.length) {
            commands[slot] = command;
        }
    }

    // Метод для выполнения команды, назначенной на кнопку
    public void pressButton(int slot) {
        if (slot >= 0 && slot < commands.length && commands[slot] != null) {
            commands[slot].execute(); // Выполнить команду
        } else {
            System.out.println("Кнопка не настроена."); // Если команда не настроена
        }
    }
}