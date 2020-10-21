package com.genxmultiplexer.coroutinefundemental

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class Model : ViewModel() {

   private var downloadValue=MutableLiveData<String>()

    var stdList = MutableLiveData<List<String>>()


    private var count = MutableLiveData<Int>()

    // var mylist= mutableListOf<Int>()

    init {
        count.value = 0
        stdList.value = mutableListOf()
        downloadValue.value="name"
    }

    val coutData: LiveData<Int>
        get() = count

    val listData: LiveData<List<String>>
        get() = stdList

    val downloadData:LiveData<String>
    get() = downloadValue


    fun updateCount() {

        CoroutineScope(Dispatchers.Main).launch {
            for (index in 1..100) {
                delay(1000)
                count.value = index
                Log.d("TAG", "CoroutinesScope Running- $index")
            }


        }

        /*
        It' doesn't work
        GlobalScope.launch {
            for (index in 1..100){
                delay(1000)
                count.value=index
                Log.d("TAG","GlobalScope Running- $index")
            }
        }

         */


    }

    fun updateList() {
        CoroutineScope(Dispatchers.Main).launch {

            for (index in 1..100) {
                delay(2000)
                stdList.value = listOf("Element-$index")

            }
        }


    }

    suspend fun download() {
        for (index in 1..2000) {
            withContext(Dispatchers.Main){
                downloadValue.value=index.toString()
                delay(1000)

        }

    }
}


    suspend fun getStock1():Int{
        delay(10000)
        Log.i("MYTAG","Stack-1 called")
        return 1000
    }

    suspend fun getStock2():Int{
        delay(8000)
        Log.i("MYTAG","Stack-2 called")
        return 1000
    }

    suspend fun getStock3():Int{
        delay(6000)
        Log.i("MYTAG","Stack-3 called")
        return 1000
    }

    suspend fun getStock4():Int{
        delay(1000)
        Log.i("MYTAG","Stack-4 called")
        return 1000
    }




}