# ArticlesApi

All URIs are relative to *http://hytale.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArticleBySlug**](ArticlesApi.md#getArticleBySlug) | **GET** /blog/post/slug/{slug} | 
[**getArticles**](ArticlesApi.md#getArticles) | **GET** /blog/post/published | 
[**getArticlesOfMonthAndYear**](ArticlesApi.md#getArticlesOfMonthAndYear) | **GET** /blog/post/archive/{year}/{month}/ | 


<a name="getArticleBySlug"></a>
# **getArticleBySlug**
> Article getArticleBySlug(slug)



Get list of articles published

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
String slug = "slug_example"; // String | Slug of article
try {
    Article result = apiInstance.getArticleBySlug(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#getArticleBySlug");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | **String**| Slug of article |

### Return type

[**Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getArticles"></a>
# **getArticles**
> List&lt;Article&gt; getArticles(featuredOnly)



Get list of articles published

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
Boolean featuredOnly = true; // Boolean | 
try {
    List<Article> result = apiInstance.getArticles(featuredOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#getArticles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featuredOnly** | **Boolean**|  | [optional]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getArticlesOfMonthAndYear"></a>
# **getArticlesOfMonthAndYear**
> List&lt;Article&gt; getArticlesOfMonthAndYear(year, month)



Get list of articles published on a specific month of an year

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArticlesApi;


ArticlesApi apiInstance = new ArticlesApi();
Integer year = 56; // Integer | Year (ex: 2019)
Integer month = 56; // Integer | Month (ex: 01)
try {
    List<Article> result = apiInstance.getArticlesOfMonthAndYear(year, month);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#getArticlesOfMonthAndYear");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **year** | **Integer**| Year (ex: 2019) |
 **month** | **Integer**| Month (ex: 01) |

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

