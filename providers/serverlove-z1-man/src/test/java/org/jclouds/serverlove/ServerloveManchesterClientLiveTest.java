/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.serverlove;

import org.jclouds.domain.LoginCredentials;
import org.jclouds.elasticstack.ElasticStackClientLiveTest;
import org.jclouds.elasticstack.domain.Server;
import org.testng.annotations.Test;

/**
 * 
 * @author Adrian Cole
 */
@Test(groups = "live", singleThreaded = true)
public class ServerloveManchesterClientLiveTest extends ElasticStackClientLiveTest {
   public ServerloveManchesterClientLiveTest() {
      provider = "serverlove-z1-man";
      bootDrive = "574a3921-2926-4a61-bdd9-8d9282b32810";
   }

   @Override
   protected LoginCredentials getSshCredentials(Server server) {
      return LoginCredentials.builder().user("root").password(server.getVnc().getPassword()).build();
   }
}
