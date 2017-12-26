//  standalone singleton objects method
import CheckSumAcc.calculate

//  test of someconnector


object AccStarter extends App{
  
  override def main(args:Array[String])={
//  from Odersky example  "Programming in Scala"  
//    println(calculate("long line"));
//    println(calculate("long line"));
//    println(calculate("long line2"));
//    println(calculate("ab"));
//    println(calculate("а"));
//    println(calculate("1232312"));

//my test
    val con=SomeIFaceConnector.getInstance
    
    println(con.getPort())
    println(con.getHost())
  }
}