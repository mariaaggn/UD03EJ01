package com.example.ud03ej01.Ejercicio01

class Humano(var nombre: String, edad: Byte) : SerVivo(edad) {
    fun equals(other: Humano): Boolean {
        if (this.nombre == other.nombre && this.edad == other.edad) {
            println("Son iguales")
            return true
        } else {
            println("No son iguales")
            return false
        }
    }

    fun mayor(other: Humano): Humano{
        var mayor = this
        if(this.edad>other.edad){
            println("El mayor --> ${this.toString()}")
            return mayor
        }else if(this.edad==other.edad){
            if(this.nombre.length > other.nombre.length){
                println("El mayor --> ${this.toString()}")
                return mayor
            }else{
                println("El mayor --> ${other.toString()}")
                mayor=other
                return mayor
            }
        }else{
            println("El mayor --> ${other.toString()}")
            mayor=other
            return mayor
        }
    }

    override fun toString(): String {
        return " ${super.toString()}  Nombre :$nombre "
    }
}