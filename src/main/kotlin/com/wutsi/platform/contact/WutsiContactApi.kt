package com.wutsi.platform.contact

import com.wutsi.platform.contact.dto.SearchContactRequest
import com.wutsi.platform.contact.dto.SearchContactResponse
import feign.Headers
import feign.RequestLine

public interface WutsiContactApi {
  @RequestLine("POST /v1/contacts/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchContact(request: SearchContactRequest): SearchContactResponse
}
