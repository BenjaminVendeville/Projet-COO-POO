/*package Frame ;

import java.io.File;
import java.io.IOException;

import userGestion.*;
import messageGestion.*;


public class Session {
	private User LocalUser;
	private User DistantUser;
	private History SessionHistory;
	private SessionFrame SessionFrame;
	
	public Session(User LocalUser, User DistantUser, History SessionHistory) throws IOException
	{
		this.LocalUser = LocalUser;
		this.DistantUser = DistantUser;
		fetchHistory();
	}
	
	private void fetchHistory() throws IOException
	{
		File file = new File("../Historique/" + this.DistantUser.getUserIP() + ".txt");
		
	}

}
*/