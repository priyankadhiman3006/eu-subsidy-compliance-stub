/*
 * Copyright 2021 HM Revenue & Customs
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

package uk.gov.hmrc.eusubsidycompliancestub.models

import play.api.libs.json.{JsString, Json}

package object json {

  // only writes the field if the value is defined, Play version relies on fields being in case class
  def nullableOpt[A](name: String, value: Option[A]): List[(String, Json.JsValueWrapper)] =
    value.fold(List.empty[(String, Json.JsValueWrapper)]) { v =>
      List((name, JsString(v.toString)))
    }
}
