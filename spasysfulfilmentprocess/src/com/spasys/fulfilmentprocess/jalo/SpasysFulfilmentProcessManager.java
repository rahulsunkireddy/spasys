/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.spasys.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.spasys.fulfilmentprocess.constants.SpasysFulfilmentProcessConstants;

public class SpasysFulfilmentProcessManager extends GeneratedSpasysFulfilmentProcessManager
{
	public static final SpasysFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SpasysFulfilmentProcessManager) em.getExtension(SpasysFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
