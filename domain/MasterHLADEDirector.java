/* The DE domain director.

 Copyright (c) 1998-2008 The Regents of the University of California.
 All rights reserved.
 Permission is hereby granted, without written agreement and without
 license or royalty fees, to use, copy, modify, and distribute this
 software and its documentation for any purpose, provided that the above
 copyright notice and the following two paragraphs appear in all copies
 of this software.

 IN NO EVENT SHALL THE UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY
 FOR DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES
 ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
 THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.

 THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY WARRANTIES,
 INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
 PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
 CALIFORNIA HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES,
 ENHANCEMENTS, OR MODIFICATIONS.

 PT_COPYRIGHT_VERSION_2
 COPYRIGHTENDKEY
 */
package ptolemy.myactors.Simple.domain;

import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;
import ptolemy.kernel.util.Workspace;
import ptolemy.myactors.Simple.MasterFederate;

//////////////////////////////////////////////////////////////////////////
//// DEDirector

/**
 

 @author adaptaed by Alisson Brito
 @version $Id: DEDirector.java,v 1.324.4.2 2008/03/25 23:11:41 cxh Exp $
 @since Ptolemy II 0.2
 @Pt.ProposedRating Green (hyzheng)
 @Pt.AcceptedRating Yellow (hyzheng)
 */
public class MasterHLADEDirector extends HLADEDirector{
	
	
	private static final long serialVersionUID = 1L;
	

	/** Construct a director in the default workspace with an empty string
	 *  as its name. The director is added to the list of objects in
	 *  the workspace. Increment the version number of the workspace.
	 */
	public MasterHLADEDirector() {
		
		super();
		rtiFederation = new MasterFederate();
	}

	/** Construct a director in the workspace with an empty name.
	 *  The director is added to the list of objects in the workspace.
	 *  Increment the version number of the workspace.
	 *  @param workspace The workspace of this object.
	 */
	public MasterHLADEDirector(Workspace workspace) {
		super(workspace);
		rtiFederation = new MasterFederate();
	}

	/** Construct a director in the given container with the given name.
	 *  The container argument must not be null, or a
	 *  NullPointerException will be thrown.
	 *  If the name argument is null, then the name is set to the
	 *  empty string. Increment the version number of the workspace.
	 *  @param container Container of the director.
	 *  @param name Name of this director.
	 *  @exception IllegalActionException If the
	 *   director is not compatible with the specified container.
	 *  @exception NameDuplicationException If the container not a
	 *   CompositeActor and the name collides with an entity in the container.
	 */
	public MasterHLADEDirector(CompositeEntity container, String name)
			throws IllegalActionException, NameDuplicationException {
		super(container, name);
		rtiFederation = new MasterFederate();
		
	}
}
