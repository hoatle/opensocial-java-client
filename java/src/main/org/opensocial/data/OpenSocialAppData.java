/* Copyright (c) 2008 Google Inc.
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


package org.opensocial.data;

public class OpenSocialAppData extends OpenSocialObject {

  public OpenSocialAppData() {
    super();
  }
  
  public String getStringForUser(String id, String key) throws OpenSocialException {
    OpenSocialField f1;
    OpenSocialField f2;
    OpenSocialObject o;
    String value;
    
    f1 = this.getField(id);
    o = f1.getValue();
    
    f2 = o.getField(key);
    value = f2.getStringValue();
    
    return value;
  }
}
