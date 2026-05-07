package Config;

public class ConfigServEmail {
	
	private static Email email;
	public static String EMAILS = "gsmn.dev@gmail.com, gsmn.dev@outlook.com, givaldo@gsmn.dev.br";
	/* GSMN */
	public static String GSMN = "GSMN";
	/* GMAIL */
	public static String GMAIL = "GMAIL";	
	/* OUTLOOK */
	public static String OUTLOOK = "OUTLOOK";


	public static Email gsmn() {
		email = new Email();
		email.setUser("financeiro@gsmn.dev.br");
		email.setPass("+wW?8%}32uR3Kw@#");
		email.setHost("gsmn.dev.br");
		email.setPort("587");
		email.setFactory("TLSv1.2");
		
		return email;
	}
	
	public static Email gmail() {
		email = new Email();
		email.setUser("gsmn.dev@gmail.com");
		email.setPass("zwco togm bfzn wrzk");
		email.setHost("smtp.gmail.com");
		email.setPort("465");
		email.setFactory("465");
		
		return email;
	}
	
	/* Infelizmente o OUTLOOK bloqueia o envio por aplicativos em conta pessoal.
	public static Email outlook() {
		email = new Email();
		email.setUser("gsmn.dev@outlook.com");
		email.setPass("nuwoltyblrrnrtgv");
		email.setHost("smtp.office365.com");
		email.setPort("587");
		email.setFactory("TLSv1.2");
		
		return email;
	}*/
	
}
