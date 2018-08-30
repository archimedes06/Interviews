def function1[M : Numeric](seq: Seq[M]): Seq[M] = {
  val num = implicitly[Numeric[M]]
 
  def inner(innerSeq: Seq[M], n: Int = 0, bool: Boolean = false): (Seq[M], Boolean) = {
    if (n >= (innerSeq.size - 1)) {
      (innerSeq, bool)
    } else {
      val first: M = innerSeq(n)
      val second: M = innerSeq(n+1)
      if (num.gt(first, second)) {
        val (front: Seq[M], back: Seq[M]) = innerSeq.splitAt(n+1)
        inner((front.dropRight(1) :+ second) ++ (first +: back.drop(1)), n+1, true)
      } else {
        inner(innerSeq, n+1, bool)
      }
    }
  }
 
  val (newSeq: Seq[M], bool) = inner(seq)
 
  if (bool)
    function1(newSeq)
  else
    seq
}