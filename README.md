# Anagrama

API Rest criada como parte do processo seletivo da MV. 

A API tem como objetivo verificar se duas palavras são anagramas. Duas palavras são consideradas anagramas se contiverem as mesmas letras, mas em ordens diferentes. 

A API deve retornar um booleano true se as duas palavras forem anagramas e false caso contrário.

## Rodando a aplicação

A API pode ser acessada localmente em `localhost:8080`.

## Swagger

Para consultar as rotas e os modelos das entidades, basta navegar até o endereço:

    http://localhost:8080/swagger-ui/index.html

## Exemplo

### Caso 1

Parâmetros

1. word1 = iracema
2. word2 = america

GET

    http://localhost:8080/api/anagramas/check?word1=iracema&word2=america

Resultado:

	true
	
### Caso 2

Parâmetros

1. word1 = iracema
2. word2 = brasil

GET

    http://localhost:8080/api/anagramas/check?word1=iracema&word2=brasil

Resultado:

	false


## Build

A aplicação pode ser construída com o seguinte comando:

```
mvnw clean package
```

Inicie a aplicação com o seguinte comando - aqui com o perfil `production`:

```
java -Dspring.profiles.active=production -jar ./target/anagrama-0.0.1-SNAPSHOT.jar
```


