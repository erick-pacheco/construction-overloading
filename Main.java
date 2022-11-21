class Main {
  public static void main(String[] args) {
    Vehicle car1 = new Vehicle("Honda", "Civic", 2020);
    log(car1);

    Vehicle car2 = new Vehicle("Tesla", "Model S");
    log(car2);

    Vehicle car3 = new Vehicle("Ford");
    log(car3);

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}