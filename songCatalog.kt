class MusicPlayer constructor(title: String, authorFullName: String, pubDate: String) {
    private var numberOfAuditions = 0
    private val title = title
    private val authorFullName = authorFullName
    private val pubDate = pubDate
    val isPopular = 
    	if (numberOfAuditions < 1000) false
        else true
    
    
    fun printMusicInfo() {
        println("$title, performed by $authorFullName, was released in $pubDate.")
    }
}

fun main() {
    val musicPlayer = MusicPlayer("foo", "bar", "17.10.2024")
    musicPlayer.printMusicInfo()
    println(musicPlayer.isPopular)
}