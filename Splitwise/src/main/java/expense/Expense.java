package expense;

import org.domain.User;
import split.Split;

import split.SplitStrategy;
import java.util.List;
import java.util.Map;

public abstract class Expense {
    protected String id;
    protected String description;
    protected double amount;
    protected User paidBy;
    protected List<Split> splits;

    public abstract boolean validate();

    public void applySplits(SplitStrategy strategy, List<User> users, Map<String, Double> metadata) {
        this.splits = strategy.calculateSplits(amount, users, metadata);
    }

    public List<Split> getSplits() {
        return splits;
    }
}
