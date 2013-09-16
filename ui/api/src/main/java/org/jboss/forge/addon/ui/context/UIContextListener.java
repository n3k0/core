/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.ui.context;

import org.jboss.forge.addon.ui.CommandExecutionListener;
import org.jboss.forge.furnace.services.Exported;

/**
 * Listener for lifecycle events of a {@link UIContext}.
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
@Exported
public interface UIContextListener
{
   /**
    * Invoked before interaction takes place (before command dialog is fired or tab is pressed in shell)
    * 
    * @param context
    */
   public void contextInitialized(UIContext context);

   /**
    * Invoked after the interaction takes place. Fired after all {@link CommandExecutionListener}
    * 
    * @param context
    */
   public void contextDestroyed(UIContext context);
}
