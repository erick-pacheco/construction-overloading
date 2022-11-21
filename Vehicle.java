class Vehicle {
  String make;
  String model;
  int manufactured;

  public Vehicle(String make, String model, int manufactured) {
    this.make = make;
    this.model = model;
    this.manufactured = manufactured;
  }

  /* Section 6: Overload constructor by adding two params */
  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  /* Section 7: Overload constructor by adding a single param */
  public Vehicle(String make) {
    this.make = make;
  }

  public String toString() {
    return "This " + this.make +
        ", " + this.model +
        " was made in the year " + this.manufactured;
  }

}