package wrestler;
class Wrestler(name:String,age:Int,height:Int,weight:Int){
    var name:String=name
    var age:Int=age
    var height:Int=height
    var weight:Int=weight

}
fun main(){

    var wrestlers=mutableListOf<Wrestler>()

    wrestlers.add(Wrestler("bhargavi",32,6,50))
    wrestlers.add(Wrestler("nandini",45,5,47))
    wrestlers.add(Wrestler("vincika",48,6,25))
    println("wrestler")
    for(wrestler in wrestlers){
        println("${wrestler.name} ${wrestler.age} ${wrestler.height} ${wrestler.weight}")



    }
    println("List of Wrestlers age greather than 32")
    for(wrestler in wrestlers) {
        if(wrestler.age>32){
        println("${wrestler.name} ${wrestler.age}")
    }
    }
    println("List of Wrestlers weight greather than 50")
    for(wrestler in wrestlers){
    if(wrestler.weight>32){


    println("${wrestler.name} ${wrestler.weight}")
}

}
}

