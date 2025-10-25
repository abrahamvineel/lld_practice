package expense;

import org.domain.User;

public class ExpenseFactory {
    public static Expense createExpense(String type, String id, String desc, double amount, User paidBy) {
        switch (type) {
            case "EQUAL": return new EqualExpense(id, desc, amount, paidBy);
            case "PERCENTAGE": return new PercentageExpense(id, desc, amount, paidBy);
            default: throw new IllegalArgumentException("Unsupported expense type");
        }
    }
}
