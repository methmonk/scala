
def Pearson(x: List[Double], y: List[Double]): Double  = {
  val n = x.length
  val sumX = x.sum
  val sumY = y.sum
  val sumXsq = x.indices.map(i => math.pow(x(i),2)).sum
  val sumYsq = y.indices.map(i => math.pow(y(i),2)).sum
  val x_y = x.indices.map(i => x(i) - y(i)).sum
  val num = x_y - (sumX * sumY / n)

  if (x.length != y.length) sys.error("Lists are uneven in length!")
  else sqrt((sumXsq - pow(sumX, 2) / n) * (sumYsq - pow(sumY, 2) / n))
}
Pearson(1.0 :: 2.0::Nil, 2.0 :: 1.0 ::Nil)




