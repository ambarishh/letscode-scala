package S99

import scala.util.Try

/**
  * Created by ahazarnis on 1/8/17.
  */
class S11to20 {

  /*
    P11 (*) Modified run-length encoding.
  */
  def encodeModified[T](list: List[T]):List[Either[T,(Int,T)]]={
    val encoded=S1to10().encode(list)
    encoded.map( tuple => if(tuple._1==1) Left(tuple._2) else Right(tuple))
  }

  /*
    P12 (**) Decode a run-length encoded list.
  */
  def decode[T](list:List[(Int,T)]):List[T]={
    list.flatMap( tuple => List.fill(tuple._1)(tuple._2))
  }

  /*
      P16 (**) Drop every Nth element from a list.
   */
  def drop[T](n:Int,list:List[T]):List[T]={
    def dropRecursive( count:Int,list:List[T]):List[T]={
      (count,list) match {
        case (1, _ :: tail) => dropRecursive(n, tail)
        case (count, h :: tail) => h :: dropRecursive(count - 1, tail)
        case (_, Nil) => Nil
      }
    }
    dropRecursive(n,list)
  }

  /*
      P17 (*) Split a list into two parts.
   */
  def split[T](n:Int,list:List[T]):(List[T],List[T])={
    (list.take(n),list.drop(n))
  }


}

object S11to20{
  def apply(): S11to20 = new S11to20()
}