/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the resource id ( <code>rid</code> ) and the time it took to
 * process the request ( <code>timems</code> ).
 * </p>
 */
public class SuggestStatus implements Serializable {

    /**
     * How long it took to process the request, in milliseconds.
     */
    private Long timems;

    /**
     * The encrypted resource ID for the request.
     */
    private String rid;

    /**
     * How long it took to process the request, in milliseconds.
     *
     * @return How long it took to process the request, in milliseconds.
     */
    public Long getTimems() {
        return timems;
    }
    
    /**
     * How long it took to process the request, in milliseconds.
     *
     * @param timems How long it took to process the request, in milliseconds.
     */
    public void setTimems(Long timems) {
        this.timems = timems;
    }
    
    /**
     * How long it took to process the request, in milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timems How long it took to process the request, in milliseconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestStatus withTimems(Long timems) {
        this.timems = timems;
        return this;
    }

    /**
     * The encrypted resource ID for the request.
     *
     * @return The encrypted resource ID for the request.
     */
    public String getRid() {
        return rid;
    }
    
    /**
     * The encrypted resource ID for the request.
     *
     * @param rid The encrypted resource ID for the request.
     */
    public void setRid(String rid) {
        this.rid = rid;
    }
    
    /**
     * The encrypted resource ID for the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rid The encrypted resource ID for the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestStatus withRid(String rid) {
        this.rid = rid;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimems() != null) sb.append("Timems: " + getTimems() + ",");
        if (getRid() != null) sb.append("Rid: " + getRid() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTimems() == null) ? 0 : getTimems().hashCode()); 
        hashCode = prime * hashCode + ((getRid() == null) ? 0 : getRid().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuggestStatus == false) return false;
        SuggestStatus other = (SuggestStatus)obj;
        
        if (other.getTimems() == null ^ this.getTimems() == null) return false;
        if (other.getTimems() != null && other.getTimems().equals(this.getTimems()) == false) return false; 
        if (other.getRid() == null ^ this.getRid() == null) return false;
        if (other.getRid() != null && other.getRid().equals(this.getRid()) == false) return false; 
        return true;
    }
    
}
    