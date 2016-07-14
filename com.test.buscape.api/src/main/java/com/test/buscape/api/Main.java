package com.test.buscape.api;

import java.util.Properties;
import java.util.Scanner;

import com.test.buscape.api.controller.CommandContoller;
import com.test.buscape.api.core.AppCore;

/**
 * Classe de execução do app
 * @author tbdea
 *
 */
public class Main {

	public static void main(String[] args) {
		AppCore core = AppCore.getInstance();
		Properties props = core.getProperties();

		while(true) {			
			try {
				System.out.println(props.getProperty("buscape.label.filepath.input"));
				Scanner commandInput = new Scanner(System.in);
				if(commandInput.hasNext()) {
					String commandLine = commandInput.nextLine().trim();					
					CommandContoller commandContoller = new CommandContoller();
					commandContoller.processCommand(commandLine);;
				}
				commandInput.close();
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(props.getProperty("buscape.label.filepath.error"));
				continue;
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
