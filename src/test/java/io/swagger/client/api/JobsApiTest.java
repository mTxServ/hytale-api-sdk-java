/*
 * Hytale API
 * Hytale Official API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Job;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@Ignore
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    
    /**
     * 
     *
     * Get list of jobs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobsTest() throws ApiException {
        List<Job> response = api.getJobs();

        // TODO: test validations
    }
    
}