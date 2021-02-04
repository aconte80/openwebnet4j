/**
 * Copyright (c) 2020 Contributors to the openwebnet4j project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 */
package org.openwebnet4j.message;

/**
 * WHERE for Energy Manager frames
 *
 * == Where Table:
 *
 * === Probes
 * 0 - all probes
 * Z - master probe of zone Z [1-99]
 * 0ZZ - all slave probes of zone ZZ [01-99]
 * sZZ - slave probe s[1-8] of zone ZZ [01-99]
 * s00 - external probe s[1-9] of external zone 00
 *
 * === Actuators (thermostats)
 * #0 - central unit
 * #Z - zone Z [1-99] via central unit
 * 0#0 - all zones, all actuators
 * Z#0 - zone Z [1-99], all actuators
 * Z#N - zone Z [1-99], actuator N [1-9]
 *
 * @author M. Valla - Initial contribution
 * @author Andrea Conte - Energy manager integration
 */
public class WhereEnergyManager extends Where {

    public static final Where GENERAL = new WhereEnergyManager("51");

    public WhereEnergyManager(String w) throws NullPointerException {
        // TODO check range for WHERE  5N with N= [1-255]
        super(w);
    }
}
