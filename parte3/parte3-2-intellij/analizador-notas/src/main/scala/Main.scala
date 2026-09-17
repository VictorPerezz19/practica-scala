object Main extends App {

  // Datos iniciales
  val estudiantes = List("Ana", "Luis", "Marta", "Pedro", "Sofia")
  val notas = Array(8, 4, 10, 6, 3)

  // Función aprobado
  def aprobado(nota: Int): Boolean = {
    nota >= 5
  }

  //  Función estadoNota
  def estadoNota(nota: Int): String = {
    if (aprobado(nota)) "APROBADO"
    else "SUSPENSO"
  }

  // Función maxNota
  def maxNota(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  //Clasificación
  def clasificacion(nota: Int): String = {
    if (nota >= 9) "EXCELENTE"
    else if (nota >= 7) "NOTABLE"
    else if (nota >= 5) "APROBADO"
    else "SUSPENSO"
  }

  // 3.2.10 Listado de estudiantes
  println("Listado de estudiantes")
  var i = 0

  // Variables para stats
  var aprobados1 = 0
  var suspensos1 = 0
  var mejor1 = 0

  // Bucle para recorrer la primera evaluación y calcular estadísticas a la vez
  while (i < notas.length) {
    val est = estudiantes(i)
    val n = notas(i)

    // Impresión del listado de estudiantes
    println(est + " -> " + n + " -> " + estadoNota(n))

    // Cálculos para las stats
    if (aprobado(n)) {
      aprobados1 += 1
    } else {
      suspensos1 += 1
    }
    mejor1 = maxNota(mejor1, n)

    i += 1
  }

  // Estadísticas
  println("\nResumen del grupo")
  println("Estudiantes: " + estudiantes.length)
  println("Aprobados: " + aprobados1)
  println("Suspensos: " + suspensos1)
  println("Mejor nota: " + mejor1)

  // Clasificación adicional
  println("\n Clasificación")
  var j = 0
  while (j < notas.length) {
    println(estudiantes(j) + " -> " + notas(j) + " -> " + clasificacion(notas(j)))
    j += 1
  }

  //Segunda evaluación
  val notasSegundaEvaluacion = Array(9, 5, 8, 7, 6)

  println("\n Segunda evaluación")
  var k = 0
  var aprobados2 = 0
  var suspensos2 = 0
  var mejor2 = 0

  while (k < notasSegundaEvaluacion.length) {
    val est = estudiantes(k)
    val n2 = notasSegundaEvaluacion(k)

    // Muestro la segunda evaluación
    println(est + " -> " + n2 + " -> " + estadoNota(n2))

    if (aprobado(n2)) {
      aprobados2 += 1
    } else {
      suspensos2 += 1
    }
    mejor2 = maxNota(mejor2, n2)
    k += 1
  }

  // Comparación de evaluaciones
  println("\n Comparación de evaluaciones")
  println("Mejor nota de la primera evaluación: " + mejor1)
  println("Mejor nota de la segunda evaluación: " + mejor2)
  println("Número de aprobados de la primera: " + aprobados1)
  println("Número de aprobados de la segunda: " + aprobados2)

  // Condicional para decidir la mejoría
  if (aprobados2 > aprobados1) {
    println("Resultado: Ha mejorado.")
  } else if (aprobados2 < aprobados1) {
    println("Resultado: Ha empeorado.")
  } else {
    println("Resultado: Se ha mantenido igual.")
  }

  // Uso de listas
  println("\nUso de listas")
  val nuevosEstudiantes = "Carlos" :: estudiantes

  println("Lista original: " + estudiantes)
  println("Lista nueva: " + nuevosEstudiantes)
}