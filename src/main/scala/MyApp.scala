import S99.{S11to20, S1to10}

/**
  * Created by ahazarnis on 1/6/17.
  */
object MyApp {

  def main(args: Array[String]): Unit = {
    val s1to10 = S1to10()
    val s11to20 = S11to20()

    /*  P01  */
    println(s1to10.last(List(1, 1, 2, 3, 5, 8)))
    assert(s1to10.last(List(1, 1, 2, 3, 5, 8)).get==8)

    /*  P02  */
    println(s1to10.penultimate(List(1, 1, 2, 3, 5, 8)))
    assert(s1to10.penultimate(List(1, 1, 2, 3, 5, 8)).get==5)

    /*  P03  */
    println(s1to10.nthElement(2,List(1, 1, 2, 3, 5, 8)))
    assert(s1to10.nthElement(2,List(1, 1, 2, 3, 5, 8)).get==2)

    /*  P04  */
    println(s1to10.numberOfElements(List(1, 1, 2, 3, 5, 8)))
    assert(s1to10.numberOfElements(List(1, 1, 2, 3, 5, 8))==6)

    /*  P05  */
    println(s1to10.reverseList(List(1, 1, 2, 3, 5, 8)))

    /*  P06  */
    println(s1to10.isPalindrome(List(1, 2, 3, 2, 1)))
    assert(s1to10.isPalindrome(List(1, 2, 3, 2, 1)))

    /*  P07  */
    //println(s1to10.flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

    /*  P08  */
    println(s1to10.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))


    /*  P09  */
    println(s1to10.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    /*  P10  */
    println(s1to10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    /*  P11  */
    println(s11to20.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    /*  P12  */
    println(s11to20.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))

    /*  P16  */
    println(s11to20.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    /*  P17  */
    println(s11to20.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  }

}
