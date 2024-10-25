fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
	println(solarSystem.size) 
    println(solarSystem[2])
    println(solarSystem.get(3))
	
    for (planet in solarSystem) {
		println(planet)
    }
    
    println(solarSystem[3])
	println(solarSystem[9])

    println(solarSystem.contains("Pluto"))

    println("Future Moon" in solarSystem)

    
}