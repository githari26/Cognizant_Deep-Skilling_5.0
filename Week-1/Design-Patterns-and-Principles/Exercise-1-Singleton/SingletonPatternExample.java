public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("Loading Resources");

        Logger logger3 = Logger.getInstance();
        logger3.log("Application Closed");

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("Only one Logger instance exists.");
        }
    }
}