/**********************************************************************************
*
* Header:
*
***********************************************************************************
*
 * Copyright (c) 2003, 2004, 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*
**********************************************************************************/


package org.sakaiproject.jsf.renderer;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

/**
 * <p>ToolBarSpacerRenderer is an HTML renderer for the Sakai ToolBarSpacer tag in JSF.</p>
 * <p>This does not render children, but can deal with children by surrounding them in a comment.</p>
 *
 * @author University of Michigan, Sakai Software Development Team
 * @version $Revision$
 */
public class ToolBarSpacerRenderer extends Renderer
{
  public boolean supportsComponentType(UIComponent component)
  {
    return (component instanceof org.sakaiproject.jsf.component.ToolBarSpacerComponent);
  }

  public void encodeBegin(FacesContext context, UIComponent component) throws IOException
  {
    ResponseWriter writer = context.getResponseWriter();
    writer.write("<span class=\"chefToolBarDisabled\">&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;</span>");

    return;
  }

  public void encodeEnd(FacesContext context, UIComponent component) throws IOException
  {
  }

  public boolean getRendersChildren()
  {
    return false;
  }
}



