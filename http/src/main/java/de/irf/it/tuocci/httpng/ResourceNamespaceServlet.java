/*
 * This file is part of tuOCCI.
 *
 *     tuOCCI is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as
 *     published by the Free Software Foundation, either version 3 of
 *     the License, or (at your option) any later version.
 *
 *     tuOCCI is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with tuOCCI.  If not, see <http://www.gnu.org/licenses/>.
 */

// $Id$ //

package de.irf.it.tuocci.httpng;

import de.irf.it.tuocci.httpng.resources.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * TODO: not yet commented.
 *
 * @author <a href="mailto:alexander.papaspyrou@tu-dortmund.de>Alexander
 *         Papaspyrou</a>
 * @version $Revision$ (as of $Date$)
 */
public class ResourceNamespaceServlet
        extends HttpServlet {

    private Map<String, Collection> pathToCollectionMap;

    private Map<String, Entity> pathToEntityMap;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        if(req.getPathInfo().endsWith("/")){
            // handle collection resource

            // TODO: implement filtering

            // TODO: locate collection for requested location

            // TODO: return results, depending on requested MIME type.
            MediaType mt = MediaType.parseFrom(req.getHeader("Accept"));
            switch (mt) {
                case TEXT_URILIST:

                    break;
                case TEXT_PLAIN:
                    break;
                case TEXT_OCCI:
                    break;
                default:
                    // TODO: decide on default
            }

        }
        else {
            // handle entity resource
        }
        PrintWriter out = resp.getWriter();
        out.println("tuOcci ResourceNamespaceServlet Executed (Path: " + req.getPathInfo() + ")");
        out.flush();
        out.close();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPut(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        super.doDelete(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }

}
