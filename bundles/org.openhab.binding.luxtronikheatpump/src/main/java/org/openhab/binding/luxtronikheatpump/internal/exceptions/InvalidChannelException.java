/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.luxtronikheatpump.internal.exceptions;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link InvalidChannelException} is thrown if a channel can't be found
 *
 * @author Stefan Giehl - Initial contribution
 */
@NonNullByDefault
public class InvalidChannelException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidChannelException(String message) {
        super(message);
    }
}
