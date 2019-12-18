import scala.util.Try

var result=0
var liczba=0
var operator=""
var flaga=false
//val string="-3 + 4 - 1 + 1 + 12 - 5 + 6"
val string="12 - 7 + 3"
val split=string.split(" ")
for(c<-split){
  print(c)
  c match {
    case "+" => operator="+"
    case "-" => operator="-"
    case a
      if Try(a.toInt).isSuccess =>
        liczba=a.toInt;
        flaga = true
    case _ =>
      throw new NumberFormatException
  }
  if(flaga) {
    if (operator == "+")
      result = result + liczba
    else if (operator == "-")
      result = result - liczba
    else if (operator=="")
      result=liczba
  }
  flaga=false

}
print("Wynik "+result)