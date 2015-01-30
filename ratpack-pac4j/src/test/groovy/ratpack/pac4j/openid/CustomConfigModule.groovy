/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.pac4j.openid

import com.google.inject.AbstractModule
import ratpack.pac4j.internal.AbstractPac4jModule

class CustomConfigModule extends AbstractModule {
  private final String callbackPath

  CustomConfigModule(String callbackPath) {
    this.callbackPath = callbackPath
  }

  @Override
  protected void configure() {
    bind(AbstractPac4jModule.Config).toInstance(new AbstractPac4jModule.Config().callbackPath(callbackPath))
  }
}
