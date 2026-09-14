package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week03Variables()
        week03Functions()
    }
}
private fun week03Variables() {
    println("Week 03 : Variable")

    val courseName = "Mobile Programming" //java final 함수 내에서 재 정의 불가능

    var week = 2
    week = 3
    println("Course : $courseName")
    println("week : $week")

    println("==== kotlin Variables ====")

    //val(immutable) var(variables)
    val name = "JinDol"
    var version = 8

    println("HI $name $version")

    val age: Int = 23
    val height: Double = 178.8
    val isStudent: Boolean = false


    println("Age: $age. Height: $height, student: $isStudent")

    var nickname:String? = null //? 안붙이면 안됨
    nickname = "JinDol"
    println("Nickname : $nickname ${nickname?.length}")



}

private fun week03Functions() {
    fun greet(name: String): String { //return type 알려줌
        return "Hello, $name!"
    }

    fun add(a: Int, b: Int) = a + b

    fun introduce(name: String, age: Int = 19){ //디폴트 매게변수 = 지정 안할시 19로
        println("My name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum: ${add(5, -71)}")
    introduce("Kim", 7)
    introduce("Park")
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}
