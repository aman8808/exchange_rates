package com.karabalaev.exchange_rates.client;

import com.karabalaev.exchange_rates.model.ExchangeRates;

public interface OpenExchangeRatesClient {

    ExchangeRates getLatestRates(String appId);

    ExchangeRates getHistoricalRates(String date, String appId);
}
