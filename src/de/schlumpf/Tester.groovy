package de.schlumpf

public class Tester implements Serializable {
  public String name = "test"

 // class Tester(String pName) {
//    this.name = pName
//  }
  
  class Tester(String name) {
    this.name = name
  }

  def sayHi() {
    echo "Hello, ${this.name}."
  }

  def sayHi(String name) {
    echo "Hello, ${name}."
  }
}
