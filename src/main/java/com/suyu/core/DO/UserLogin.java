/*
 * Copyright (c) 2019. r4v3zn.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.suyu.core.DO;

/**
 * Title: UserLogin
 * Descrption: UserLogin DO
 * Date:2019-06-07 16:13
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 * @author R4v3zn
 * @version 1.0.0
 */
public class UserLogin {

    /**
     * this is FOFA Pro email
     */
    private  String email;

    /**
     * this is FOFA Pro key
     */
    private  String key;

    /**
     * Constructor
     * @param email user email
     * @param key user key
     */
    public UserLogin(String email, String key) {
        this.email = email;
        this.key = key;
    }

    public String getEmail() {
        return email;
    }

    public String getKey() {
        return key;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
