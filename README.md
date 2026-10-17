# DAM · Java Learning Log

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/IDE-Apache%20NetBeans%2031-1B6AC6?logo=apachenetbeans&logoColor=white)
![DAM](https://img.shields.io/badge/CFGS-DAM-8B00FF)
![Status](https://img.shields.io/badge/Status-En%20desarrollo-FF003C)
![GitHub](https://img.shields.io/badge/Git-GitHub-181717?logo=github&logoColor=white)

Repositorio de aprendizaje donde documento ejercicios, prácticas y pequeños proyectos realizados durante el módulo profesional de **Programación** del Ciclo Formativo de Grado Superior de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

Incluye los primeros trabajos de **fundamentos de programación, diagramas de flujo y pseudocódigo**, así como los ejercicios posteriores desarrollados en **Java**. Su objetivo es conservar un registro ordenado de los contenidos trabajados y mostrar mi evolución como desarrollador.

---

## Objetivos

- Consolidar los fundamentos de programación y el razonamiento algorítmico.
- Aprender Java y avanzar progresivamente hacia la programación orientada a objetos.
- Aplicar los conceptos mediante relaciones de ejercicios y prácticas.
- Mejorar la organización, legibilidad y mantenibilidad del código.
- Documentar mi evolución durante el aprendizaje.
- Utilizar Git y GitHub como parte habitual del flujo de trabajo entre distintos equipos.

---

## Contenido del curso

El repositorio sigue la estructura de la asignatura: **temas → módulos → relaciones de ejercicios**. Los temas pueden agrupar varios módulos.

### Tema 01 — Introducción a la programación

- **Módulo 1:** Fundamentos de la programación.
- **Módulo 2:** Diagramas de flujo y condicionales.
- **Módulo 3:** Bucles y pseudocódigo.

En estos módulos se conservan, según corresponda, archivos de PSeInt (`.psc`), diagramas, imágenes y documentación asociada a los ejercicios.

### Tema 02 — Introducción a Java

- **Módulo 4:** Introducción a Java y condicionales.
- **Módulo 5:** Bucles.

Cada módulo de Java se organiza como un **proyecto independiente de Apache NetBeans**. Las relaciones de ejercicios se agrupan en paquetes Java y cada ejercicio tiene su archivo `.java`.

<!--
TEMAS FUTUROS — BORRADOR NO PUBLICADO
Descomentar, renombrar y completar solo cuando el profesor confirme los temas y módulos.

### Tema 03 — [Nombre pendiente]
- **Módulo [número]:** [Contenido pendiente].

### Tema 04 — [Nombre pendiente]
- **Módulo [número]:** [Contenido pendiente].

Contenidos orientativos por ubicar, si se trabajan durante el curso:
arrays, métodos, programación orientada a objetos, herencia, interfaces,
colecciones, excepciones y ficheros.
-->

---

## Estructura del repositorio

Estructura prevista una vez reorganizados los materiales existentes y creados los proyectos Java:

```text
dam-java-learning/
├── README.md
├── .gitignore
├── Tema01_IntroduccionProgramacion/
│   ├── Mod01_Fundamentos/
│   ├── Mod02_DiagramasCondicionales/
│   └── Mod03_BuclesPseudocodigo/
└── Tema02_IntroduccionJava/
    ├── Mod04/
    │   ├── nbproject/
    │   ├── src/
    │   │   ├── relaciona/
    │   │   │   ├── Ejercicio01.java
    │   │   │   └── Ejercicio02.java
    │   │   └── relacionb/
    │   │       └── Ejercicio01.java
    │   └── build.xml
    └── Mod05/
        ├── nbproject/
        ├── src/
        │   └── relaciona/
        │       └── Ejercicio01.java
        └── build.xml
```

*Los nombres de las relaciones y ejercicios mostrados son ejemplos; se crearán conforme avance el curso.*

## Organización de los ejercicios Java

- **Tema:** carpeta que agrupa varios módulos del programa de la asignatura.
- **Módulo:** proyecto NetBeans independiente, con sus archivos de configuración y construcción.
- **Relación:** paquete Java (`relaciona`, `relacionb`, `relacionc`...).
- **Ejercicio:** clase `.java` individual, con su propio método `main` cuando corresponda.

Los archivos Java incluyen una cabecera con el autor, la relación, el número de ejercicio y su enunciado. Los proyectos se pueden abrir en NetBeans, y cada clase ejecutable puede lanzarse por separado mediante **Run File** (`Shift + F6`).

Las entregas al profesor se realizan con los archivos `.java` solicitados; si se requiere compilarlos individualmente fuera del proyecto, debe tenerse en cuenta la declaración `package`.

---

## Entorno de desarrollo

- **Lenguaje:** Java 21.
- **IDE:** Apache NetBeans 31.
- **Sistema de construcción:** Ant para los proyectos Java de la asignatura.
- **Control de versiones:** Git.
- **Repositorio remoto:** GitHub.
- **Equipos de trabajo:** Windows y Linux.

El repositorio conserva el código fuente, la documentación y los archivos compartibles del proyecto. Los resultados de compilación y las preferencias locales del IDE se excluyen mediante `.gitignore`.

### Flujo de trabajo

Antes de empezar en un equipo, recuperar los últimos cambios (`git pull`). Al terminar, revisar los archivos, registrar los cambios (`git add` y `git commit`) y enviarlos a GitHub (`git push`).

---

## Estado

🟢 **En desarrollo**

El repositorio se actualizará a medida que se publiquen nuevos temas y se completen ejercicios y prácticas.

---

## Nota

Este repositorio tiene una **finalidad educativa**. Los primeros ejercicios pueden utilizar soluciones sencillas que evolucionarán hacia estructuras más organizadas y proyectos de mayor complejidad.

Los materiales conservados reflejan diferentes etapas del proceso de aprendizaje; su presencia no implica que todos los módulos estén completados.

---

## Autor

**Sergio Alcántara**

Estudiante de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

[GitHub](https://github.com/seralcesc)
