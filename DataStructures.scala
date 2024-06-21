
object DataStructures{
  def main(args: Array[String]): Unit = {

    //list:immutable,homo
    val l: List[String] = List("apple","melon","grape")

    println(l.head) //apple
    println(l.tail)//except first elem
    println(l.last)//grape
    println(l)

    val l1 = List("hadoop","spark","lume",true,786)//any datatype
    println(l1)
    println(l1.getClass)

    //empty list
    val l2: List[Nothing] = List()
    println(l2)

    val l4 = 45::78::56::67::Nil //Nil represent close

    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities+="tvm"
    cities+=("mumbai","gokarna")
    cities -= "mumbai"
    println(cities)
    cities.toList //typecasting
    
    //iterator
    var myList = List(20,302,20,20,232,023)
    var iter = myList.iterator
    
    println(iter.next())
    println(iter.next())

    //array
    val arr = Array("hadoop","spark","lume") //even if its val ,array is mutable
    println(arr)

    var arr1:Array[String] = Array("hadoop", "spark", "lume")
    println(arr1)

    arr.foreach(println)

    println((arr.mkString(":")))

    arr(0) = "pineapple"
    println((arr.mkString(":")))

    //empty array
    val arr_1 = new Array[String](10)
    //2D
    val arr_2 = Array.ofDim[Int](3,3)
    arr_2(0)(0) = 45
    arr_2(1)(1) = 45

    val flattenArray : Array[Int] = arr_2.flatten
    println(flattenArray.mkString(","))

    //set
    val set1 : Set[String] = Set()
    val set_2 = Set("erk","oop","go")

    import  scala.collection.mutable.HashSet
    val mutableSet = Set("eik","dop","go")
    mutableSet += "plum"
    mutableSet -= "kik"

    //tuple - immutable
    val t1 = (12,34,2,3,4,43,223)
    //t1._1 = "bnb"  - immutable
    println(t1._2)

    //import  scala.collection.immutable.Map //to immutable or mutable
    var Mapvar:Map[String,Int] = Map()//empty
    var Mapvar1 = Map("UST1001"->"ONE","UST1008"->"FIVE","UST1009"->"TWO")
    println(Mapvar1.contains("UST1001"))
    println(Mapvar1.get("UST1001"))
    println(Mapvar1.keys)
    println(Mapvar1.values)

    import  scala.collection.mutable.Map
    var mutable_var = Map("UST1001"->"ONE","UST1008"->"FIVE","UST1009"->"TWO")
    mutable_var("UST1001") = "sss"
    mutable_var+=("UST1007"->"hhggg")
    
    lazy val donut : Int= 90 //use val with lazy not var
    println((donut))
  }
}