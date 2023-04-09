@main def main: Unit =
  println("Hello world!")
  println(msg)
  new Hello()
  new Message("This is my message!!")

def msg = "I was compiled by Scala 3. :)"

// Simple class
class Hello{
  println("Hello Scala !!!!")
}

// Class with parameter
class Message(message: String){
  println(message)
}

