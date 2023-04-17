def function3(seq: Seq[Double], n: Int): Seq[(Double, Int)] = {
    assert(seq.length > 0 && n > 0)

    val min: Double = seq.min
    val max: Double = seq.max

    val d: Double = (max - min) / n
    
    val base: Seq[(Int, Int)] = (0 until n).map(e => (e -> 0))
    val adder: Seq[(Int, Int)] = seq.map(e => math.min(n - 1, math.floor((e - min)/d).toInt)).groupBy(identity).toSeq.map{
    case (key, list) => key -> list.size
    }

    (base ++ adder).groupBy(_._1).toSeq.map(e => (min + ((2*e._1+1)/2.0)* d) -> e._2.map(_._2).sum).sortBy(_._1)
    
}