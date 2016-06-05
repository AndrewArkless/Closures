package otherScope

/**
  * Created by User on 05/06/2016.
  */
class Foo {
  def exec(f:(String)=>Unit,name: String)={
    f(name)
  }
}

object ClosureExample extends App {
  var hello="Hello"
  def sayHello(name:String): Unit ={
    println(s"$hello $name")
  }
  val foo=new otherScope.Foo
  foo.exec(sayHello,"Al")

  hello="Hola"
  foo.exec(sayHello,"Lorenzo")

  var votingAge=18
  val isOfVotingAge=(age:Int)=>age>=votingAge

  println(isOfVotingAge(15))
  println(isOfVotingAge(19))

  votingAge=100
  println(isOfVotingAge(15))
  println(isOfVotingAge(19))
  voting.elligbleToVote(isOfVotingAge,"Andrew")
}
