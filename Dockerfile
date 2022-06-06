FROM openjdk:11

EXPOSE 8077


RUN mkdir ./app

COPY ./exchange_rates.jar ./app

CMD java -jar ./app/exchange_rates.jar