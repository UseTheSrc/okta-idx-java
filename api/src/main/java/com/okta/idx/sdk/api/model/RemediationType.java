/*
 * Copyright (c) 2021-Present, Okta, Inc.
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

import java.io.Serializable;

public class RemediationType implements Serializable {

    private static final long serialVersionUID = -5914711927029427942L;

    public static final String IDENTIFY = "identify";

    public static final String SKIP = "skip";

    public static final String ENROLL_AUTHENTICATOR = "enroll-authenticator";

    public static final String REENROLL_AUTHENTICATOR = "reenroll-authenticator";

    public static final String CHALLENGE_AUTHENTICATOR = "challenge-authenticator";

    // represents success state
    public static final String SUCCESS_WITH_INTERACTION_CODE = "successWithInteractionCode";

    public static final String SELECT_AUTHENTICATOR_AUTHENTICATE = "select-authenticator-authenticate";

    public static final String RESET_AUTHENTICATOR = "reset-authenticator";

    public static final String ENROLL_PROFILE = "enroll-profile";

    public static final String ENROLL_POLL = "enroll-poll";

    public static final String SELECT_ENROLL_PROFILE = "select-enroll-profile";

    public static final String SELECT_AUTHENTICATOR_ENROLL = "select-authenticator-enroll";

    public static final String IDENTIFY_RECOVERY = "identify-recovery";

    public static final String AUTHENTICATOR_ENROLLMENT_DATA  = "authenticator-enrollment-data";

    public static final String AUTHENTICATOR_VERIFICATION_DATA = "authenticator-verification-data";

    public static final String ENROLLMENT_CHANNEL_DATA = "enrollment-channel-data";

    public static final String CHALLENGE_POLL = "challenge-poll";

    public static final String UNKNOWN = "unknown";
}
