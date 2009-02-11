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


package org.opensocial.client;

import org.json.JSONException;
import org.opensocial.data.OpenSocialActivity;
import org.opensocial.data.OpenSocialAppData;
import org.opensocial.data.OpenSocialPerson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An object which represents the response from an OpenSocial container after
 * one or more requests for data. Objects should not be instantiated directly
 * by clients -- instead, instances are generated by calling the send method
 * of OpenSocialBatch objects. This class simply contains wrapper methods
 * which parse a particular response item and return the appropriate
 * OpenSocialObject type.
 *
 * @author Jason Cooper
 */
public class OpenSocialResponse {

  private Map<String, String> items;

  public OpenSocialResponse() {
    this.items = new HashMap<String, String>();
  }

  /**
   * Retrieves and parses the JSON-encoded response item with the passed ID and
   * returns the parsed item as an OpenSocialPerson object.
   *
   * @param  id ID of the response item to parse
   * @throws OpenSocialRequestException
   * @throws JSONException
   */
  public OpenSocialPerson getItemAsPerson(String id)
      throws OpenSocialRequestException, JSONException {

    String item = this.items.get(id);
    return OpenSocialJsonParser.parseAsPerson(item);
  }

  /**
   * Retrieves and parses the JSON-encoded response item with the passed ID and
   * returns the parsed item as a List of OpenSocialPerson objects.
   *
   * @param  id ID of the response item to parse
   * @throws OpenSocialRequestException
   * @throws JSONException
   */
  public List<OpenSocialPerson> getItemAsPersonCollection(String id)
      throws OpenSocialRequestException, JSONException {

    String item = this.items.get(id);

    return OpenSocialJsonParser.parseAsPersonCollection(item);
  }

  /**
   * Retrieves and parses the JSON-encoded response item with the passed ID and
   * returns the parsed item as an OpenSocialAppData object.
   *
   * @param  id ID of the response item to parse
   * @throws OpenSocialRequestException
   * @throws JSONException
   */
  public OpenSocialAppData getItemAsAppData(String id)
      throws OpenSocialRequestException, JSONException {

    String item = this.items.get(id);

    return OpenSocialJsonParser.parseAsAppData(item);
  }

  /**
   * Retrieves and parses the JSON-encoded response item with the passed ID and
   * returns the parsed item as a List of OpenSocialActivity objects.
   *
   * @param id
   * @return
   * @throws OpenSocialRequestException
   * @throws JSONException
   */
  public List<OpenSocialActivity> getItemAsActivityCollection(String id)
      throws OpenSocialRequestException, JSONException {

    String item = this.items.get(id);

    return OpenSocialJsonParser.parseAsActivityCollection(item);
  }

  /**
   * Creates a new entry in items Map with the passed ID as key and JSON object
   * string as value.
   *
   * @param  id Response item ID
   * @param  objectString JSON object string to associate with the passed ID
   */
  public void addItem(String id, String objectString) {
    this.items.put(id, objectString);
  }

  // FIX ME...
  public Map getItems() {
    return this.items;
  }
}
