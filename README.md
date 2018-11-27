### Intro

This directory contains three java project:

* DYDI: Do-it-Yourself Dependency injection

* CDI: Contexts and Dependency Injection

* Dagger2: A fast and lightweight dependency injection framework, this framework is available for both Java and Android

### Tutorial link

* DYDI & CDI

https://www.baeldung.com/java-ee-cdi

* Dagger2

https://www.baeldung.com/dagger-2

https://dzone.com/articles/dagger-2-tutorial-dependency-injection-made-easy

https://google.github.io/dagger/users-guide

### How to build and run

* run DYDI

Use the following mainClassName in `build.gradle`.

```groovy
mainClassName = 'DYDI.Main'
```

using `./gradlew run` to run.

* run CDI.Inject

Use the following mainClassName in `build.gradle`.(simply remove '//' before the corresponding code)

```groovy
mainClassName = 'CDI.Inject.Main'
```

using `./gradlew run` to run.

* run CDI.Produces

Use the following mainClassName in `build.gradle`.(simply remove '//' before the corresponding code)

```groovy
mainClassName = 'CDI.Produces.Main'
```

using `./gradlew run` to run.

* run Dagger2

Use the following mainClassName in `build.gradle`.

```groovy
mainClassName = 'Dagger2.Main'
```

using `./gradlew run` to run.
