def function3(seq: Seq[Double], a: Double): Seq[(Double, Int)] = {
    if (seq.isEmpty) {
        Seq((0.0, 0))
    } else {
        val min = math.floor(math.min(0, seq.min/a)).toInt
        val max = math.floor(math.max(0, seq.max/a)).toInt
 
        val base: Seq[(Int, Int)] = (min to max).map(e => (e -> 0))
 
        val adder: Seq[(Int, Int)] = seq.map(e => math.floor(e/a).toInt).groupBy(identity).toSeq.map{
            case (key, list) => key -> list.size
        }
 
        (base ++ adder).groupBy(_._1).toSeq.map(e => ((2*e._1+1)/2.0)*a -> e._2.map(_._2).sum).sortBy(_._1)
    }
}