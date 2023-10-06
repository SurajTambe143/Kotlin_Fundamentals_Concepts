package kotlincode

class Song(var title : String, var artist : String ){

    fun play(){
        println("Song is playing with title $title and artist $artist")
    }

    fun stop(){
        println("Song $title is stoped !")
    }
}

fun main(){

    var song1 = Song("Tum hi ho", "Arjit Singh")
    var song2 = Song("Brown Rang", "Honey Singh")
    var song3 = Song("Interstellar", "Badhsha")

    song1.play()
    song2.play()
    song2.stop()
    print(song3.artist)
}