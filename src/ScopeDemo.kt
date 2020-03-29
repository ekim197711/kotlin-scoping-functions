package com.example



fun main(args: Array<String>){
    val ship = SpaceShip().apply {
        name = "Eagle"
        fuel = 88
    }


    val captain1 = Captain("Mike")
    val ship2 = SpaceShip("Hawk", 55).also {
        captain1.latestship = it.name
    }
    println("ship2: $ship2")

    val lengthofshipname = with(ship2){
        ship2.name.length
    }
    println("with return value $lengthofshipname")

    val result = ship2.run {
        println("stuff... blalalalal fuel $fuel")
        true
    }
    println("from run: $result")


    val ship3 = SpaceShip("BrandNEW1", 99)
    val captain = ship3?.let{
        Captain("Mike", it.name)
    }
    println("Captain from ship3 $captain")
}