# Hytale Official API - JAVA SDK

Hytale Official API - JAVA SDK

Created by [mTxServ](https://mtxserv.com) and [Hytale.game](https://hytale.game).
With this SDK, you can consume the official Hytale API in PHP.


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ArticlesApi;

import java.io.File;
import java.util.*;

public class ArticlesApiExample {

    public static void main(String[] args) {
        
        ArticlesApi apiInstance = new ArticlesApi();
        String slug = "slug_example"; // String | Slug of article
        try {
            Article result = apiInstance.getArticleBySlug(slug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArticlesApi#getArticleBySlug");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.hytale.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArticlesApi* | [**getArticleBySlug**](docs/ArticlesApi.md#getArticleBySlug) | **GET** /blog/post/slug/{slug} | 
*ArticlesApi* | [**getArticles**](docs/ArticlesApi.md#getArticles) | **GET** /blog/post/published | 
*ArticlesApi* | [**getArticlesOfMonthAndYear**](docs/ArticlesApi.md#getArticlesOfMonthAndYear) | **GET** /blog/post/archive/{year}/{month}/ | 
*JobsApi* | [**getJobs**](docs/JobsApi.md#getJobs) | **GET** /job/listing | 


## Documentation for Models

 - [Article](docs/Article.md)
 - [CoverImage](docs/CoverImage.md)
 - [Job](docs/Job.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
