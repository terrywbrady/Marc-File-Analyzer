package edu.georgetown.library.fileAnalyzer;

import java.io.File;

import edu.georgetown.library.fileAnalyzer.filetest.MarcActionRegistry;
import edu.georgetown.library.fileAnalyzer.importer.MarcImporterRegistry;

import gov.nara.nwts.ftapp.filetest.ActionRegistry;
import gov.nara.nwts.ftapp.gui.DirectoryTable;
import gov.nara.nwts.ftapp.importer.ImporterRegistry;
/**
 * Driver for the File Analyzer GUI loading image-specific rules but not NARA specific rules.
 * @author TBrady
 *
 */
public class MarcFileAnalyzer extends DirectoryTable {

	public MarcFileAnalyzer(File f, boolean modifyAllowed) {
		super(f, modifyAllowed);
		this.title = "Marc File Analyzer";
		this.message = "Illustrates extensions to the file analzyer.";
		this.refreshTitle();
		
	}
	
	protected ActionRegistry getActionRegistry() {
		return new MarcActionRegistry(this, modifyAllowed);
	}

	protected ImporterRegistry getImporterRegistry() {
		return new MarcImporterRegistry(this);
	}
	public static void main(String[] args) {
		if (args.length > 0)
			new MarcFileAnalyzer(new File(args[0]), false);		
		else
			new MarcFileAnalyzer(null, false);		
	}

}
