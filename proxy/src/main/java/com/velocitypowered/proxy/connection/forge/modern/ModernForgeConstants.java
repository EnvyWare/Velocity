/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.velocitypowered.proxy.connection.forge.modern;

import com.velocitypowered.api.network.ProtocolVersion;

/**
 * Constants for use with Modern Forge systems.
 */
public class ModernForgeConstants {

  /**
   * The version for forge handshakes.
   */
  public static String getVersion(ProtocolVersion protocolVersion) {
    return protocolVersion.getProtocol() >= ProtocolVersion.MINECRAFT_1_18.getProtocol() ? "FML3" : "FML2";
  }

  /**
   * Clients attempting to connect to 1.13+ Forge servers will have
   * this token appended to the hostname in the initial handshake
   * packet.
   */
  public static String getHandshakeHostnameToken(ProtocolVersion version) {
    return '\0' + getVersion(version) + '\0';
  }

  /**
   * The channel for forge handshakes.
   */
  public static final String HANDSHAKE_CHANNEL = "fml:handshake";

  /**
   * The channel for forge login wrapper.
   */
  public static final String LOGIN_WRAPPER_CHANNEL = "fml:loginwrapper";

  /**
   * The channel for forge play.y
   */
  public static final String PLAY_CHANNEL = "fml:play";

  /**
   * The Mod List discriminator.
   */
  static final int MOD_LIST_DISCRIMINATOR = 2;

  /**
   * The Reset discriminator.
   */
  static final int RESET_DISCRIMINATOR = 98;

  private ModernForgeConstants() {
    throw new AssertionError();
  }
}
