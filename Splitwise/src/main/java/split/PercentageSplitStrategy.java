package split;

import org.domain.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PercentageSplitStrategy implements SplitStrategy{
    @Override
    public List<Split> calculateSplits(double amount, List<User> users, Map<String, Double> metadata) {
        double percentage = 1.0 / users.size();
        double share = amount * percentage;
        return users.stream()
                .map(u -> new PercentageSplit(u, share))
                .collect(Collectors.toList());
    }
}
