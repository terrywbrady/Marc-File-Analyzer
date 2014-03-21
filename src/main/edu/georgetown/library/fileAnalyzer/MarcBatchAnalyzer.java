package edu.georgetown.library.fileAnalyzer;

import edu.georgetown.library.fileAnalyzer.filetest.MarcActionRegistry;
import edu.georgetown.library.fileAnalyzer.importer.MarcImporterRegistry;

import gov.nara.nwts.ftapp.BatchAnalyzer;
import gov.nara.nwts.ftapp.FTDriver;
import gov.nara.nwts.ftapp.filetest.ActionRegistry;
import gov.nara.nwts.ftapp.importer.ImporterRegistry;
/**
 * Driver for the File Analyzer GUI loading image-specific rules but not NARA specific rules.
 * @author TBrady
 *
 */
public class MarcBatchAnalyzer extends BatchAnalyzer {

	public MarcBatchAnalyzer() {
		super();
	}
	
	public ActionRegistry getActionRegistry(FTDriver ft) {
		return new MarcActionRegistry(ft, true);
	}

	protected ImporterRegistry getImporterRegistry(FTDriver ft) {
		return new MarcImporterRegistry(ft);
	}
	public static void main(String[] args) {
		MarcBatchAnalyzer ba = new MarcBatchAnalyzer();
		ba.run(args);
	}

}
