package arrays

/**
  * Created by ahazarnis on 1/7/17.
  * Question- https://leetcode.com/problems/remove-duplicates-from-sorted-array/
  */
object RemoveDuplicatesFromSortedArray extends App{

  def removeDuplicatesFromSortedArray(array:Array[Int]):(Array[Int],Int)={
    var length:Int=1
    for(i<-1.until(array.length))
      if(array(i)!=array(i-1)) {
        array(length)=array(i);
        length=length+1
      }
    (array,length)
  }

  val test1=Array(1,1,2)
  val (array,length)=removeDuplicatesFromSortedArray(test1)
  println(array.mkString(",")+":"+length)
}
