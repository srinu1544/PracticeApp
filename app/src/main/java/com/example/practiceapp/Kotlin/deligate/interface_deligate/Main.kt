package com.example.practiceapp.Kotlin.deligate.interface_deligate




class  FileDownloader(private val file : String )  :
    com.example.practiceapp.Kotlin.deligate.interface_deligate.Downloadr {
    override fun download() {
        println("$file downloaded")
    }

}


class FilePlayer(private val file : String) :
    com.example.practiceapp.Kotlin.deligate.interface_deligate.Player {
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
class MediaFile(private val downloadr: com.example.practiceapp.Kotlin.deligate.interface_deligate.Downloadr,
                private val player: com.example.practiceapp.Kotlin.deligate.interface_deligate.Player
) : com.example.practiceapp.Kotlin.deligate.interface_deligate.Downloadr by downloadr, com.example.practiceapp.Kotlin.deligate.interface_deligate.Player by player{

}

fun main(){

    val file : String = "File.mkv"
    val mediaFile = com.example.practiceapp.Kotlin.deligate.interface_deligate.MediaFile(
        com.example.practiceapp.Kotlin.deligate.interface_deligate.FileDownloader(file),
        com.example.practiceapp.Kotlin.deligate.interface_deligate.FilePlayer(file)
    )
    mediaFile.download()
    mediaFile.play()


}