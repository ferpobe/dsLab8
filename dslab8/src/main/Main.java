package main;
import java.io.*;

import encuesta.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Encuesta encuesta = new Encuesta("�Est� a favor de la energia nuclear?");

		UserInterface userInterface = new UserInterface();
		userInterface.rellena(encuesta);
	}

}

