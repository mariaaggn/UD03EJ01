package com.example.ud03ej01.Ejercicio01

fun main(){
   var x = SerVivo(3)
   var y = SerVivo(5)

    x.mayor(y)
    x.equals(y)

    x = Humano("Homero",34)
    y = Humano("Bart",9)

    x.mayor(y)
    x.equals(y)
}