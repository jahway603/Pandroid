package com.jz.pandroid.request.method.exp.ad

import com.jz.pandroid.request.model.SyncTokenRequestBody

/**
 * Created by Jeremiah Zucker on 8/22/2017.
 * https://6xq.net/pandora-apidoc/json/ads/#register-advertisement
 */
object RegisterAd {
    data class RequestBody(
            val stationId: String?,
            val adTrackingTokens: String
    ) : SyncTokenRequestBody(TokenType.USER)

    val methodName: String = "ad.registerAd"
}