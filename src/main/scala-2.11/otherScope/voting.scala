package otherScope

/**
  * Created by User on 05/06/2016.
  */
object voting {
 def elligbleToVote(f:(Int=>Boolean),name:String)={
   println(name + "Can vote =" + f)
   f
 }

}
