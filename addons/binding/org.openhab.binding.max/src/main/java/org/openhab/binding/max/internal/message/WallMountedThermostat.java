/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.max.internal.message;


/**
 *  MAX!Cube wall mounted thermostat. 
 * 
 * @author Andreas Heil (info@aheil.de)
 * @since 1.4.0
 */
public class WallMountedThermostat extends HeatingThermostat {

	/**
	 * Class constructor. 
	 * @param c
	 */
	public WallMountedThermostat(DeviceConfiguration c) {
		super(c);
	}
	
	@Override
	public DeviceType getType() {
		return DeviceType.WallMountedThermostat;
	}
}
