# Documentación
### Variables

Las variables en Kotlin, son elementos fundamentales para poder almacenar y manipular los datos. Una variable se define utilizando la palabra clave "var" o "val", seguida del nombre de la variable y opcionalmente su tipo de dato y valor inicial.

La descripción de cada componente clave:
                
###### Var y Val
- Var: Se usa para declarar una variable mutable, es decir, que su valor puede cambiar despues de la inicialización
```
var edad: Int = 30
edad = 31
```

- Val: Se usa para declarar una variable inmutable, es decir, que su valor no puede cambiar despues de la inicialización
```
val nombre: String = "Juan"
```

###### Nombre de la variable

- Es el identificador  que se utiliza para referirse a la variable en el codigo. Se debe seguir las reglas de nomenclatura de Kotlin, que son similares a las de otros lenguajes como Java

###### Tipos de datos (opcional)

- Puede especificar el tipo de datos que va almacenar la variable, por ejemplo "Int", "String", "Boolean", etc.

###### Valor inicial (opcional)
- Puede inicializar una variable con un valor cuando la declara. Este valor debe ser del mismo tipo que la variable o compatible con el

### Constantes

Las constantes se definen utilizando la palabra clave "val". Una constante es similar a una variable inmutable en terminos de que su valor no puede cambiar una vez que ha sido asignado inicialmente.
```
val PI = 3.14159
val nombre = "María"
```

###### Declaración con "val"
- Se utiliza la palabra clave "val" seguida del nombre de la constante para declararla.
###### Inmutabilidad 
- Una vez que se asigna ujn valor a una constante utilizando "val", no se puede cambiar su valor. Intentar reasignarle un valor resultara en un error en tiempo de compilación.
###### Incialización
- Debes asignar un valor inicial a una constante al momento de su declaración. Este valor inicial puede ser calculado o literal, pero debe ser del mismo tipo que el tipo de datos de la constante, o compatible con el.

### Manejo de nulos
Manejo de nulos o tambien conocido manejo de valores nulos o nullable handling en inglés, se refiere a las tecnicas y practicas utilizadas para manejar valores que pueden ser nulos en un programa de manera segura y efectiva. En Kotlin, el manejo de nulos se aborda principalmente a través de dos enfoques clave:

###### Tipos Nullable 
- En Kotlin, todos los tipos de datos no son nulos por defecto. Sin embargo, puedes declarar un tipo de datos como nullable añadiendo un "?" al final del tipo (tipo?). Por ejemplo, "String?" es un tipo que puede contener una cadena o ser "null".

###### Acceso seguro (Safe Calls)
- Cuando trabajas con tipos nullable, Kotlin proporciona una sintaxis segura para acceder a sus propiedades o llamar métodos. Por ejemplo:

``` val cadena: String? = null
val longitud: Int? = cadena?.length 
```

###### Operador Elvis ("Elvis Operator")
- Este operador ("?"),  se usa para proporcionar un valor predeterminado en caso de que una expresión nullable sea null:

```
val longitudNoNull: Int = cadena?.length ?: -1 // Si 'cadena' es null, se asigna -1 a 'longitudNoNull'
```

###### Chequeo de nulos (Null Checks)
- A veces, es necesario realizar comprobaciones explícitas para manejar casos donde un valor podría ser null. Kotlin proporciona formas de realizar estas verificaciones de manera segura, como el uso de "if" o "when" junto con operaciones seguras.
###### Lanzamiento de Excepciones (Null Safety Exceptions)
- Kotlin tiene reglas estrictas de nullabilidad que ayudan a evitar errores de NullPointerException (NPE). Si intentas acceder a un valor nullable sin manejar su posible nullabilidad, Kotlin te obliga a abordar explícitamente este caso para garantizar un código más seguro.

###### Funciones de Extensión Nullable:
- Kotlin permite definir funciones de extensión que pueden ser llamadas directamente en tipos nullable, facilitando la creación de métodos que manejan la posible nulidad de manera eficiente y clara.

A continuación un codigo haciendo uno de los terminos anteriores.

    
    class Constants {
        companion object {
            const val VERSION_CODE = 1.2
        }
    }

    var userAge: Int? = 25
    
    fun greetUser(userName: String, greetingMessage: String = "Hola") {
        println("$greetingMessage $userName")
    }
    
    fun main() {
        val itemCount: Int = 5
        println("El número de elementos es: $itemCount")
    
        var userFirstName: String = "Ana"
        userFirstName = "Elena"
        println("El nombre del usuario es: $userFirstName")
    
        println("La versión actual del software es: ${Constants.VERSION_CODE}")
    
        greetUser("Karol")
        greetUser("Laura", "Hi")
        greetUser("Mary")
    
        if (userAge != null) {
            println("La edad del usuario es $userAge años")
        } else {
            println("La edad del usuario no está definida")
        }
    }
    

Explicación un poco mas detallada del codigo:

```
class Constants {
    companion object {
        const val VERSION_CODE = 1.2
    }
}

```
<p>
Se define una clase Constants que contiene un objeto compañero (companion object). Dentro del objeto compañero, se declara una constante "VERSION_CODE" con el valor "1.2." Esta constante es accesible utilizando "Constants.VERSION_CODE" desde cualquier parte del código.
</p>

```
var userAge: Int? = 25
```

<p>
Se declara una variable "userAge" como nullable ("Int?") con un valor inicial de "25". Esto significa que "userAge" puede contener un valor entero o ser "null".
</p>

```
fun greetUser(userName: String, greetingMessage: String = "Hola") {
    println("$greetingMessage $userName")
}
```

<p>
Se define una función "greetUser" que toma dos parámetros: "userName" de tipo "String" y "greetingMessage" de tipo "String" con un valor por defecto de "Hola". La función imprime un mensaje de saludo utilizando los parámetros proporcionados.
</p>

```
fun main() {
    val itemCount: Int = 5
    println("El número de elementos es: $itemCount")
```

<p>
La función "main" es la función de entrada del programa. Se declara una variable inmutable "itemCount" de tipo "Int" con un valor de "5", y luego se imprime un mensaje que incluye el valor de "itemCount".
</p>

```
    var userFirstName: String = "Ana"
    userFirstName = "Elena"
    println("El nombre del usuario es: $userFirstName")
```

<p>
Se declara una variable mutable 
"userFirstName" de tipo "String" con un valor inicial de "Ana". Luego se cambia el valor de "userFirstName" a "Elena" y se imprime el nombre actualizado del usuario.
</p>

```
    println("La versión actual del software es: ${Constants.VERSION_CODE}")
```

<p>
Se imprime la versión actual del software accediendo a la constante "VERSION_CODE" dentro de la clase "Constants" mediante la sintaxis "${Constants.VERSION_CODE}".
</p>

```
    greetUser("Karol")
    greetUser("Laura", "Hi")
    greetUser("Mary")
```

<p>
Se llama a la función "greetUser" varias veces con diferentes combinaciones de parámetros para demostrar su flexibilidad y capacidad de aceptar valores predeterminados.
</p>

```
    if (userAge != null) {
        println("La edad del usuario es $userAge años")
    } else {
        println("La edad del usuario no está definida")
    }
}
```
<p>
Se utiliza una estructura condicional (if) para verificar si "userAge" no es nulo ("userAge != null"). Si es así, se imprime la edad del usuario. De lo contrario, se imprime un mensaje indicando que la edad no está definida.
</p>

Para finalizar, este codigo Kotlin muestra varios conceptos clave como la declaración de clases y objetos compañeros, el manejo de variables mutables e inmutables, funciones con parametros opcionales y nulos, acceso a constantes y anejo seguro de valores nulos con la sintaxis especifica de Kotlin.
