/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2022 The ZAP Development Team
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
package org.zaproxy.addon.network.internal;

import io.netty.util.AttributeKey;
import java.net.InetSocketAddress;

/** Common attributes for a channel. */
public final class ChannelAttributes {

    private ChannelAttributes() {}

    /** The attribute that contains the remote address. */
    public static final AttributeKey<InetSocketAddress> REMOTE_ADDRESS =
            AttributeKey.newInstance("zap.remote-address");

    /** The attribute that indicates if a channel was upgraded to use the SSL/TLS protocol. */
    public static final AttributeKey<Boolean> TLS_UPGRADED =
            AttributeKey.newInstance("zap.tls-upgraded");
}