package com.karabalaev.exchange_rates.service;

import java.util.List;

public interface ExchangeRatesService {

    List<String> getCharCodes();

    int getKeyForTag(String charCode);

    void refreshRates();

}
