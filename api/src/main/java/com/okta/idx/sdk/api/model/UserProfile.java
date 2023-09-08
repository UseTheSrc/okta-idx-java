/*
 * Copyright (c) 2020-Present, Okta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.okta.idx.sdk.api.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.okta.commons.lang.Assert;
import com.okta.idx.sdk.api.serializers.UserProfileSerializer;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonSerialize(using = UserProfileSerializer.class)
public class UserProfile {

    @JsonIgnore
    private final Map<String, Object> fields = new LinkedHashMap<>();

    public Map<String, Object> getFields() {
        return fields;
    }

    @JsonAnySetter
    void setFields(String key, Object value) {
        fields.put(key, value);
    }

    public void addAttribute(String key, Object value) {
        this.getFields().put(key, value);
    }

    public void setFirstName(String firstName) {
        Assert.hasText(firstName, "firstName cannot be empty");
        addAttribute("firstName", firstName);
    }

    public void setLastName(String lastName) {
        Assert.hasText(lastName, "lastName cannot be empty");
        addAttribute("lastName", lastName);
    }

    public void setEmail(String email) {
        Assert.hasText(email, "email cannot be empty");
        addAttribute("email", email);
    }
}
