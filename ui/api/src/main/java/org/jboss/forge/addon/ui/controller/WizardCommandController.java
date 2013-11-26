/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.ui.controller;

import org.jboss.forge.addon.ui.UICommand;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface WizardCommandController extends CommandController
{
   /**
    * Returns the current {@link UICommand} based on the navigation
    */
   public UICommand getCurrentCommand();

   /**
    * Is it possible to navigate to the next page ?
    */
   public boolean canFlipToNextPage();

   /**
    * Is it possible to navigate to the previous page ?
    * 
    */
   public boolean canFlipToPreviousPage();

   /**
    * Navigate to the next page. Throws {@link IllegalStateException} if navigation is not possible
    */
   public UICommand next() throws IllegalStateException;

   /**
    * Navigate to the previous visited page
    */
   public UICommand previous() throws IllegalStateException;
}
