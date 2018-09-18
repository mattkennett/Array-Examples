package edu.ualr.mpkennett.arrayexamples

class Contact(val fname: String, val lname: String, val phoneNumbers: Array<String>, val primaryPhoneIndex: Int) {

    fun printMe(): String {
        return this.fname + " " + this.lname + " : " + this.phoneNumbers[primaryPhoneIndex]
    }
}