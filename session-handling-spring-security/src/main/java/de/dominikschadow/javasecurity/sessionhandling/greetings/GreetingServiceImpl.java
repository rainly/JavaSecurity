/*
 * Copyright (C) 2017 Dominik Schadow, dominikschadow@gmail.com
 *
 * This file is part of the Java Security project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.dominikschadow.javasecurity.sessionhandling.greetings;

import org.springframework.stereotype.Service;

/**
 * GreetingService implementation to return some hardcoded greetings.
 *
 * @author Dominik Schadow
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greetUser() {
        return "Spring Security says hello to the user!";
    }

    @Override
    public String greetAdmin() {
        return "Spring Security says hello to the admin!";
    }
}
