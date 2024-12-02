# DescansoRecordatorio - Aplicación de Aviso para Tomar Descansos
Esta aplicación en Java está diseñada para recordarte que tomes descansos a intervalos específicos. Puedes configurar el tiempo entre los avisos, la duración de cada descanso y la cantidad de avisos. Los avisos aparecerán como ventanas emergentes que te informarán sobre el tiempo de descanso configurado.

## Requisitos
- **Java 8 o superior instalado en tu sistema.**
- **Sistema operativo Windows para la creación de un acceso directo en la carpeta de inicio.**
## Instrucciones de uso
- **Compilar la aplicación**
- **Asegúrate de tener Java correctamente instalado y compilada la clase. Puedes compilarla desde la terminal con:**

Crear el archivo JAR
```bash
javac Principal.java
```

Una vez compilado, crea un archivo JAR para ejecutar la aplicación:
```bash
jar cfe DescansoRecordatorio.jar Principal Principal.class
```
Ejecutar la aplicación
Para ejecutar la aplicación, usa el siguiente comando en la terminal:

```bash
java -jar DescansoRecordatorio.jar <minutosEntreAvisos> <duracionDescanso> <cantidadDeAvisos>
```
## Intrucciones de funcionamiento:
minutosEntreAvisos: Tiempo en minutos entre cada aviso (por defecto 1).>
duracionDescanso: Duración del descanso en minutos (por defecto 1).>
cantidadDeAvisos: Número total de avisos a mostrar (por defecto 3).>

### Si no se proporcionan argumentos, los valores predeterminados serán:
minutosEntreAvisos: 1 minuto.
duracionDescanso: 1 minuto.
cantidadDeAvisos: 3 avisos.

Crear acceso directo en la carpeta de inicio de Windows
Para que la aplicación se ejecute automáticamente al iniciar el sistema, sigue estos pasos:

- **Paso 1: Ubica el archivo DescansoRecordatorio.jar en una carpeta accesible.**
- **Paso 2: Crea un acceso directo en la carpeta de inicio de Windows. Abre Explorador de archivos, y escribe shell:startup en la barra de direcciones para abrir la carpeta de inicio.**
- **Paso 3: Crea un acceso directo del archivo .jar en esa carpeta, utilizando el siguiente comando en la propiedad del acceso directo:**
  
```bash
java -jar C:\ruta\a\DescansoRecordatorio.jar <minutosEntreAvisos> <duracionDescanso> <cantidadDeAvisos>
```
**Sustituye C:\ruta\a\DescansoRecordatorio.jar con la ruta donde guardaste el archivo JAR y ajusta los valores de los parámetros según desees.**

### Explicación del Código
**Principal.java**
Este es el punto de entrada de la aplicación. El programa toma tres parámetros de la línea de comandos:

- ** minutosEntreAvisos: Intervalo de tiempo entre cada aviso de descanso.
- ** duracionDescanso: Duración del descanso en minutos.
- ** cantidadDeAvisos: Número de veces que se mostrará el aviso.
El programa ejecuta un ciclo que muestra el aviso cada vez que transcurre el tiempo especificado.

**AvisoDescanso.java**
Esta clase implementa la interfaz Runnable y crea una ventana emergente cada vez que es ejecutada, mostrando el tiempo restante del descanso.

**VentanaMostrarMensaje.java**
Esta clase es responsable de crear la ventana emergente con el mensaje informando el tiempo de descanso.
