package S99

import scala.annotation.tailrec

/**
  * Created by ahazarnis on 1/8/17.
  * My attempts to solve the 99 scala problems
  * Link- http://aperiodic.net/phil/scala/s-99/
  */
class S1to10{

  /*
      P01 (*) Find the last element of a list.
      Use of Scala generics. Type parameter must be placed after function name.
   */
  @tailrec
  final def last[T](list: List[T]):Option[T]={
    list match {
      case h::Nil => Some(h)
      case _::tl => last(tl)
      case Nil => None
    }
  }

  /*
      P02 (*) Find the last but one element of a list.
  */
  @tailrec
  final def penultimate[T](list:List[T]):Option[T]={
    list match {
      case h::_::Nil => Some(h)
      case _::tail => penultimate(tail)
      case Nil => None
    }
  }

  /*
      P03 (*) Find the Kth element of a list.
   */
  final def nthElement[T](n:Int,list:List[T]):Option[T]={
    (n,list) match {
      case (0,h::_) => Some(h)
      case (n,_::tail) => nthElement(n-1,tail)
      case (_,Nil) => None
    }
  }

  /*
      P04 (*) Find the number of elements of a list.
   */
  def numberOfElements[T](list: List[T]):Int={
    list.foldLeft(0){
      (acc,_) => acc+1
    }
  }

  /*
      P05 (*) Reverse a list.
      Instatiate a new list using apply
  */
  def reverseList[T](list: List[T]):List[T]={
    list.foldLeft(List[T]()){
      (acc,head) => head::acc
    }
  }

  /*
      P06 (*) Find out whether a list is a palindrome.
   */
  def isPalindrome[T](list: List[T]):Boolean={
    list.equals(reverseList(list))
  }

  /*
      P07 (**) Flatten a nested list structure.
   */

  /*
    P08 (**) Eliminate consecutive duplicates of list elements.
   */
  def compress[T](list: List[T]):List[T]={
    list match {
      case Nil => Nil
      case h::tail => h::compress(tail.dropWhile(_==h))
    }
  }

  /*
      P09 (**) Pack consecutive duplicates of list elements into sublists.
      def span(p : (A) => Boolean) : (List[A], List[A])
        Returns the longest prefix of the list whose elements all satisfy the given predicate, and the rest of the list.
        Parameters
        p - the test predicate
        Returns
        a pair consisting of the longest prefix of the list whose elements all satisfy p, and the rest of the list.

   */
  def pack[T](list: List[T]):List[List[T]]={
    val (packed,next) = list.span{ _ == list.head}
    if(next==Nil)  List(packed)
    else           packed :: pack(next)
  }

  /*
      P10 (*) Run-length encoding of a list.
  */
  def encode[T](list: List[T]):List[(Int,T)]={
    val packed = pack(list)
    packed.map(list => (list.length,list.head))
  }



}

object S1to10{
  def apply(): S1to10 = new S1to10()
}

