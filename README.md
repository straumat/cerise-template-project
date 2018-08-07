![Cerise BIP-0171](logo.png)
# Cerise server template.
Clone this project to quickly create your own BIP-0171 compliant server.

## Enumerating supported currency-pair tokens.
Implement method `getSupportedCurrencyPairTokens(...)` in [MySupportedCurrencyPairTokensService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MySupportedCurrencyPairTokensService.java) or create your own service implementing [SupportedCurrencyPairTokensService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/SupportedCurrencyPairTokensService.java).

## Currency-pair information.
Implement method `getCurrencyPairInformation(...)` in [MyCurrencyPairInformationService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MyCurrencyPairInformationService.java) or create your own service implementing [CurrencyPairInformationService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/CurrencyPairInformationService.java).

## Current exchange rate.
Implement method `getCurrentExchangeRate(...)` in [MyCurrentExchangeRateService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MyCurrentExchangeRateService.java) or create your own service implementing [CurrentExchangeRateService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/CurrentExchangeRateService.java).

## Historical exchange rates.
Implement method `getHistoricalExchangeRates(...)` in [MyHistoricalExchangeRatesService](https://github.com/straumat/cerise-server-template/blob/master/src/main/java/com/oakinvest/cerise/myserver/service/MyHistoricalExchangeRatesService.java) or create your own service implementing [HistoricalExchangeRatesService](https://github.com/straumat/cerise/blob/master/src/main/java/com/oakinvest/cerise/service/HistoricalExchangeRatesService.java).