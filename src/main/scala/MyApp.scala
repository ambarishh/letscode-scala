import arrays.S99

/**
  * Created by ahazarnis on 1/6/17.
  */
object MyApp {

  def main(args: Array[String]): Unit = {
    val s99 = S99()

    /*  P01  */
    println(s99.last(List(1, 1, 2, 3, 5, 8)))
    assert(s99.last(List(1, 1, 2, 3, 5, 8)).get==8)

    /*  P02  */
    println(s99.penultimate(List(1, 1, 2, 3, 5, 8)))
    assert(s99.penultimate(List(1, 1, 2, 3, 5, 8)).get==5)

    /*  P03  */
    println(s99.nthElement(2,List(1, 1, 2, 3, 5, 8)))
    assert(s99.nthElement(2,List(1, 1, 2, 3, 5, 8)).get==2)

    /*  P04  */
    println(s99.numberOfElements(List(1, 1, 2, 3, 5, 8)))
    assert(s99.numberOfElements(List(1, 1, 2, 3, 5, 8))==6)

    /*  P05  */
    println(s99.reverseList(List(1, 1, 2, 3, 5, 8)))

    /*  P06  */
    println(s99.isPalindrome(List(1, 2, 3, 2, 1)))
    assert(s99.isPalindrome(List(1, 2, 3, 2, 1)))

    /*  P07  */
    //println(s99.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

    /*  P08  */
    println(s99.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))


  }

}
