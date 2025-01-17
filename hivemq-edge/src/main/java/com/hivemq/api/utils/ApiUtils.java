/*
 * Copyright 2019-present HiveMQ GmbH
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
package com.hivemq.api.utils;

import com.hivemq.http.core.UsernamePasswordRoles;

import java.util.List;

/**
 * @author Simon L Johnson
 */
public class ApiUtils {

    public static boolean hasDefaultUser(List<UsernamePasswordRoles> users){
        if(!users.isEmpty()){
            return users.stream().filter(user -> (UsernamePasswordRoles.DEFAULT_USERNAME.equals(user.getUserName())
                && UsernamePasswordRoles.DEFAULT_PASSWORD.equals(user.getPassword()))).count() > 0;
        }
        return false;
    }
}
