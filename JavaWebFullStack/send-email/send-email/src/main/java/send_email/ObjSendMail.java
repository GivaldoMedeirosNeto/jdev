package send_email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ObjSendMail {
	
	private String user = "ibis.oliveira.wolney@gmail.com";
	private String pass = "oatf mgdi gqwp qpqm";
	
	private String emails = "";
	private String nome = "";
	private String assunto = "";
	private String mensagem = "";
	
	public ObjSendMail(String emails, String nome, String assunto, String mensagem) {
		this.emails = emails;
		this.nome = nome;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}
	
	public void enviar(boolean html) throws Exception {
		
		/* Configurar SMTP do email */		
		Properties config = new Properties();
		// Autorização
		config.put("mail.smtp.auth", "true");
		// Autenticação
		config.put("mail.smtp.starttls", "true"); 
		// Servidor gmail Google
		config.put("mail.smtp.host", "smtp.gmail.com"); 
		// Porta de Acesso
		config.put("mail.smtp.port", "465"); 
		// Expecifica a porta a ser conectada
		config.put("mail.smtp.socketFactory.port", "465");
		// Classe conexao SMTP
		config.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		// Segurança SSL
		config.put("mail.smtp.ssl.trust", "*");
		
		Session session = Session.getInstance(config, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, pass);
			}
		});
		
		Address[] toUser = InternetAddress.parse(emails);
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(user, nome));
		msg.setRecipients(Message.RecipientType.TO, toUser);
		msg.setSubject(assunto);
		
		if(html) {
			msg.setContent(mensagem, "text/html; charset=utf-8");					
		} else {
			msg.setText(mensagem);
		}
		
		Transport.send(msg);
		System.out.println("Email enviado com sucesso.");
		
	}

}
