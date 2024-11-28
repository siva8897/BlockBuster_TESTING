package BlockBusterLoginCombinations;

import java.util.HashMap;
import java.util.Map;

public class BlockBusterloginDetials {

	public Map<String, String> LoginCombinations() {

		HashMap<String, String> items = new HashMap<String, String>();

		// AdminPortal-User login
		items.put("admin", "rocasuperuser/Welcome_1!");

		items.put("rocaUser", "rocauser/Welcome_1!");

		// Representative Portal User login-

		items.put("raAdmin", "raadmin/Welcome_1!");

		items.put("raUser", "rauser/Welcome_1!");

		items.put("raPractitioner", "rapractitioner/Welcome_1!");

		items.put("raReceiver", "rareceiver/Welcome_1!");

		return items;

	}
}