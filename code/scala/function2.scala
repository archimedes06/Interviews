def function2(n: Int, seq: Seq[Int] = Seq(1)): Seq[Int] = {
    if (n == 1) {
        seq
    } else  {
        val a: Seq[(Int, Int)] = seq.foldLeft(Seq[(Int, Int)]((0,0)))((list,b) => list :+ (list.last._2, b))
        val c: Seq[Int] = (a.tail :+ (a.last._2, 0)).map(tup => tup._1 + tup._2)
        function2(n-1, c)
    }
}