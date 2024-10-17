fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       println("Name: $name")
       println("Age: $age")
       val hobbyMessage = when(hobby) {
           is String -> "Likes to $hobby."
           else -> ""
       }
       
       val hasReferrerMessage = 
        	if (referrer == null) {
                "Doesn't have a refferer."
            } else {
                "Has a refferer named ${ referrer.name }, who likes to ${ referrer.hobby }."
            }
       println("$hobbyMessage $hasReferrerMessage")
       println()
    }
}