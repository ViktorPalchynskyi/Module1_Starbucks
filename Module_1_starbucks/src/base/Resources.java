package base;

public enum Resources {
    WATER(70),
    COFFEE_SEED(50),
    MILK(20),
    CUP(100),
    SUGAR(20);
    private int numberOfRes;

    Resources(int numberOfRes) {
        this.numberOfRes = numberOfRes;
    }
}
