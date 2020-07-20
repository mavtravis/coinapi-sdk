/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BalancesApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_BalancesApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_BalancesApi_H_


#include "../ApiClient.h"

#include "Balance.h"
#include "Message.h"
#include <cpprest/details/basic_types.h>


#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  BalancesApi 
{
public:

    explicit BalancesApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~BalancesApi();

    /// <summary>
    /// Get balances
    /// </summary>
    /// <remarks>
    /// Get current currency balance from all or single exchange.
    /// </remarks>
    /// <param name="exchangeId">Filter the balances to the specific exchange. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<Balance>>> v1BalancesGet(
        boost::optional<utility::string_t> exchangeId
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_BalancesApi_H_ */
