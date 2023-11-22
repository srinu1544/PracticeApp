package com.example.practiceapp.Kotlin.classes.object_

interface  DownloadListener {

    fun onDownloadStarted()
    fun onDownloadCompleted(file : String)

    fun onProgressUpdate(progress : Int)
}

