package arrays

/**
  * Created by Ambarish Hazarnis on 1/6/17.
  * Question- https://leetcode.com/problems/pascals-triangle-ii/
  *
  */

object PascalTriangle extends App{

  def pascal(k:Int):Array[Int]={
    var result:Array[Int]=new Array[Int](k)
    for(cols <- 0.until(k))
      result(cols)=getPascalNumber(k-1,cols)
    result
  }

  def getPascalNumber(row:Int,col:Int):Int={
    if(row==col || col==0)
      1
    else
      getPascalNumber(row-1,col)+getPascalNumber(row-1,col-1)
  }

  def printPascal(k:Int): Unit ={
    for(rows <- 0.until(k)){
      for(cols <- 0.to(rows))
        print(getPascalNumber(rows,cols) + ",")
      println()
    }
  }

  printPascal(4)
  println(pascal(4).mkString(","))

}
