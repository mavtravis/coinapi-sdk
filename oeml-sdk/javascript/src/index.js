/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Balance from './model/Balance';
import BalanceData from './model/BalanceData';
import Message from './model/Message';
import OrdSide from './model/OrdSide';
import OrdStatus from './model/OrdStatus';
import OrdType from './model/OrdType';
import OrderCancelAllRequest from './model/OrderCancelAllRequest';
import OrderCancelSingleRequest from './model/OrderCancelSingleRequest';
import OrderExecutionReport from './model/OrderExecutionReport';
import OrderExecutionReportAllOf from './model/OrderExecutionReportAllOf';
import OrderNewSingleRequest from './model/OrderNewSingleRequest';
import Position from './model/Position';
import PositionData from './model/PositionData';
import Severity from './model/Severity';
import TimeInForce from './model/TimeInForce';
import ValidationError from './model/ValidationError';
import BalancesApi from './api/BalancesApi';
import OrdersApi from './api/OrdersApi';
import PositionsApi from './api/PositionsApi';


/**
* This_section_will_provide_necessary_information_about_the_CoinAPI_OEML_REST_API_protocol_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var OemlRestApi = require('index'); // See note below*.
* var xxxSvc = new OemlRestApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new OemlRestApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new OemlRestApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new OemlRestApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version v1
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Balance model constructor.
     * @property {module:model/Balance}
     */
    Balance,

    /**
     * The BalanceData model constructor.
     * @property {module:model/BalanceData}
     */
    BalanceData,

    /**
     * The Message model constructor.
     * @property {module:model/Message}
     */
    Message,

    /**
     * The OrdSide model constructor.
     * @property {module:model/OrdSide}
     */
    OrdSide,

    /**
     * The OrdStatus model constructor.
     * @property {module:model/OrdStatus}
     */
    OrdStatus,

    /**
     * The OrdType model constructor.
     * @property {module:model/OrdType}
     */
    OrdType,

    /**
     * The OrderCancelAllRequest model constructor.
     * @property {module:model/OrderCancelAllRequest}
     */
    OrderCancelAllRequest,

    /**
     * The OrderCancelSingleRequest model constructor.
     * @property {module:model/OrderCancelSingleRequest}
     */
    OrderCancelSingleRequest,

    /**
     * The OrderExecutionReport model constructor.
     * @property {module:model/OrderExecutionReport}
     */
    OrderExecutionReport,

    /**
     * The OrderExecutionReportAllOf model constructor.
     * @property {module:model/OrderExecutionReportAllOf}
     */
    OrderExecutionReportAllOf,

    /**
     * The OrderNewSingleRequest model constructor.
     * @property {module:model/OrderNewSingleRequest}
     */
    OrderNewSingleRequest,

    /**
     * The Position model constructor.
     * @property {module:model/Position}
     */
    Position,

    /**
     * The PositionData model constructor.
     * @property {module:model/PositionData}
     */
    PositionData,

    /**
     * The Severity model constructor.
     * @property {module:model/Severity}
     */
    Severity,

    /**
     * The TimeInForce model constructor.
     * @property {module:model/TimeInForce}
     */
    TimeInForce,

    /**
     * The ValidationError model constructor.
     * @property {module:model/ValidationError}
     */
    ValidationError,

    /**
    * The BalancesApi service constructor.
    * @property {module:api/BalancesApi}
    */
    BalancesApi,

    /**
    * The OrdersApi service constructor.
    * @property {module:api/OrdersApi}
    */
    OrdersApi,

    /**
    * The PositionsApi service constructor.
    * @property {module:api/PositionsApi}
    */
    PositionsApi
};
