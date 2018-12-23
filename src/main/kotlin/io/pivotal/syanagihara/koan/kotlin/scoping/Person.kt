package io.pivotal.syanagihara.koan.kotlin.scoping


 data class Person(
        var name: String,
        var age: Int
){
     private lateinit var hobby: String
     fun nameToUpperCase() {
         name = name.toUpperCase()
     }

     fun increaseAge() {
         age++
     }

     fun defineHobby(hobby: String) {
         this.hobby = hobby
     }

     fun displayHobby() = this.hobby
 }

