/* Copyright (c) 2009 Google Inc.
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

package org.opensocial.models;

public class MediaItem extends Model {

  public String getId() {
    return getFieldAsString("id");
  }

  public String getTitle() {
    return getFieldAsString("title");
  }

  public String getType() {
    return getFieldAsString("type");
  }

  public String getMimeType() {
    return getFieldAsString("mime_type");
  }

  public String getContentType() {
    return getFieldAsString("contentType");
  }

  public String getThumbnailUrl() {
    return getFieldAsString("thumbnailUrl");
  }

  public String getUrl() {
    return getFieldAsString("url");
  }

  public void setTitle(String title) {
    put("title", title);
  }

  public void setType(String type) {
    put("type", type);
  }

  public void setContentType(String contentType) {
    put("contentType", contentType);
  }

  public void setDescription(String description) {
    put("description", description);
  }

  public void setUri(String uri) {
    put("uri", uri);
  }
}
