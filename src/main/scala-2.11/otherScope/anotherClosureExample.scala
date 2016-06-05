package otherScope
import scala.collection.mutable.ArrayBuffer

/**
  * Created by User on 05/06/2016.
  */
object anotherClosureExample extends App{
  val fruits=ArrayBuffer("apple")
  val addToBasket=(s:String)=>{
    fruits +=s
    println(fruits.mkString(", "))
  }

  def buyStuff(f:String=>Unit,s:String): Unit ={
    f(s)
  }

  buyStuff(addToBasket,"Apples")
  buyStuff(addToBasket,"Oranges")
}
