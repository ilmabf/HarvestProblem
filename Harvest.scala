
object Harvest extends Enumeration {
  def main(args: Array[String]){

    var harvestArray= Array(Array(0, 0, 0, 0, 0, 0, 0),
                            Array(0, 0, 0, 0, 0, 0, 0),
                            Array(0, 0, 0, 0, 0, 0, 0),
                            Array(0, 0, 0, 0, 0, 0, 0)
                            )

    println("Enter the harvest amounts of the first week");
    for(i<- 0 to 6){
      harvestArray(0)(i) = readInt();
    }

    println("Enter the harvest amounts of the second week");
    for(i<- 0 to 6){
      harvestArray(1)(i) = readInt();
    }

    println("Enter the harvest amounts of the third week");
    for(i<- 0 to 6){
      harvestArray(2)(i) = readInt();
    }

    println("Enter the harvest amounts of the fourth week");
    for(i<- 0 to 6){
      harvestArray(3)(i) = readInt();
    }

    var max = harvestArray(0)(0);
    var maxi = 0; var maxj = 0;
    var min = harvestArray(0)(0);
    var sum = 0;
    var mini = 0; var minj = 0;

    for(i<- 0 to 3){
      for(j<- 0 to 6){

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
    }

    val Average = sum/28;
    val Range = max - min;

    var Days = Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    println("Max = " + max + " on " + Days(maxj) + " of week " + (maxi+1));
    println("Min = " + min + " on " + Days(minj) + " of week " + (mini+1));
    println("Average Harvest = " + Average);
    println("Range = " + Range);

    scala.util.Sorting.quickSort(harvestArray(0));
    scala.util.Sorting.quickSort(harvestArray(1));
    scala.util.Sorting.quickSort(harvestArray(2));
    scala.util.Sorting.quickSort(harvestArray(3));

    scala.util.Sorting.quickSort(harvestArray);
  }
}
