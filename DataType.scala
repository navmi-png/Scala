
object DataType{
  def main(args: Array[String]): Unit ={ //arg getting passed as array of str

    //integer
    val intNum: Int = 30
    val longNum: Long = 65436785L
    val shortNum: Short = 5432
    val byteNum: Byte = 127

    //floating
    val FloatingNum: Float = 3.12f
    val doubleNum: Double = 3.5635432

    //str
    val stringOne: String = "het"

    //character
    val charvar: Char = 'A'

    //unit datatype
    val unitValue: Unit = ()

    // boolean
    var bool: Boolean = true //var mutable
    bool = false

    print("boolean:"+bool)
    println(s"integer: $intNum" )
    print(s"float:$doubleNum")
  }
}