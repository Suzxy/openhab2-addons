/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.gardena.handler;

/**
 * Exception if the AccountHandler is not available.
 *
 * @author Gerhard Riegler - Initial contribution
 */
public class AccountHandlerNotAvailableException extends Exception {

    private static final long serialVersionUID = -1895774551653276530L;

    public AccountHandlerNotAvailableException(String message) {
        super(message);
    }

}
