/*
 * Copyright 2019 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.bootstrap;

import java.net.SocketAddress;

/**
 * {@link SocketAddress} which will provide the local {@link SocketAddress} to bind to after the remote address
 * is resolved. Implementations can be used with {@link Bootstrap#connect(SocketAddress, SocketAddressFunction)}.
 */
public interface SocketAddressFunction {

    /**
     * Return a {@link SocketAddress} to bind to for the given {@code remote} {@link SocketAddress} or {@code null}
     * if no specific {@link SocketAddress} should be used.
     */
    SocketAddress apply(SocketAddress remote);
}
