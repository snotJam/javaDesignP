package lastAndDetailDesc.behavior.strategy;

/**
 * 这个就相当于上下文环境Context
 */
public class Student {
    StrategyInterface strategy;

    public void setStrategy(StrategyInterface strategy) {
        this.strategy = strategy;
    }

    public void toSchool() {
        strategy.toSchool();
    }
}
