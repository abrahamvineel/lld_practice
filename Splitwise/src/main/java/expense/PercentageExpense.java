package expense;

import org.domain.User;
import split.Split;

public class PercentageExpense extends Expense {

    public PercentageExpense(String id, String description, double amount, User paidBy) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
    }

    @Override
    public boolean validate() {
        return splits != null &&
                splits.stream().mapToDouble(Split::getAmount).sum() == amount;    }
}
