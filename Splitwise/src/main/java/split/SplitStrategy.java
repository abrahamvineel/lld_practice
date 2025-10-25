package split;

import org.domain.User;

import java.util.List;
import java.util.Map;

public interface SplitStrategy {
    List<Split> calculateSplits(double amount, List<User> users, Map<String, Double> metadata);
}
