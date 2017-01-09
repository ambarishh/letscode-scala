package arrays

/**
  * Created by Ambarish Hazarnis on 1/6/17.
  * Question https://leetcode.com/problems/contains-duplicate-ii/
  */
object ContainsDuplicateII extends App{

  def containsDuplicate(array:Array[Int],k:Int):Boolean={
    for(i <- 0 until array.length){
      var count=1
      while(count<=k){
        if(i+count<array.length && array(i)==array(i+count))
              return true
        count=count+1
      }
    }
    false
  }

  val test1 = Array(3,4,3,1,2)
  println(containsDuplicate(test1,3))
  assert(containsDuplicate(test1,2)==true)
}
