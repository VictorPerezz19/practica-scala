# Práctica 1: Entornos de Desarrollo para Scala

En este documento se detallan los pasos de instalación, configuración y ejecución de los tres entornos de desarrollo exigidos para trabajar con Scala 2.12.21 y Java JDK 17 sobre Windows 11.

---

## 1.1 Entorno 1 — JupyterLab + Almond Kernel + Scala 2.12.21

### 1. Instalación de requisitos previos
Para asegurar el correcto funcionamiento del entorno en Windows 11, se instalaron y configuraron las siguientes dependencias:
*   **Soporte para Rutas Largas (Long Paths):** Se habilitó esta opción en el Registro de Windows 11 para evitar errores (`OSError: [Errno 2] No such file or directory`) durante la instalación de paquetes con rutas extensas mediante `pip`.
*   **Java JDK 17:** Se instaló utilizando el gestor de paquetes de Windows mediante el comando `winget install EclipseAdoptium.Temurin.17.JDK`.
*   **Coursier (cs):** Se instaló el gestor de paquetes oficial de Scala para descargar el kernel correctamente.
*   **Python 3:** Base indispensable para la ejecución de JupyterLab.

![Requisitos previos 1](../images/jupyter-requisitos1.png)[cite: 1]
![Requisitos previos 2](../images/jupyter-requisitos2.png)[cite: 1]

### 2. Instalación y ejecución de JupyterLab
*   **Instalación:** Se utilizó `pip` ejecutando el comando `pip install jupyterlab` desde PowerShell.
*   **Ejecución:** Para levantar el servidor local, se ejecutó el comando `python -m jupyterlab`. El entorno se gestiona a través del navegador web accediendo a `http://localhost:8888/lab`.

![Instalación Jupyter](../images/jupyter-instalacion.png)[cite: 1]
![Ejecución Jupyter](../images/jupyter-inicio.png)[cite: 1]

### 3. Instalación de Almond Kernel
Para habilitar la compatibilidad con Scala, se instaló Almond especificando la versión requerida con el siguiente comando en PowerShell:
```bash
cs launch --fork almond --scala 2.12.21 -- --install
