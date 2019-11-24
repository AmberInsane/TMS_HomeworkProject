package hw_14.task_7;

public class ManMain {
    public static void main(String[] args) {
        Man manWithoutTelephone = new Man("Leha", "Sobolev");
        System.out.println("manWithoutTelephone " + manWithoutTelephone);

        Man manWithoutSurname = new Man("Leha", "+34234932434");
        System.out.println("manWithoutSurname " + manWithoutSurname);

        Man manWithAllParams = new Man("Leha", "Sobolev", "+34234932434");
        System.out.println("manWithAllParams " + manWithAllParams);
    }
}
