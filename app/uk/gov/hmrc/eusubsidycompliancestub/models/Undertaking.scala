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

import uk.gov.hmrc.eusubsidycompliancestub.models.types._

case class Undertaking(
  undertakingReference: EORI, // 1-17 char // TODO assuming also an EORI
  undertakingName: UndertakingName, // 1-105 char
  industrySector: Sector, // 0-3 TODO this needs to be an enumeration
  industrySectorLimit: BigDecimal, // max 99999999999.99
  lastSubsidyUsageUpdt: String, // some sort of date! "2136/08-03" TODO - turn into LocalDate
  undertakingBusinessEntity: List[BusinessEntity]
)

//{
//  "retrieveUndertakingResponse": {
//    "responseCommon": {
//    "status": "NOT_OK",
//    "processingDate": "3446-92-08T17:31:33Z",
//    "statusText": "ABCDEFGHIJKLMNOPQRSTUVWXY",
//    "returnParameters": []
//  },
//    "responseDetail": {
//    "undertakingReference": "ABCDE",
//    "undertakingName": "ABCDEFGHIJKLMNOPQRSTUV",
//    "industrySector": "0",
//    "industrySectorLimit": 511.5,
//    "lastSubsidyUsageUpdt": "2136/08-03",
//    "undertakingBusinessEntity": [
//  {
//    "businessEntityIdentifier": "ABCDEFGH",
//    "leadEORI": true,
//    "address": {
//    "addressLine1": "ABCDE",
//    "countryCode": "AB",
//    "addressLine2": "ABCDEFGHIJKLMNOPQRSTUVWXYZAB",
//    "addressLine3": "ABCDEF",
//    "postcode": "ABCDEF"
//  },
//    "contacts": {
//    "phone": "ABCDEFGHIJKLMNOPQRSTUV",
//    "mobile": "ABCDE"
//  }
//  }
//    ]
//  }
//  }
//}
