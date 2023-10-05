package com.example.practiceapp.coroutines

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
what is coroutine:
------------------
Coroutines are available for Kotlin. They execute long-running tasks without blocking
the main thread or freezing the UI


suspend function :
------------------
-> start, resume and pause coroutine execute coroutine
-> you cannot call suspend function either coroutine or another suspend function
-> it does not block the main thread
-> suspend means function can suspend and start it is same as writing callbacks but in simple
and cleaner way
-> In this function network request will be called asynchronously in the io thread and get the
result and process in the main thread

from 2.6 retroft supports coroutines

scopes :
Global Scope
LifeCycle Scope
ViewModel Scope

Global scope :
-------------
The life cycle of global scope is life cycle of whole application that is why we never use
this Global scope because it may cause memory leaks.

this scope is used in only quick debuging things

GlobalScope.launch(Dispatchers.Main){
}


life cycle scope :
------------------
This scope is automatically canceled when your activity or fragment destroyed so we dont need
worry about memory leaks

launch :
--------
-> where launch is used for where you dont want to get result back (updating of data extra)
-> launch the coroutine and forget
-> launch calls sequentially


withContext :
------------
-> this is a suspending function call only in coroutine
-> switch the context
-> It is mainly used for shift execution of block into a different thread if new dispatcher is specified.
withContext is nothing but another way of writing the async where one does not have to
write await(). When withContext, is used, it runs the tasks in series instead of parallel.
So one should remember that when we have a single task in the background and want to get
back the result of that task, we should use withContext

await :
------
-> blocking the main thread
->  await retrieves the result.
-> Await can be used on the main thread




async :
-------
-> parallel execution
-> it calls the function concurrent manner
-> start the coroutine and get result back
-> it returns a  deferred value
-> with the use of await it get the actual value otherwise it gets deferred value.
-> async can be on the background thread.

runBlocking :
----------
-> it blocks our thread
-> it blocks the current thread
-> it is also block onDraw function for updating ui and it will lead to unresponsive application.
->  it is used for testing and debuging purpose

delay :
-------
simply delay the execution with the given milliseconds

yield :
-------







//Dispachers

https://www.youtube.com/watch?v=3q5dvywJMfo&ab_channel=Smartherd

    Dispatchers.Io -> network request or desk read and write
    Dispatchers.Main -> main safety

    Dispatchers.Default :
    ---------------------
    -> CPU intensive task
    -> this is similar to GlobalScope.launch{}
    -> It will execute on separate background thread
    -> after delay function also it will might be change thread

    Dispatchers.Unconfined :
    ------------------------
    -> it is execute on parent
    -> it inherits coroutine context from parent coroutine
     -> after delay function also it will run on the other thread

    with out any dispatcher (parameter) CONFINED  DISPATCHER  :
    ----------------------------------------------

     -> only launch means it runs on main thread
     -> it inherits coroutine context from parent coroutine
     -> after delay function also it will run on the same thread

     launch{ // it runs on parent thread
     }

     like :

     runBlock {
      launch{ // it runs on parent thread
       }
     }




    Job :
    -----
   -> coroutines life cycle
   -> cancellation
   -> parent-child-relation


   State	                   isActive	 isCompleted  isCancelled
New (optional initial state)	false	  false	          false
Active (default initial state)	true	  false	          false
Completing (transient state)	true	  false	          false
Cancelling (transient state)	false	  false	           true
Cancelled (final state)	false	true	  true             true
Completed (final state)	false	true	  false            false

   join :
   -----

   cancelAndJoin :
   --------------

   ensureActive :
   ---------------

   coroutinescope :
   --------------
   -> this scope is unique for each coroutine

   coroutinecontext :
   ------------------
   -> coroutinecontext is inherited from parent to child



 */
fun main() = GlobalScope.launch(Dispatchers.IO){

}




