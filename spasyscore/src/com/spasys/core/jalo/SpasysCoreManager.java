/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.spasys.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.spasys.core.constants.SpasysCoreConstants;
import com.spasys.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class SpasysCoreManager extends GeneratedSpasysCoreManager
{
	public static final SpasysCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SpasysCoreManager) em.getExtension(SpasysCoreConstants.EXTENSIONNAME);
	}
}
