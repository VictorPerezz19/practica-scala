# Práctica 1: Entornos de Desarrollo para Scala

En este documento se detallan los pasos de instalación, configuración y ejecución de los tres entornos de desarrollo exigidos para trabajar con Scala 2.12.21 y Java JDK 17 sobre Windows 11.

---

## 1.1 Entorno 1 — JupyterLab + Almond Kernel + Scala 2.12.21

### 1. Instalación de requisitos previos
Para asegurar el correcto funcionamiento del entorno en Windows 11, se instalaron y configuraron las siguientes dependencias:
*   **Java JDK 17:** Se instaló la versión requerida para soportar las herramientas de construcción.
*   **Coursier y Python:** Herramientas base para la descarga de dependencias y ejecución del servidor.

![Requisitos previos JDK 17](images/descargaJava17.png)
![Requisitos previos Scala](images/descarga%20de%20scala.png)

### 2. Instalación y ejecución de JupyterLab
Se procedió a la instalación mediante el gestor de paquetes de Python y se arrancó el servidor web local.

![Instalación Jupyter](images/descargaJupyterLab.png)
![Ejecución Jupyter](images/interfazJupyterLab.png)

### 3. Instalación de Almond Kernel
Para habilitar la compatibilidad con Scala, se instaló Almond especificando la versión requerida. Una vez completado, la opción aparece en el menú de inicio (Launcher) de JupyterLab.

![Almond Kernel instalado](images/descarga%20Almond%20Kernel.png)
![Interfaz Jupyter con Scala](images/interfaz%20JupyterLab%20con%20Scala.png)

### 4. Verificación y ejecución de código
Se creó un nuevo Notebook bajo el kernel de Scala. Se verificó la versión en uso y se comprobaron las funcionalidades interactivas evaluando variables, operaciones y listas con éxito.

![Versión de Scala](images/verificar%20version%20Scala.png)
![Ejecución de código](images/codigo%20Scala.png)

---

## 1.2 Entorno 2 — Visual Studio Code + Metals + Scala 2.12.21 + JDK 17 + sbt

### 1. Verificación del JDK 17 y sbt
Se comprobó la correcta instalación del JDK 17 y de la herramienta de construcción sbt en la terminal.

![Versiones de Java y sbt](images/version%20de%20Java%20y%20sbt.png)

### 2. Configuración de Visual Studio Code y Metals
Se instaló la extensión oficial de Scala (Metals) desde el marketplace para añadir soporte completo para el lenguaje.

![Extensión Metals](images/extension%20Scala.png)

### 3. Creación y configuración del proyecto
Se creó el directorio del proyecto con la estructura estándar y se configuró el archivo `build.sbt`. Al detectarlo, Metals reconoció automáticamente el proyecto.

![Estructura VS Code 1](images/visual%20studio%20Scala1.png)
![Estructura VS Code 2](images/visual%20studio%20Scala2.png)

### 4. Compilación y Ejecución
Se compiló el código fuente y se ejecutó mediante las herramientas integradas, verificando la salida esperada.

![Compilación con sbt en VS Code](images/sbt%20compile%20de%20Scala%20en%20visual.png)
![Ejecución con sbt en VS Code](images/sbt%20run%20de%20Scala%20en%20visual.png)

---

## 1.3 Entorno 3 — IntelliJ IDEA Community + Scala 2.12.21 + sbt

### 1. Instalación y Configuración del IDE
Se instaló IntelliJ IDEA Community Edition junto con el plugin oficial de Scala, y se configuró el proyecto para utilizar el JDK 17.

![IntelliJ Instalado](images/interfaz%20IntelliJ.png)
![Plugin de Scala](images/Extension%20Scala%20IntelliJ.png)
![Configuración JDK 17](images/creacion%20proyecto%20intelliJ%20java17.png)

### 2. Creación del proyecto sbt y Código
Se generó el proyecto sbt configurado para la versión 2.12.21 de Scala y se desarrolló el archivo principal.

![Código Main en IntelliJ](images/codigo%20compile%20intelliJ.png)

### 3. Compilación y Ejecución
El código se compiló y ejecutó directamente desde el terminal integrado utilizando los comandos de sbt.

![SBT Compile IntelliJ](images/sbt%20compile.png)
![SBT Run IntelliJ](images/sbt%20run.png)
