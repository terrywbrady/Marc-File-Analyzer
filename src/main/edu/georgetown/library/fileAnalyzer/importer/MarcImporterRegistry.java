package edu.georgetown.library.fileAnalyzer.importer;

import gov.nara.nwts.ftapp.FTDriver;
import gov.nara.nwts.ftapp.importer.ImporterRegistry;


/**
 * Activates the Importers that will be presented on the Import tab.
 * @author TBrady
 *
 */
public class MarcImporterRegistry extends ImporterRegistry {
	
	private static final long serialVersionUID = 1L;

	public MarcImporterRegistry(FTDriver dt) {
		super(dt);
		add(new MarcRecValidator(dt));
	}
	

}
