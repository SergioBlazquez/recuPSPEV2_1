package com.example.demo


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)

}

@RestController
class RestControler{



	@GetMapping("/suma/{n1}/{n2}")
	/*fun sumaNumeros(@PathVariable n1 : Int, @PathVariable n2 : Int) : Int {
		LoadDatabase.logger.info("Sumando... $n1, $n2")
		return n1 + n2
	}*/
	fun sumaNumeros(@PathVariable nombre : String, @PathVariable contrasena: String) : String {
		//LoadDatabase.logger.info("Sumando... $n1, $n2")
		return  ("Nombre: "+getNombre()+" Contrasena: "+getContrasena())
	}

	fun getNombre():String{

		return "Juan"
	}

	fun getContrasena(): String{

		return (getNombre()+"123")
	}
}


data class Persona(var nombre: String, var contrasena: String)