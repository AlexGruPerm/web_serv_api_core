package webservice

final case class ReqParseException(private val message: String = "",
                                   private val cause: Throwable = None.orNull)
  extends Exception(message, cause)
