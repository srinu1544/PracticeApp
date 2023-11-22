package com.example.practiceapp.Kotlin.deligate.interface_deligate

class  FileDownloader(private val file : String )  :
    com.example.practiceapp.Kotlin.deligate.interface_deligate.Downloadr {
    override fun download() {
        println("$file downloaded")
    }

}


class FilePlayer(private val file : String) :
    com.example.practiceapp.Kotlin.deligate.interface_deligate.Playerr {
    override fun play() {
        println("$file playing")
    }
}

// in normal
/*class MediaFile(private val downloadr: Downloadr,
                private val player: Player) : Downloadr,Player{
    override fun download() {
       downloadr.download()
    }

    override fun play() {
        player.play()
    }
}*/

//kotlin provide deligate
class MediaFile(private val downloadr: Downloadr,
                private val player: Playerr
) : Downloadr by downloadr, Playerr by player{

}

fun main(){

    val file : String = "File.mkv"
    val mediaFile = MediaFile(
       FileDownloader(file),
        FilePlayer(file)
    )
    mediaFile.download()
    mediaFile.play()


}