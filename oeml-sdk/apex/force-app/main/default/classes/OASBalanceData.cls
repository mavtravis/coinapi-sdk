/*
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol.\nThis API is also available in the Postman application: <a href="https://postman.coinapi.io/" target="_blank">https://postman.coinapi.io/</a>      \n
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASBalanceData
 */
public class OASBalanceData implements OAS.MappedProperties {
    /**
     * Exchange currency code.
     * @return assetIdExchange
     */
    public String assetIdExchange { get; set; }

    /**
     * CoinAPI currency code.
     * @return assetIdCoinapi
     */
    public String assetIdCoinapi { get; set; }

    /**
     * Value of the current total currency balance on the exchange.
     * @return balance
     */
    public Double balance { get; set; }

    /**
     * Value of the current available currency balance on the exchange that can be used as collateral.
     * @return available
     */
    public Double available { get; set; }

    /**
     * Value of the current locked currency balance by the exchange.
     * @return locked
     */
    public Double locked { get; set; }

    /**
     * Source of the last modification.\n
     */
    public enum LastUpdatedByEnum {
        INITIALIZATION,
        BALANCE_MANAGER,
        EXCHANGE
    }

    /**
     * Source of the last modification.\n
     * @return lastUpdatedBy
     */
    public LastUpdatedByEnum lastUpdatedBy { get; set; }

    /**
     * Current exchange rate to the USD for the single unit of the currency.\n
     * @return rateUsd
     */
    public Double rateUsd { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'asset_id_exchange' => 'assetIdExchange',
        'asset_id_coinapi' => 'assetIdCoinapi',
        'last_updated_by' => 'lastUpdatedBy',
        'rate_usd' => 'rateUsd'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASBalanceData getExample() {
        OASBalanceData balanceData = new OASBalanceData();
          balanceData.assetIdExchange = 'XBT';
          balanceData.assetIdCoinapi = 'BTC';
          balanceData.balance = 0.00134444;
          balanceData.available = 0.00134444;
          balanceData.locked = 0.0;
          balanceData.lastUpdatedBy = LastUpdatedByEnum.EXCHANGE;
          balanceData.rateUsd = 1355.12;
        return balanceData;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBalanceData) {           
            OASBalanceData balanceData = (OASBalanceData) obj;
            return this.assetIdExchange == balanceData.assetIdExchange
                && this.assetIdCoinapi == balanceData.assetIdCoinapi
                && this.balance == balanceData.balance
                && this.available == balanceData.available
                && this.locked == balanceData.locked
                && this.lastUpdatedBy == balanceData.lastUpdatedBy
                && this.rateUsd == balanceData.rateUsd;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (assetIdExchange == null ? 0 : System.hashCode(assetIdExchange));
        hashCode = (17 * hashCode) + (assetIdCoinapi == null ? 0 : System.hashCode(assetIdCoinapi));
        hashCode = (17 * hashCode) + (balance == null ? 0 : System.hashCode(balance));
        hashCode = (17 * hashCode) + (available == null ? 0 : System.hashCode(available));
        hashCode = (17 * hashCode) + (locked == null ? 0 : System.hashCode(locked));
        hashCode = (17 * hashCode) + (lastUpdatedBy == null ? 0 : System.hashCode(lastUpdatedBy));
        hashCode = (17 * hashCode) + (rateUsd == null ? 0 : System.hashCode(rateUsd));
        return hashCode;
    }
}
