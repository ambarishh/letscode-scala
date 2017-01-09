package arrays

import scala.annotation.tailrec

/**
  * Created by ahazarnis on 1/8/17.
  * My attempts to solve the 99 scala problems
  * Link- http://aperiodic.net/phil/scala/s-99/
  */
class S99{

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





}

object S99{
  def apply(): S99 = new S99()
}

