package com.wutsi.platform.contact.dto

import java.time.OffsetDateTime
import kotlin.Long

public data class Contact(
  public val accountId: Long = 0,
  public val contactId: Long = 0,
  public val created: OffsetDateTime = OffsetDateTime.now()
)
