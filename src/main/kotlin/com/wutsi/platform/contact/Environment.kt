package com.wutsi.platform.contact

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-contact-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-contact-server-prod.herokuapp.com"),
  ;
}
