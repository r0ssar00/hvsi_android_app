package ca.hvsi.lib;
import org.joda.time.*;
public class Account extends Resolvable {
	public String username;
	public String name;
	public String email;
	public String language;
	public DateTime creation_time;
	public String toString() {
		return String.format("<Account id=%d username=%s name=%s email=%s language=%s creation_time=%s>", id, username, name, email, language, creation_time.toString());
	}
}
