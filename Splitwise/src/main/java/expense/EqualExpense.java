package expense;

import org.domain.User;
import split.Split;

public class EqualExpense extends Expense{

    public EqualExpense(String id, String description, double amount, User paidBy) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
    }

    @Override
    public boolean validate() {
        return splits != null &&
                splits.stream().mapToDouble(Split::getAmount).sum() == amount;
    }
}
