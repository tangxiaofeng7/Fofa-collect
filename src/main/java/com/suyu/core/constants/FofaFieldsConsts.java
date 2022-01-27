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

package com.suyu.core.constants;

import java.util.Arrays;
import java.util.List;

/**
 * Title: FofaFieldsConsts
 * Descrption: this is FOFA Pro fields Constants
 * Date:2019-06-08 18:53
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
public class FofaFieldsConsts {

    /**
     * FOFA Pro fields list
     */
    public static final List<String> FIELDS_LIST = Arrays.asList(new String[]{"host","title","ip","domain","port","country","province","city","country_name","header","protocol","banner","cert","isp","as_number","as_organization","latitude","longitude"});
}