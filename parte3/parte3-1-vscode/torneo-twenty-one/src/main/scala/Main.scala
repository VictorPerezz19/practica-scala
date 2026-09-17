object Main extends App {

  //Datos iniciales
val jugadores = List(
  "Alex",
  "Chen",
  "Marta",
  "Sindhu",
  "Luis"
)

val puntuaciones = Array(
  18,
  24,
  21,
  20,
  26
)
  //Función bust
  def bust(puntuacion: Int): Boolean = {
    puntuacion > 21
  }

  //Función estadoMano
  def estadoMano(puntuacion: Int): String = {
    if (bust(puntuacion)) "BUST"
    else "VALIDA"
  }

  //Función mejorMano
  def mejorMano(handA: Int, handB: Int): Int = {
    if (handA > 21 && handB > 21) 0
    else if (handA > 21) handB
    else if (handB > 21) handA
    else if (handA > handB) handA
    else handB
  }

  // Procesamiento y estadísticas de la primera ronda
 println(" Resumen de la ronda 1")
  var i = 0
  var validas1 = 0
  var pasados1 = 0
  var mejor1 = 0

  while (i < puntuaciones.length) {
    val p = puntuaciones(i)
    val j = jugadores(i)
    
    println(j + " -> " + p + " -> " + estadoMano(p))

    if (bust(p)) {
      pasados1 += 1
    } else {
      validas1 += 1
      mejor1 = mejorMano(mejor1, p)
    }
    i += 1
  }
  
  println("\nJugadores: " + jugadores.length)
  println("Manos válidas: " + validas1)
  println("Bust: " + pasados1)
  println("Mejor puntuación válida: " + mejor1 + "\n")

  // Segunda ronda
  val puntuacionesRonda2 = Array(22, 19, 20, 21, 17)
  
  println(" Resumen de la ronda 2 ")
  var k = 0
  var validas2 = 0
  var pasados2 = 0
  var mejor2 = 0

  while (k < puntuacionesRonda2.length) {
    val p = puntuacionesRonda2(k)
    val j = jugadores(k)
    
    println(j + " -> " + p + " -> " + estadoMano(p))

    if (bust(p)) {
      pasados2 += 1
    } else {
      validas2 += 1
      mejor2 = mejorMano(mejor2, p)
    }
    k += 1
  }
  
  println("\nJugadores: " + jugadores.length)
  println("Manos válidas: " + validas2)
  println("Bust: " + pasados2)
  println("Mejor puntuación válida: " + mejor2 + "\n")

  //Comparación de rondas
  println("--- Comparación de rondas ---")
  println(s"Mejor puntuación primera ronda: $mejor1")
  println(s"Mejor puntuación segunda ronda: $mejor2")
  
  if (mejor1 > mejor2) {
    println("La primera ronda tuvo la mejor puntuación.")
  } else if (mejor2 > mejor1) {
    println("La segunda ronda tuvo la mejor puntuación.")
  } else {
    println("Ambas rondas tuvieron la misma mejor puntuación.")
  }

  //Uso de foreach
  println("\n Procesamiento con foreach (Ronda 1) ")
  puntuaciones.foreach { p =>
    println("Puntuación: " + p + " -> Estado: " + estadoMano(p))
  }
}