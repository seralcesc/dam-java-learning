# DAM · Java Learning Log

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/IDE-Apache%20NetBeans%2031-1B6AC6?logo=apachenetbeans&logoColor=white)
![DAM](https://img.shields.io/badge/CFGS-DAM-8B00FF)
![Status](https://img.shields.io/badge/Status-En%20desarrollo-FF003C)
![GitHub](https://img.shields.io/badge/Git-GitHub-181717?logo=github&logoColor=white)

Repositorio de aprendizaje donde documento ejercicios, prácticas y ejemplos realizados durante el módulo profesional de **Programación** del Ciclo Formativo de Grado Superior de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

Incluye los primeros trabajos de **fundamentos de programación, diagramas de flujo y pseudocódigo**, así como los ejercicios posteriores desarrollados en **Java**. Su objetivo es conservar un registro ordenado de los contenidos trabajados y mostrar mi evolución como desarrollador.

---

## Objetivos

- Consolidar los fundamentos de programación y el razonamiento algorítmico.
- Aprender Java y avanzar progresivamente hacia la programación orientada a objetos.
- Aplicar los conceptos mediante relaciones de ejercicios y prácticas.
- Mejorar la organización, legibilidad y mantenibilidad del código.
- Conservar apuntes y ejemplos ejecutables como material de consulta.
- Documentar mi evolución durante el aprendizaje.
- Utilizar Git y GitHub como parte habitual del flujo de trabajo entre distintos equipos.

---

## Contenido del curso

El repositorio sigue la organización de la asignatura por **temas y módulos**. En los módulos de Java, las relaciones de ejercicios se agrupan en paquetes dentro de proyectos independientes de NetBeans.

### Tema 01 — Introducción a la programación

| Módulo | Material disponible |
|---|---|
| [01 — Fundamentos](Tema01_IntroduccionProgramacion/Mod01_Fundamentos/) | Documento de ejercicios en PDF. |
| [02 — Diagramas de flujo y condicionales](Tema01_IntroduccionProgramacion/Mod02_DiagramasCondicionales/) | Diagramas en imágenes, distribuidos en ejercicios y ejercicios complementarios. |
| [03 — Bucles y pseudocódigo](Tema01_IntroduccionProgramacion/Mod03_BuclesPseudocodigo/) | Diagramas, archivos de PSeInt, ejercicios complementarios en texto y una práctica de cálculo de nóminas. |

Los materiales de esta etapa se conservan en sus formatos originales: `.psc`, `.txt`, imágenes y documentos PDF.

### Tema 02 — Introducción a Java

| Proyecto | Contenido y organización |
|---|---|
| [Mod00_Apuntes](Tema02_IntroduccionJava/Mod00_Apuntes/src/apuntes/) | Ejemplos de variables, operadores, conversiones, entrada con `Scanner`, formato de salida, `Math`, aleatoriedad, cadenas y tratamiento básico de excepciones. |
| [Mod04_IntroduccionJavaCondicionales](Tema02_IntroduccionJava/Mod04_IntroduccionJavaCondicionales/src/ejercicios/) | 18 ejercicios de introducción a Java y condicionales, en el paquete `ejercicios`. |
| [Mod05_Bucles](Tema02_IntroduccionJava/Mod05_Bucles/src/) | Relación A y ejercicios complementarios para practicar bucles, razonamiento algorítmico y tratamiento de cadenas. |

**Mod00_Apuntes** es un proyecto de consulta que complementa los ejercicios de la asignatura.

En **Mod05_Bucles** se distinguen dos paquetes:

- [`relaciona`](Tema02_IntroduccionJava/Mod05_Bucles/src/relaciona/): ejercicios 01–14, con dos variantes del ejercicio 13 (`Ejer13a.java` y `Ejer13b.java`).
- [`complementarios`](Tema02_IntroduccionJava/Mod05_Bucles/src/complementarios/): ejercicios 01–16.

Se incorporarán nuevos temas y módulos conforme avance el curso.

---

## Estructura del repositorio

Estructura actual, con las carpetas principales y los archivos de proyecto más relevantes:

```text
dam-java-learning/
├── README.md
├── .gitignore
├── Tema01_IntroduccionProgramacion/
│   ├── Mod01_Fundamentos/
│   │   └── ejercicios.pdf
│   ├── Mod02_DiagramasCondicionales/
│   │   ├── ejercicios/
│   │   └── ejercicios-complementarios/
│   └── Mod03_BuclesPseudocodigo/
│       ├── ejercicios/
│       ├── ejercicios-complementarios/
│       └── ejer_nominas/
└── Tema02_IntroduccionJava/
    ├── Mod00_Apuntes/
    │   ├── nbproject/
    │   ├── src/
    │   │   └── apuntes/
    │   ├── build.xml
    │   └── manifest.mf
    ├── Mod04_IntroduccionJavaCondicionales/
    │   ├── nbproject/
    │   ├── src/
    │   │   └── ejercicios/
    │   ├── build.xml
    │   └── manifest.mf
    └── Mod05_Bucles/
        ├── nbproject/
        ├── src/
        │   ├── relaciona/
        │   └── complementarios/
        ├── build.xml
        └── manifest.mf
```

---

## Organización de los archivos Java

Cada proyecto conserva:

- **`src/`:** código fuente, organizado en paquetes.
- **`nbproject/`:** configuración compartible del proyecto de NetBeans.
- **`build.xml`:** archivo de construcción de Ant.
- **`manifest.mf`:** manifiesto del proyecto.

Los ejercicios utilizan clases individuales como `Ejer01.java`, con su propio método `main`. El nombre completo de la clase incluye el paquete: por ejemplo, `relaciona.Ejer01` y `complementarios.Ejer01` son clases diferentes aunque compartan nombre de archivo.

Los ejercicios incluyen cabeceras con su identificación y enunciado. Los ejemplos de `Mod00_Apuntes` reúnen explicaciones y demostraciones de consulta.

---

## Abrir y ejecutar los proyectos

1. Clonar el repositorio en el ordenador.
2. Abrir NetBeans y seleccionar **File → Open Project**.
3. Elegir la carpeta del proyecto que se desea trabajar: `Mod00_Apuntes`, `Mod04_IntroduccionJavaCondicionales` o `Mod05_Bucles`, dentro de `Tema02_IntroduccionJava`.
4. Comprobar que el proyecto tiene configurado el **JDK 21**.
5. Abrir una clase con método `main` y ejecutarla con **Run File** (`Shift + F6`).

Se abre la carpeta del proyecto concreto, que contiene `build.xml` y `nbproject/`. Cada ejercicio se puede ejecutar por separado, sin cambiar la clase principal del proyecto.

Los archivos `.psc` del primer tema se pueden abrir con PSeInt. Los diagramas y documentos se consultan con un visor compatible.

Las entregas al profesor se realizan con los archivos solicitados. Si se compilan clases Java fuera de NetBeans, debe respetarse su declaración `package` y la estructura de carpetas correspondiente.

---

## Entorno de desarrollo

- **Lenguaje:** Java 21.
- **IDE:** Apache NetBeans 31.
- **Sistema de construcción:** Ant.
- **Herramienta de pseudocódigo:** PSeInt.
- **Control de versiones:** Git.
- **Cliente de Git:** GitHub Desktop.
- **Repositorio remoto:** GitHub.
- **Equipos de trabajo:** Windows y Linux.

Los proyectos están configurados para compilar con Java 21. La instalación del JDK se configura en cada ordenador.

El repositorio conserva el código fuente, la documentación y los archivos compartibles de los proyectos. Los resultados de compilación (`build/`, `dist/`, `*.class`) y las preferencias locales de NetBeans (`nbproject/private/`) se excluyen mediante `.gitignore`.

---

## Flujo de trabajo entre equipos

El repositorio se clona una vez en cada ordenador. Después, los cambios se comparten a través de GitHub:

1. **Antes de empezar:** pulsar **Fetch origin** en GitHub Desktop y, si hay cambios remotos, **Pull origin**.
2. **Durante el trabajo:** editar y guardar los archivos en NetBeans.
3. **Al terminar:** revisar los cambios y crear un **commit** con un mensaje descriptivo.
4. **Antes de cambiar de equipo:** pulsar **Push origin** para enviar los commits a GitHub.

El commit registra los cambios localmente; el push permite recuperarlos desde el otro ordenador.

---

## Estado

🟢 **En desarrollo**

El repositorio recoge los ejercicios y materiales incorporados hasta el momento y se actualiza a medida que avanza la asignatura.

---

## Nota

Este repositorio tiene una **finalidad educativa**.

Los materiales reflejan distintas etapas del aprendizaje e incluyen ejercicios propios y ejemplos de consulta trabajados durante la formación. Las soluciones pueden revisarse y mejorar conforme se incorporen nuevos conocimientos; su presencia no implica que sean definitivas.

---

## Autor

**Sergio Alcántara**

Estudiante de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

[GitHub](https://github.com/seralcesc)
