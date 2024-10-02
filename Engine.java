package Assignment6;

class Engine {
    private final String engineType;
    private final int horsepower;

    public Engine(String engineType, int horsepower) {
        this.engineType = engineType;
        this.horsepower = horsepower;
    }

    public String displayDetails() {
        return "Engine Type: " + engineType + ", Horsepower: " + horsepower + " HP";
    }
}