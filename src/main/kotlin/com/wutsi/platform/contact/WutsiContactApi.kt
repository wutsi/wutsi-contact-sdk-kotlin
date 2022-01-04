package com.wutsi.platform.contact

import com.wutsi.platform.contact.dto.CreateContactRequest
import com.wutsi.platform.contact.dto.CreateContactResponse
import com.wutsi.platform.contact.dto.SearchContactRequest
import com.wutsi.platform.contact.dto.SearchContactResponse
import com.wutsi.platform.contact.dto.SyncContactRequest
import com.wutsi.platform.contact.dto.SyncContactResponse
import feign.Headers
import feign.RequestLine

public interface WutsiContactApi {
  @RequestLine("POST /v1/contacts")
  @Headers(value=["Content-Type: application/json"])
  public fun createContact(request: CreateContactRequest): CreateContactResponse

  @RequestLine("POST /v1/contacts/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchContact(request: SearchContactRequest): SearchContactResponse

  @RequestLine("POST /v1/contacts/sync")
  @Headers(value=["Content-Type: application/json"])
  public fun syncContacts(request: SyncContactRequest): SyncContactResponse
}
