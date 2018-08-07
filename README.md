![Cerise BIP-0171](logo.png)
# Cerise server template.
This project helps you to quickly create your own BIP-0171 compliant server.

## Clone the project.
`git clone git@github.com:straumat/cerise-server-template.git`

## Edit code.

### Enumerating supported currency-pair tokens.
Implement method `getSupportedCurrencyPairTokens(...)` in [MySupportedCurrencyPairTokensService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MySupportedCurrencyPairTokensService.java) or create your own service implementing [SupportedCurrencyPairTokensService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/SupportedCurrencyPairTokensService.java).

### Currency-pair information.
Implement method `getCurrencyPairInformation(...)` in [MyCurrencyPairInformationService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MyCurrencyPairInformationService.java) or create your own service implementing [CurrencyPairInformationService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/CurrencyPairInformationService.java).

### Current exchange rate.
Implement method `getCurrentExchangeRate(...)` in [MyCurrentExchangeRateService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MyCurrentExchangeRateService.java) or create your own service implementing [CurrentExchangeRateService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/CurrentExchangeRateService.java).

### Historical exchange rates.
Implement method `getHistoricalExchangeRates(...)` in [MyHistoricalExchangeRatesService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MyHistoricalExchangeRatesService.java) or create your own service implementing [HistoricalExchangeRatesService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/HistoricalExchangeRatesService.java).

## Run it.
Once in the `cerise-server-template` directory, you can run the server with the `mvn spring-boot:run` command.

## Package it.
Once in the `cerise-server-template` directory, package it with the `mvn package` command. This will produce a file named `myserver.jar` in the `target` directory.

You can run the server with the command `java -jar myserver.jar`.