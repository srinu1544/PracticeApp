package com.example.practiceapp.deligate.interface_deligate




class  FileDownloader(private val file : String )  : Downloadr {
    override fun download() {
        println("$file downloaded")
    }

}


class FilePlayer(private val file : String) : Player {
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
                private val player: Player
) : Downloadr by downloadr, Player by player{

}

fun main(){

    val file : String = "File.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()


}