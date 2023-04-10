@main def main: Unit =
  println("Hello world!")
  println(msg)
  new Hello()
  new Message("This is my message!!")
  val hello2 = new HelloAgain()
  println(hello2.message)
  println(name("Martin"))
  // We can access an object because it creates a singleton
  println(Hello4.message)

def msg = "I was compiled by Scala 3. :)"

// Simple class
class Hello{
  println("Hello Scala !!!!")
}

// Class with parameter
// By default class parameters are not accesible
class Message(message: String){
  println(message)
}

// Class values
// Represents the state of instance, it is outside accesible unless specified otherwise

// Fields vs Parameters
// Parameters are passed to a class and are only visible within a class
// Fields exist in the body of the class, and are accesible to outsiders
// It is important to said that inmutable fields are threadsafe
// It ensures that multiple threads cannot update the field at same time
class HelloAgain{
  // Unmutable field
  val message: String = "Hello from field";
}

// Methods
// Methods are evaluated at the time they are called
def hello3 = "Hello"
def echo(message: String): String = message

// Infix notation helps us to call methods without . and withput () if we have only 1 arg

// Default args
def name(first: String = "Anderson", last: String = "Cardenas"): String = first + " " + last

// Objects in scala and singleton
// object O creates a singleton object O as instance of some anonymous class;
// Class factories
// Utility methods
// Constant definition

object Hello4 {
  def message = "Hello 4!"
}