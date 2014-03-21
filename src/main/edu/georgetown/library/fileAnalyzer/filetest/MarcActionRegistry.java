package edu.georgetown.library.fileAnalyzer.filetest;

import gov.nara.nwts.ftapp.FTDriver;
import gov.nara.nwts.ftapp.filetest.ActionRegistry;
/** 
 * Initialize the File Analzyer with generic image processing rules (but not NARA specific business rules)
 * @author TBrady
 *
 */
public class MarcActionRegistry extends ActionRegistry {
	
	private static final long serialVersionUID = 1L;

	public MarcActionRegistry(FTDriver dt, boolean modifyAllowed) {
		super(dt, modifyAllowed);
	}
	
}
