package main.webapp.test.AutoWire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Logger {

	private FileWriter fileWriter;
	private LoggerSupport consoleWriter;

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	/*
	 * @Autowired
	 * 
	 * @Qualifier("filewriter")
	 */
	// @Resource(name="squirrel")
	/*
	 * @Inject
	 * 
	 * @Named(value="squirrel")
	 */

	@Inject
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public LoggerSupport getConsoleWriter() {
		return consoleWriter;
	}

	// Spring style
	/*
	 * @Autowired
	 * 
	 * @Qualifier("consolewriter")
	 */

	// JSR 250 2006
	// @Resource

	// JSR 330 2009
	@Inject
	@Named(value = "newsquirrel")
	public void setConsoleWriter(LoggerSupport consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void writeFile() {
		if (fileWriter != null)
			fileWriter.write();
	}

	public void writeConsole() {

		consoleWriter.write();
	}

	@PostConstruct
	public void init() {

		System.out.println("init");
	}

	@PreDestroy
	public void destroy() {

		System.out.println("destroy");
	}

	/*
	 * 
	 * private FileWriter fileWriter; private ConsoleWriter consoleWriter;
	 * 
	 * public FileWriter getFileWriter() { return fileWriter; } public void
	 * setFileWriter(FileWriter fileWriter) { this.fileWriter = fileWriter; }
	 * public ConsoleWriter getConsoleWriter() { return consoleWriter; } public
	 * void setConsoleWriter(ConsoleWriter consoleWriter) { this.consoleWriter =
	 * consoleWriter; }
	 * 
	 * 
	 * 
	 * //private LoggerSupport fileWriter; //private LoggerSupport
	 * consoleWriter;
	 * 
	 * 
	 * // @Autowired //here it can instantiate a private member without setter
	 * method private FileWriter fileWriter;
	 * 
	 * // @Autowired private ConsoleWriter consoleWriter;
	 * 
	 * public FileWriter getFileWriter() { return fileWriter; }
	 * 
	 * //@Autowired public void setFileWriter(FileWriter fileWriter) {
	 * this.fileWriter = fileWriter; }
	 * 
	 * public ConsoleWriter getConsoleWriter() { return consoleWriter; }
	 * 
	 * @Autowired public void setConsoleWriter(ConsoleWriter consoleWriter) {
	 * this.consoleWriter = consoleWriter; } public Logger(){
	 * 
	 * }
	 * 
	 * @Autowired(required=false) public Logger(FileWriter fileWriter) {
	 * this.fileWriter = fileWriter; // this.consoleWriter =
	 * consoleWriter;//Mixing constructor autowiring and property autowiring }
	 * 
	 * 
	 * public void writeFile(){ if(fileWriter!=null) fileWriter.write(); }
	 * 
	 * 
	 * public void writeConsole(){
	 * 
	 * consoleWriter.write(); }
	 */
}
