/* A threaded server.
 Two classes are now used together with the Runnable Interface.

 The first class (Connection) is threaded and handles the
 reading and writing between the clients.

 The second class ThreadedServer creates the database and starts the threads
 as clients try to connect.

 27th March 02
 */

import java.io.*;
import java.util.*;
import java.net.*;

class ConnectionCJB implements Runnable {

	private Socket s;
	private Hashtable names;

	ConnectionCJB(Socket s, Hashtable names) {
		this.s = s;
		this.names = names;
	}

	public void run() {
		// Streams definition for connection
		InputStream is = null;
		OutputStream os = null;

		// Writers and readers for communication
		PrintWriter pw = null;
		BufferedReader br = null;

		String lineRead = ""; // String read form client
		Object o; // Used for assessing the Hashtable
		String reply = ""; // Reply to be sent to the client

		// Get Streams for the particular Socket
		try {
			is = s.getInputStream();
			os = s.getOutputStream();
			pw = new PrintWriter(os, true);
			br = new BufferedReader(new InputStreamReader(is));
			System.out.println("CJB System set up");

			// Read and process names until the client tells the server
			// the sevice is no longer required.
			lineRead = "";
			while (true) {
				lineRead = br.readLine();
				if (lineRead.equals("Exit"))
					break;
				o = names.get(lineRead);
				if (o == null)
					reply = "User not known";
				else
					reply = (String) o;
				pw.println(reply);
			}
			pw.close();
			br.close();
			is.close();
			os.close();
			System.out.println("Closed down");
		} catch (IOException e) {
			System.out.println("Trouble with connection to client" + e);
		}
	}
}
