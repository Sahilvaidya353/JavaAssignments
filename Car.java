package Assignment6;
class Car {
    private final String companyName;
    private final String model;
    private final Engine engine;
    

    public Car(String companyName, String model, Engine engine) {
        this.companyName = companyName;
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        boolean result= true;
    	if (result) {
           
            System.out.println("The" +companyName+ " " + model + " has started");
        } else {
            System.out.println("The " +companyName + " " + model + " is already running.");
        }
    }

    public void stop() {
     boolean  result= false;
    	if (result) {
            
            System.out.println("The" + companyName + " " + model + " has stopped.");
        } else {
            System.out.println("The" + companyName + " " + model + " is already stopped.");
        }
    }

    public void displayEngineDetails() {
        System.out.println(engine.displayDetails());
    }
}