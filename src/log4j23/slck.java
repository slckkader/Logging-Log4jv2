package log4j23;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class slck {

	private final static Logger LOGGER = LogManager.getLogger(slck.class.getName());

	public static void main(String[] args) {

		LOGGER.debug("Debug Message Logged !!!");
		LOGGER.info("Info Message Logged !!!");
		LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
	}
}
