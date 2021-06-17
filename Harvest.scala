object Harvest{
  def main(args: Array[String]){

    val harvestArray = Array(Array(0, 0, 0, 0, 0, 0, 0),
                             Array(0, 0, 0, 0, 0, 0, 0),
                             Array(0, 0, 0, 0, 0, 0, 0),
                             Array(0, 0, 0, 0, 0, 0, 0)
                                          )
    var i = -1;
    var j = -1;

    println("Enter the harvest amounts of the first week");
    for(i <- 0 until 7){
      harvestArray(0)(i) = readInt();
    }

    println("Enter the harvest amounts of the second week");
    for(i <- 0 until 7){
      harvestArray(1)(i) = readInt();
    }

    println("Enter the harvest amounts of the third week");
    for(i <- 0 until 7){
      harvestArray(2)(i) = readInt();
    }

    println("Enter the harvest amounts of the fourth week");
    for(i <- 0 until 7){
      harvestArray(3)(i) = readInt();
    }

    var max = harvestArray(0)(0);
    var maxi = 0; var maxj = 0;
    var min = harvestArray(0)(0);
    var sum = 0;
    var mini = 0; var minj = 0;

    for(i <- 0 until 7 ; j <- 0 until 4){
      if(harvestArray(i)(j) < min){
        min = harvestArray(i)(j);
        mini = i; minj = j;
      }
      if(harvestArray(i)(j) > max){
        max = harvestArray(i)(j);
        maxi = i; maxj = j;
      }
      sum = sum + harvestArray(i)(j);
    }
    val Average = sum/28;
    val Range = max - min;

    println("Max = " + max + " on " + maxi + "." + maxj);
    println("Min = " + min + " on " + mini + "." + minj);
  }
}
