fun main() {    
    val foldablePhone = FoldablePhone()
    foldablePhone.checkPhoneScreenLight()
    
    foldablePhone.fold()
    foldablePhone.checkPhoneScreenLight()
    
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    
    foldablePhone.unFold()
    foldablePhone.checkPhoneScreenLight()
    
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}


class FoldablePhone(var isScreenLightOnOff: Boolean = false, 
                    var isFold: Boolean = false): Phone(isScreenLightOn = isScreenLightOnOff) {
    fun fold() {
        super.switchOff()
        isFold = true
    }
    
    fun unFold() {
        isFold = false
    }
    
    override fun switchOn() { 
        if (!isFold) {
            super.switchOn()
        }
    }
    
}


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}