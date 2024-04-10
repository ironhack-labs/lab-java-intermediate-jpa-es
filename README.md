
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Intermedio

## Introducción

Acabamos de aprender cómo usar JPQL y sentencias SQL nativas con Spring JPA para consultar una base de datos, así como cómo modelar la herencia de objetos y objetos de componente con JPA, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Modela las relaciones de un software de gestión de tareas utilizando Spring JPA. Supongamos que tienes los siguientes requisitos para el almacenamiento de datos:

  - Las tareas tienen un `title`, `dueDate` y un `status` booleano.
  - Hay 2 tipos de tareas: `BillableTask` y `InternalTask`.
  - Las `BillableTask` tienen un atributo adicional de `hourlyRate`.

2. Modela las relaciones de una compañía de relaciones públicas utilizando Spring JPA. Supongamos que tienes los siguientes requisitos para el almacenamiento de datos:

  - La base de datos consta de `Contacts`. Cada contacto tiene un `name`, un `title` y una `company`.
  - Los nombres son objetos propios y tienen un `firstName`, `lastName`, `middleName` y `salutation`.
  - Los nombres deben estar en la entidad `Contact` y no almacenarse en una tabla separada.

3. Lista 3 tareas que se pueden realizar con SQL nativo que no se pueden hacer con JPQL. Explique por qué elegiría usar SQL nativo en lugar de JPQL para estas tareas específicas.

<br>  

## FAQs (Preguntas frecuentes)

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">Estoy atascado y no sé cómo resolver el problema o por dónde empezar. ¿Qué debo hacer?</summary>  

 <br> <!-- ✅ -->  

Si estás atascado en tu código y no sabes cómo resolver el problema o por dónde empezar, debes dar un paso atrás y tratar de formular una pregunta clara y directa sobre el problema específico que enfrentas. El proceso que seguirás al tratar de definir esta pregunta te ayudará a limitar el problema y a encontrar soluciones potenciales.

Por ejemplo, ¿estás enfrentando un problema porque no entiendes el concepto o estás recibiendo un mensaje de error que no sabes cómo arreglar? Por lo general, es útil intentar formular el problema de la manera más clara posible, incluyendo cualquier mensaje de error que estés recibiendo. Esto puede ayudarte a comunicar el problema a otras personas y, potencialmente, a obtener ayuda de tus compañeros o recursos en línea.

Una vez que tengas una comprensión clara del problema, deberías poder comenzar a trabajar hacia la solución.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo creo un proyecto de Spring boot?</summary>  

 <br> <!-- ✅ -->  

Spring boot es un framework para crear aplicaciones autónomas y de calidad de producción que son fáciles de lanzar y ejecutar. La mejor manera de crear un proyecto de Spring boot es usar el sitio web Spring Initializer. El sitio web proporciona una manera conveniente de generar una estructura básica de proyecto con todas las dependencias y configuraciones necesarias.

- Paso 1: Ve a [start.spring.io](https://start.spring.io/)
- Paso 2: Elige el tipo de proyecto que desea crear, como Maven o Gradle.
- Paso 3: Selecciona la versión de Spring Boot que desea utilizar.
- Paso 4: Elige las dependencias que necesita para su proyecto. Algunas dependencias comunes incluyen web, jpa y data-jpa.
- Paso 5: Haz clic en el botón "Generar" para descargar los archivos del proyecto.

Como alternativa, puedes usar un Entorno de Desarrollo Integrado (IDE) como Eclipse o IntelliJ IDEA. Estos IDEs tienen complementos para crear proyectos de Spring boot, lo que facilita la configuración del entorno y el inicio de la codificación.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Qué es JPA y cómo puedo usarlo en Java?</summary>  

 <br> <!-- ✅ -->  

JPA significa Interfaz de Persistencia Java, que es una especificación Java para acceder, persistir y gestionar datos entre objetos Java y una base de datos relacional. JPA proporciona una interfaz estándar para acceder a bases de datos, reduciendo la necesidad de código personalizado de acceso a datos y permitiendo una gestión eficiente de las conexiones a la base de datos.

Para usar JPA en Java, necesitarás incluir las dependencias necesarias en su proyecto, como la implementación JPA de Hibernate y crear clases de entidades para representar sus datos. Estas clases de entidades serán anotadas con anotaciones específicas de JPA, como `@Entity` y `@Id`, para indicar la asignación entre la clase Java y la tabla de la base de datos.

Aquí hay un fragmento de código para mostrar cómo crear una clase de entidad JPA en Java:

  ```java
  @Entity
  public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String position;

    // Getters and Setters for the attributes
  }
  ```

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es el propósito de usar las anotaciones "@Entity", "@Table" y "@Column" en JPA (Java Persistence API)?</summary>  

 <br> <!-- ✅ -->  

Las anotaciones `@Entity`, `@Table` y `@Column` en JPA (Java Persistence API) se utilizan para mapear objetos Java a tablas de bases de datos relacionales.

`@Entity` se utiliza para marcar una clase como una entidad persistente. Esto significa que las instancias de la clase pueden almacenarse en una base de datos.

`@Table` se utiliza para definir el nombre de la tabla de base de datos a la que se asignará la entidad.

`@Column` se utiliza para definir las columnas en la tabla que corresponden a los atributos de la entidad.

Aquí hay un ejemplo de cómo usar estas anotaciones:

  ```java
  @Entity
  @Table(name="employee")
  public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    //getters and setters
  }
  ```

  En este ejemplo, la clase `Employee` se marca como una entidad persistente usando la anotación `@Entity`. El nombre de la tabla de base de datos se define usando la anotación `@Table` como "employee" (empleado). Los atributos `id`, `firstName` y `lastName` se mapean a columnas en la tabla "employee" (empleado) usando la anotación `@Column`.

</details>  

<br>

<details>  
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cuál es la diferencia entre las estrategias de herencia "JOINED", "TABLE_PER_CLASS" y "SINGLE_TABLE" en JPA y cuándo utilizarlas?</summary>  

 <br> <!-- ✅ -->  

La anotación `@Inheritance` en JPA se puede usar para especificar la estrategia de herencia para las entidades en JPA. Hay tres estrategias disponibles en JPA: `SINGLE_TABLE`, `JOINED` y `TABLE_PER_CLASS`. La estrategia de herencia se especifica utilizando el atributo de estrategia en la anotación `@Inheritance`.

Las estrategias de herencia en JPA determinan cómo se almacena los datos en la base de datos para las entidades que heredan de una entidad padre.

- **Estrategia JOINED**: crea tablas separadas para cada entidad concreta y se utiliza una unión entre ellas para recuperar los datos.

    ```java
    @Inheritance(strategy=InheritanceType.JOINED)
    @Entity
    public class Parent {
    // ...
    }
    ```

 - **Estrategia TABLE_PER_CLASS**: crea una tabla separada para cada entidad concreta e incluye todas las columnas de la entidad padre también.  
  
    ```java
    @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
    @Entity
    public class Parent {
    // ...
    }
    ```

- **Estrategia SINGLE_TABLE**: crea una única tabla para todas las entidades en la jerarquía, incluyendo una columna discriminadora para distinguir entre las entidades.

    ```java
    @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
    @Entity
    public class Parent {
    // ...
    }
    ```

  La elección de la estrategia de herencia depende de los requisitos de la aplicación, como la necesidad de normalización, el número de columnas en la tabla y el número de uniónes requeridas para recuperar los datos. Por ejemplo, si las entidades tienen muchas columnas y es importante la normalización, entonces la estrategia JOINED es apropiada. Si hay menos columnas, la estrategia TABLE_PER_CLASS puede ser más adecuada. La estrategia SINGLE_TABLE es la más simple y compacta pero puede resultar en un modelo de datos menos flexible.  

</details>  

<br>
  
<details>  
 <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">¿Cómo uso las anotaciones "@Embedded" y "@Embeddable" en Java con JPA?</summary>  

 <br> <!-- ✅ -->  

 Las anotaciones `@Embedded` y `@Embeddable` en JPA se utilizan para mapear un campo o clase incrustado en una entidad de JPA.  
 Estas anotaciones se utilizan para almacenar un conjunto de campos relacionados dentro de otra entidad de JPA. Esto permite al desarrollador almacenar datos complejos dentro de una sola entidad, en lugar de tener múltiples entidades para diferentes campos de datos.  
 La anotación `@Embeddable` se utiliza para anotar la clase incrustada, mientras que la anotación `@Embedded` se utiliza para anotar el campo dentro de la entidad de JPA que almacenará la clase incrustada.  
 
 Ejemplo:  
 
  ```java
  @Embeddable
  public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    // getters and setters
  }

  @Entity
  public class Employee {
    @Id
    private long id;
    private String name;
    @Embedded
    private Address address;
    // getters and setters
  }
  ```
 
JPA almacenará los datos en la clase incrustada como parte de la entidad propietaria en la base de datos. Al recuperar la entidad de la base de datos, los datos de la clase incrustada también se recuperarán y almacenarán como parte de la entidad.

En conclusión, las anotaciones `@Embedded` y `@Embeddable` en JPA permiten a los desarrolladores almacenar datos complejos dentro de una sola entidad de JPA, proporcionando una manera más organizada y eficiente de almacenar y recuperar datos de la base de datos.

</details>  

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">No puedo enviar cambios a mi repositorio. ¿Qué debo hacer?</summary>

  <!-- ✅ -->

  Si no puedes enviar cambios a tu repositorio, aquí hay algunos pasos que puedes seguir:

  1. Verifica tu conexión a internet: Asegúrate de que tu conexión a internet sea estable y funcione.
  2. Verifica la URL de tu repositorio: Asegúrate de estar usando la URL correcta de tu repositorio para enviar tus cambios.
  3. Revisa tus credenciales de Git: Asegúrate de que tus credenciales de Git estén actualizadas y correctas. Puedes revisar tus credenciales usando el siguiente comando:

  ```bash
  git config --list
  ```

  4. Actualiza tu repositorio local: Antes de enviar cambios, asegúrate de que tu repositorio local esté actualizado con el repositorio remoto. Puedes actualizar tu repositorio local usando el siguiente comando:

  ```bash
  git fetch origin
  ```

  5. Revisa posibles conflictos: Si hay conflictos entre tu repositorio local y el repositorio remoto, resuélvelos antes de enviar cambios.
  6. Envía cambios: Una vez que hayas resuelto los conflictos y actualizado tu repositorio local, puedes intentar enviar cambios nuevamente usando el siguiente comando:

  ```bash
  git push origin <branch_name>
  ```

</details>