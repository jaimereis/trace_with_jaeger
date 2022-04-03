# Java + Spring , Mysql e Jaeger
POC para demostrar a utilização do Jager para tracing distribuido 

# Start project java -jar 

1 - Ir ao diretório target e executar o comando via terminal: java -jar trace-0.0.1-SNAPSHOT.jar ou mvn spring-boot:run '-Dspring-boot.run.arguments=--server.port=8080'
<br>
2 - Via Postman importar a collection crud-trace.postman_collection.json

# Start project container docker-compose

1 - No diretório do projeto raiz executar o comando via terminal: docker-compose up -d <br>
2 - Resultado do comando:

![resultado do comando](https://user-images.githubusercontent.com/6663107/128943458-24c4f1ba-668c-484b-819b-66e275a501be.PNG)

3 - Via Postman importar a collection collection crud-trace.postman_collection.json


Acesse o Jaeger http://localhost:16686/search

![jaeger](https://user-images.githubusercontent.com/6663107/128943518-26987e0c-f1e6-4743-b3af-b172959a551a.PNG)








