package com.example.ud03ej01.Ejercicio01

open class SerVivo (var edad :Byte) {
    fun equals (other : SerVivo): Boolean {
        if (this.edad == other.edad) {
            println("Son iguales")
            return true
        }else{
            println("No son iguales")
            return false
        }
    }

    fun mayor(other: SerVivo): SerVivo{
        if(other.edad> this.edad){
            println("El mayor --> ${other.toString()}")
            return other
        }else{
            println("El mayor --> ${this.toString()}")
            return this
        }
    }

    override fun toString(): String {
        return "Edad : " + "$edad"
    }
}