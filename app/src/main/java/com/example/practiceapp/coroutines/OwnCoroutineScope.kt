package com.example.practiceapp.coroutines

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.practiceapp.Greeting
import com.example.practiceapp.ui.theme.PracticeAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext


/*

In this how to create our own coroutine scope example

*/
class OwnCoroutineScope() : ComponentActivity(), CoroutineScope {

    //step 1
    private lateinit var job : Job

    //step 2
    override val coroutineContext: CoroutineContext
        get () = job + Dispatchers.Main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //step 3
        job = Job()
        setContent {
            PracticeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}