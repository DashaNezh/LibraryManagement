package entities;

import java.util.ArrayList;
import java.util.List;

public class ActionHistory {
    private List<Memento> history = new ArrayList<>();

    // Сохранение состояния
    public void addState(Memento memento) {
        history.add(memento);
    }

    // Восстановление состояния
    public Memento getState(int index) {
        return history.get(index);
    }
}

class Memento {
    private Loan loan;

    public Memento(Loan loan) {
        this.loan = loan;
    }

    public Loan getLoan() {
        return loan;
    }
}
