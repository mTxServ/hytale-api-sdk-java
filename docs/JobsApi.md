# JobsApi

All URIs are relative to *http://hytale.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJobs**](JobsApi.md#getJobs) | **GET** /job/listing | 


<a name="getJobs"></a>
# **getJobs**
> List&lt;Job&gt; getJobs()



Get list of jobs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JobsApi;


JobsApi apiInstance = new JobsApi();
try {
    List<Job> result = apiInstance.getJobs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#getJobs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

