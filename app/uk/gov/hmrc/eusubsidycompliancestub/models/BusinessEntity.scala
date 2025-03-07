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

import play.api.libs.json.{Json, OFormat}
import uk.gov.hmrc.eusubsidycompliancestub.models.types.EORI

// TODO consider renaming... UndertakingMember might make more sense
case class BusinessEntity(
  businessEntityIdentifier: EORI,
  leadEORI: Boolean,
  contacts: Option[ContactDetails]
)

case object BusinessEntity {
  implicit val format: OFormat[BusinessEntity] =
    Json.format[BusinessEntity]
}