package com.example.practiceapp.Kotlin_Android.object_

class  Downloader {

    var downloadlistrner : DownloadListener? = null

    fun downloadFile(file : String) {
        downloadlistrner?.onDownloadStarted()
        for(i in 1..10){
            Thread.sleep(600)
            downloadlistrner?.onProgressUpdate(i * 10)
        }
        downloadlistrner?.onDownloadCompleted(file)
    }
}