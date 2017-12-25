


object AccStarter extends App{
  
  override def main(args:Array[String])={
    val accer=new CheckSumAcc()
    println(accer.calculate("long line"));
    println(accer.calculate("long line"));
    println(accer.calculate("long line2"));
    println(accer.calculate("ab"));
    println(accer.calculate("а"));
  }
}