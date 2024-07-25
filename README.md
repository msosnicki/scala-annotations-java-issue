# Repo demostrating issue with annotations usage in java

The code in this repo compiles fine as it is currently. But if we comment out 

```
compileOrder := CompileOrder.ScalaThenJava
```

in `build.sbt`, it fails with the following error:

```
[error] -- Error: /home/ssn/code/scala/scala-annotations-java/src/main/java/scalac/issues/AnnotatedRecord.java:7:12
[error] 7 |  java.util.@jakarta.validation.Valid Optional<scalac.issues.@jakarta.validation.Valid UserId> userId) {};
[error]   |            ^^^^
[error]   |            identifier expected but @ found.
[error] -- Error: /home/ssn/code/scala/scala-annotations-java/src/main/java/scalac/issues/AnnotatedRecord.java:8:0
[error] 8 |
[error]   |^^^^^^
[error]   |identifier expected but eof found.
```
