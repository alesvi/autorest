/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for the parameterGrouping_postRequired operation.
 */
public class ParameterGroupingPostRequiredParametersInner {
    /**
     * The body property.
     */
    @JsonProperty(value = "", required = true)
    private int body;

    /**
     * The customHeader property.
     */
    @JsonProperty(value = "")
    private String customHeader;

    /**
     * Query parameter with default.
     */
    @JsonProperty(value = "")
    private Integer query;

    /**
     * Path parameter.
     */
    @JsonProperty(value = "", required = true)
    private String path;

    /**
     * Get the body value.
     *
     * @return the body value
     */
    public int body() {
        return this.body;
    }

    /**
     * Set the body value.
     *
     * @param body the body value to set
     * @return the ParameterGroupingPostRequiredParametersInner object itself.
     */
    public ParameterGroupingPostRequiredParametersInner withBody(int body) {
        this.body = body;
        return this;
    }

    /**
     * Get the customHeader value.
     *
     * @return the customHeader value
     */
    public String customHeader() {
        return this.customHeader;
    }

    /**
     * Set the customHeader value.
     *
     * @param customHeader the customHeader value to set
     * @return the ParameterGroupingPostRequiredParametersInner object itself.
     */
    public ParameterGroupingPostRequiredParametersInner withCustomHeader(String customHeader) {
        this.customHeader = customHeader;
        return this;
    }

    /**
     * Get the query value.
     *
     * @return the query value
     */
    public Integer query() {
        return this.query;
    }

    /**
     * Set the query value.
     *
     * @param query the query value to set
     * @return the ParameterGroupingPostRequiredParametersInner object itself.
     */
    public ParameterGroupingPostRequiredParametersInner withQuery(Integer query) {
        this.query = query;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the ParameterGroupingPostRequiredParametersInner object itself.
     */
    public ParameterGroupingPostRequiredParametersInner withPath(String path) {
        this.path = path;
        return this;
    }

}
