
import scala.collection.mutable.Map


class CheckSumAcc {
  
  private var sum=0
  
  private val cache= Map[String,Int]()
    
  def add(b:Byte):Unit= sum+=b  
  
  def checksum():Int= ~(sum & 0xFF)+1

  def calculate(s:String):Int={
		  if(cache.contains(s)) cache(s)
		  else      {
			  val acc=new CheckSumAcc
					  for (c <-s)acc.add(c.toByte)
					  val cs=acc.checksum()
					  cache +=(s -> cs)
					  cs
		  }
  }
  
}