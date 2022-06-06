Описание:
---
Cервис, который обращается к сервису курсов валют, и отдает gif в ответ:
если курс по отношению к рублю за сегодня стал выше вчерашнего,  
то отдаем рандомную отсюда https://giphy.com/search/rich  
если ниже - отсюда https://giphy.com/search/broke  
Ссылки  
REST API курсов валют - https://docs.openexchangerates.org/  
REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide  
(Api Key и Api Id указаны в файле application.properties).
Сервис написан Spring Boot 2 + Java. 
Запросы приходят на HTTP endpoint, туда передается код валюты.  
Для взаимодействия с внешними сервисами используется Feign.  
Все параметры (валюта по отношению к которой смотрится курс,   
адреса внешних сервисов и т.д.) вынесены в настройки.  
На сервис написаны тесты. Для сборки используется Gradle.

Запуск .jar файла:
---
```
java -jar exchange_rates.jar
```
Запуск Docker:
---

```
docker build -t aman8808/exchange_rates .
``` 
Получение образа с DockerHub:
```
docker pull aman8808/exchange_rates 
```