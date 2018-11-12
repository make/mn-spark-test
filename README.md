# mn-spark-test
Reproduces the issue https://github.com/micronaut-projects/micronaut-core/issues/892 with Micronaut + Apache Spark

Steps to reproduce the issue:
```
gradle run
curl http://localhost:8080/any
```
