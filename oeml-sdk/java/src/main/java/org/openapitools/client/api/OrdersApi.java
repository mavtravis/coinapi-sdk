/*
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Message;
import org.openapitools.client.model.OrderCancelAllRequest;
import org.openapitools.client.model.OrderCancelSingleRequest;
import org.openapitools.client.model.OrderExecutionReport;
import org.openapitools.client.model.OrderNewSingleRequest;
import org.openapitools.client.model.ValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersApi {
    private ApiClient localVarApiClient;

    public OrdersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrdersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1OrdersCancelAllPost
     * @param orderCancelAllRequest OrderCancelAllRequest object. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Result </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersCancelAllPostCall(OrderCancelAllRequest orderCancelAllRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = orderCancelAllRequest;

        // create path and map variables
        String localVarPath = "/v1/orders/cancel/all";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "appliction/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1OrdersCancelAllPostValidateBeforeCall(OrderCancelAllRequest orderCancelAllRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orderCancelAllRequest' is set
        if (orderCancelAllRequest == null) {
            throw new ApiException("Missing the required parameter 'orderCancelAllRequest' when calling v1OrdersCancelAllPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1OrdersCancelAllPostCall(orderCancelAllRequest, _callback);
        return localVarCall;

    }

    /**
     * Cancel all orders request
     * This request cancels all open orders on single specified exchange.
     * @param orderCancelAllRequest OrderCancelAllRequest object. (required)
     * @return Message
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Result </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public Message v1OrdersCancelAllPost(OrderCancelAllRequest orderCancelAllRequest) throws ApiException {
        ApiResponse<Message> localVarResp = v1OrdersCancelAllPostWithHttpInfo(orderCancelAllRequest);
        return localVarResp.getData();
    }

    /**
     * Cancel all orders request
     * This request cancels all open orders on single specified exchange.
     * @param orderCancelAllRequest OrderCancelAllRequest object. (required)
     * @return ApiResponse&lt;Message&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Result </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Message> v1OrdersCancelAllPostWithHttpInfo(OrderCancelAllRequest orderCancelAllRequest) throws ApiException {
        okhttp3.Call localVarCall = v1OrdersCancelAllPostValidateBeforeCall(orderCancelAllRequest, null);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel all orders request (asynchronously)
     * This request cancels all open orders on single specified exchange.
     * @param orderCancelAllRequest OrderCancelAllRequest object. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Result </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersCancelAllPostAsync(OrderCancelAllRequest orderCancelAllRequest, final ApiCallback<Message> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrdersCancelAllPostValidateBeforeCall(orderCancelAllRequest, _callback);
        Type localVarReturnType = new TypeToken<Message>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1OrdersCancelPost
     * @param orderCancelSingleRequest OrderCancelSingleRequest object. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report for the order for which cancelation was requested. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersCancelPostCall(OrderCancelSingleRequest orderCancelSingleRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = orderCancelSingleRequest;

        // create path and map variables
        String localVarPath = "/v1/orders/cancel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "appliction/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1OrdersCancelPostValidateBeforeCall(OrderCancelSingleRequest orderCancelSingleRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orderCancelSingleRequest' is set
        if (orderCancelSingleRequest == null) {
            throw new ApiException("Missing the required parameter 'orderCancelSingleRequest' when calling v1OrdersCancelPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1OrdersCancelPostCall(orderCancelSingleRequest, _callback);
        return localVarCall;

    }

    /**
     * Cancel order request
     * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
     * @param orderCancelSingleRequest OrderCancelSingleRequest object. (required)
     * @return OrderExecutionReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report for the order for which cancelation was requested. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public OrderExecutionReport v1OrdersCancelPost(OrderCancelSingleRequest orderCancelSingleRequest) throws ApiException {
        ApiResponse<OrderExecutionReport> localVarResp = v1OrdersCancelPostWithHttpInfo(orderCancelSingleRequest);
        return localVarResp.getData();
    }

    /**
     * Cancel order request
     * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
     * @param orderCancelSingleRequest OrderCancelSingleRequest object. (required)
     * @return ApiResponse&lt;OrderExecutionReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report for the order for which cancelation was requested. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExecutionReport> v1OrdersCancelPostWithHttpInfo(OrderCancelSingleRequest orderCancelSingleRequest) throws ApiException {
        okhttp3.Call localVarCall = v1OrdersCancelPostValidateBeforeCall(orderCancelSingleRequest, null);
        Type localVarReturnType = new TypeToken<OrderExecutionReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel order request (asynchronously)
     * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
     * @param orderCancelSingleRequest OrderCancelSingleRequest object. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report for the order for which cancelation was requested. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersCancelPostAsync(OrderCancelSingleRequest orderCancelSingleRequest, final ApiCallback<OrderExecutionReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrdersCancelPostValidateBeforeCall(orderCancelSingleRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExecutionReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1OrdersGet
     * @param exchangeId Filter the open orders to the specific exchange. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collection of order execution reports. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Filtered exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersGetCall(String exchangeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exchangeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("exchange_id", exchangeId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "appliction/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1OrdersGetValidateBeforeCall(String exchangeId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1OrdersGetCall(exchangeId, _callback);
        return localVarCall;

    }

    /**
     * Get open orders
     * Get last execution reports for open orders across all or single exchange.
     * @param exchangeId Filter the open orders to the specific exchange. (optional)
     * @return List&lt;OrderExecutionReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collection of order execution reports. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Filtered exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public List<OrderExecutionReport> v1OrdersGet(String exchangeId) throws ApiException {
        ApiResponse<List<OrderExecutionReport>> localVarResp = v1OrdersGetWithHttpInfo(exchangeId);
        return localVarResp.getData();
    }

    /**
     * Get open orders
     * Get last execution reports for open orders across all or single exchange.
     * @param exchangeId Filter the open orders to the specific exchange. (optional)
     * @return ApiResponse&lt;List&lt;OrderExecutionReport&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collection of order execution reports. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Filtered exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<OrderExecutionReport>> v1OrdersGetWithHttpInfo(String exchangeId) throws ApiException {
        okhttp3.Call localVarCall = v1OrdersGetValidateBeforeCall(exchangeId, null);
        Type localVarReturnType = new TypeToken<List<OrderExecutionReport>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get open orders (asynchronously)
     * Get last execution reports for open orders across all or single exchange.
     * @param exchangeId Filter the open orders to the specific exchange. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Collection of order execution reports. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Filtered exchange is unreachable. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersGetAsync(String exchangeId, final ApiCallback<List<OrderExecutionReport>> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrdersGetValidateBeforeCall(exchangeId, _callback);
        Type localVarReturnType = new TypeToken<List<OrderExecutionReport>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1OrdersPost
     * @param orderNewSingleRequest OrderNewSingleRequest object. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Exchange didn&#39;t responded in the defined timeout. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersPostCall(OrderNewSingleRequest orderNewSingleRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = orderNewSingleRequest;

        // create path and map variables
        String localVarPath = "/v1/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "appliction/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1OrdersPostValidateBeforeCall(OrderNewSingleRequest orderNewSingleRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orderNewSingleRequest' is set
        if (orderNewSingleRequest == null) {
            throw new ApiException("Missing the required parameter 'orderNewSingleRequest' when calling v1OrdersPost(Async)");
        }
        

        okhttp3.Call localVarCall = v1OrdersPostCall(orderNewSingleRequest, _callback);
        return localVarCall;

    }

    /**
     * Send new order
     * This request creating new order for the specific exchange.
     * @param orderNewSingleRequest OrderNewSingleRequest object. (required)
     * @return OrderExecutionReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Exchange didn&#39;t responded in the defined timeout. </td><td>  -  </td></tr>
     </table>
     */
    public OrderExecutionReport v1OrdersPost(OrderNewSingleRequest orderNewSingleRequest) throws ApiException {
        ApiResponse<OrderExecutionReport> localVarResp = v1OrdersPostWithHttpInfo(orderNewSingleRequest);
        return localVarResp.getData();
    }

    /**
     * Send new order
     * This request creating new order for the specific exchange.
     * @param orderNewSingleRequest OrderNewSingleRequest object. (required)
     * @return ApiResponse&lt;OrderExecutionReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Exchange didn&#39;t responded in the defined timeout. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExecutionReport> v1OrdersPostWithHttpInfo(OrderNewSingleRequest orderNewSingleRequest) throws ApiException {
        okhttp3.Call localVarCall = v1OrdersPostValidateBeforeCall(orderNewSingleRequest, null);
        Type localVarReturnType = new TypeToken<OrderExecutionReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send new order (asynchronously)
     * This request creating new order for the specific exchange.
     * @param orderNewSingleRequest OrderNewSingleRequest object. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Input model validation errors. </td><td>  -  </td></tr>
        <tr><td> 490 </td><td> Exchange is unreachable. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Exchange didn&#39;t responded in the defined timeout. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersPostAsync(OrderNewSingleRequest orderNewSingleRequest, final ApiCallback<OrderExecutionReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrdersPostValidateBeforeCall(orderNewSingleRequest, _callback);
        Type localVarReturnType = new TypeToken<OrderExecutionReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1OrdersStatusClientOrderIdGet
     * @param clientOrderId The unique identifier of the order assigned by the client. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report of the requested order. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested order was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersStatusClientOrderIdGetCall(String clientOrderId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orders/status/{client_order_id}"
            .replaceAll("\\{" + "client_order_id" + "\\}", localVarApiClient.escapeString(clientOrderId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1OrdersStatusClientOrderIdGetValidateBeforeCall(String clientOrderId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clientOrderId' is set
        if (clientOrderId == null) {
            throw new ApiException("Missing the required parameter 'clientOrderId' when calling v1OrdersStatusClientOrderIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = v1OrdersStatusClientOrderIdGetCall(clientOrderId, _callback);
        return localVarCall;

    }

    /**
     * Get order execution report
     * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
     * @param clientOrderId The unique identifier of the order assigned by the client. (required)
     * @return OrderExecutionReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report of the requested order. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested order was not found. </td><td>  -  </td></tr>
     </table>
     */
    public OrderExecutionReport v1OrdersStatusClientOrderIdGet(String clientOrderId) throws ApiException {
        ApiResponse<OrderExecutionReport> localVarResp = v1OrdersStatusClientOrderIdGetWithHttpInfo(clientOrderId);
        return localVarResp.getData();
    }

    /**
     * Get order execution report
     * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
     * @param clientOrderId The unique identifier of the order assigned by the client. (required)
     * @return ApiResponse&lt;OrderExecutionReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report of the requested order. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested order was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderExecutionReport> v1OrdersStatusClientOrderIdGetWithHttpInfo(String clientOrderId) throws ApiException {
        okhttp3.Call localVarCall = v1OrdersStatusClientOrderIdGetValidateBeforeCall(clientOrderId, null);
        Type localVarReturnType = new TypeToken<OrderExecutionReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get order execution report (asynchronously)
     * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
     * @param clientOrderId The unique identifier of the order assigned by the client. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The last execution report of the requested order. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested order was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrdersStatusClientOrderIdGetAsync(String clientOrderId, final ApiCallback<OrderExecutionReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrdersStatusClientOrderIdGetValidateBeforeCall(clientOrderId, _callback);
        Type localVarReturnType = new TypeToken<OrderExecutionReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
