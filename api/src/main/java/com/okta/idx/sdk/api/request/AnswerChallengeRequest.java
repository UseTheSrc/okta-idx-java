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
package com.okta.idx.sdk.api.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.okta.idx.sdk.api.model.Credentials;

import java.io.Serializable;
import java.util.Set;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AnswerChallengeRequest extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 5132114128662705378L;

    public Credentials credentials;

    public String phoneNumber;

    public String email;

    AnswerChallengeRequest(String stateHandle, Credentials credentials, String phoneNumber, String email) {
        this.stateHandle = stateHandle;
        this.credentials = credentials;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
