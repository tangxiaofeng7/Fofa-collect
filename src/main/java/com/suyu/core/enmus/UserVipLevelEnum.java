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

package com.suyu.core.enmus;

/**
 * Title: UserVipLevelEnum
 * Descrption: TODO
 * Date:2019-06-07 20:45
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public enum UserVipLevelEnum {

    /**
     * Senior member, Free member
     */
    SVIP(2,"高级会员"),VIP(1,"普通会员");

    private String levelName;

    private Integer code;

    UserVipLevelEnum(Integer code,String levelName){
        this.code = code;
        this.levelName = levelName;
    }

}