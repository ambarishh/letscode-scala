package arrays

/**
  * Created by Ambarish Hazarnis on 1/6/17.
  * Question link- https://leetcode.com/problems/two-sum/
  */

object TwoSum extends App{
  def twoSum(array:Array[Int],target:Int):(Int,Int)={
    var index1:Int= -1
    var index2:Int= -1
    var loop:Boolean=true

    array.map{
          ele=>
            if(array.contains(target-ele) && array.indexOf(ele) != array.indexOf(target-ele)) {
              index1 = array.indexOf(ele)
              index2 = array.indexOf(target - ele)
            }
    }

    return (index1,index2)
  }

  val array = Array(9, 7, 2, 15)
  val target=9
  assert(twoSum(array,target) == (2,1))
}
