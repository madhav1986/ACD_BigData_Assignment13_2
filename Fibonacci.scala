object Fibonacci
{
def fibRecursion( n : Int) : Int = n match {
   case 0 | 1 => n
   case _ => fibRecursion( n-1 ) + fibRecursion( n-2 )
}

def calcFib(n: Int) = {
  if (n < 2) 
    {
      n
    }
  
  else 
  {
    var result = 0
    var n1 = 0
    var n2 = 1

      var i = n - 1
      while (i > 0) 
      {
          i = i - 1
          result = n1 + n2
          n1 = n2
          n2 = result
      }
          result
    }
  }

  def main(args: Array[String]) 
  {
    val x = args(0).toInt
    println("Nth Digit of Fibonacci series using standard loop : "+calcFib(x))  
    println("Nth Digit of Fibonacci series using recursion : "+fibRecursion(x))
  }
}

