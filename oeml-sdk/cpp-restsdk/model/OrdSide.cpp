/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OrdSide.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrdSide::OrdSide()
{
}

OrdSide::~OrdSide()
{
}

void OrdSide::validate()
{
    // TODO: implement validation
}

web::json::value OrdSide::toJson() const
{
    web::json::value val = web::json::value::object();

    
    if (m_value == eOrdSide::OrdSide_BUY) val = web::json::value::string(U("BUY"));
    if (m_value == eOrdSide::OrdSide_SELL) val = web::json::value::string(U("SELL"));

    return val;
}

bool OrdSide::fromJson(const web::json::value& val)
{
    auto s = val.as_string();

    
    if (s == utility::conversions::to_string_t("BUY")) m_value = eOrdSide::OrdSide_BUY;
    if (s == utility::conversions::to_string_t("SELL")) m_value = eOrdSide::OrdSide_SELL;
    return true;
}

void OrdSide::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    utility::string_t s;

    
    if (m_value == eOrdSide::OrdSide_BUY) s = utility::conversions::to_string_t("BUY");
    if (m_value == eOrdSide::OrdSide_SELL) s = utility::conversions::to_string_t("SELL");

    multipart->add(ModelBase::toHttpContent(namePrefix, s));
}

bool OrdSide::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }
    {
        utility::string_t s;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), s);
        eOrdSide v;

        
        if (s == utility::conversions::to_string_t("BUY")) v = eOrdSide::OrdSide_BUY;
        if (s == utility::conversions::to_string_t("SELL")) v = eOrdSide::OrdSide_SELL;

        setValue(v);
    }
    return ok;
}

OrdSide::eOrdSide OrdSide::getValue() const
{
   return m_value;
}

void OrdSide::setValue(OrdSide::eOrdSide const value)
{
   m_value = value;
}


}
}
}
}


