package com.example.practiceapp.Kotlin.classes_Object.object_

interface  DownloadListener {

    fun onDownloadStarted()
    fun onDownloadCompleted(file : String)

    fun onProgressUpdate(progress : Int)
}

