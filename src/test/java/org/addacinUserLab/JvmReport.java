package org.addacinUserLab;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\ReportJvm");
		Configuration con = new Configuration(f, "fb");
		con.addClassifications("platform name", "Windows 10");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser version", "89.0");
		con.addClassifications("project working", "adatcinHotel");
		List<String> list = new ArrayList<String>();
		list.add(jsonpath);
		ReportBuilder r = new ReportBuilder(list, con);
		r.generateReports();
	}

}
