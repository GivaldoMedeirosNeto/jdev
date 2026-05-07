package Enviando_Email;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import Config.ConfigServEmail;
import Config.Email;

public class ObjEnviarEmail {
	
	private String emails = "";
	private String nome = "";
	private String assunto = "";
	private String mensagem = "";
	private Email email;
	
	public ObjEnviarEmail(String emails, String nome, String assunto, String mensagem) {
		this.emails = emails;
		this.nome = nome;
		this.assunto = assunto;
		this.mensagem = mensagem;
	}
	
	public void enviar(String tipo) throws Exception {
		
		/* Configurar SMTP do email */		
		Properties config = new Properties();
		// Autorização
		config.put("mail.smtp.auth", "true");
		// Autenticação
		config.put("mail.smtp.starttls", "true");
		// Classe conexao SMTP
		config.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		// Segurança SSL
		config.put("mail.smtp.ssl.trust", "*");
		
		if (tipo == ConfigServEmail.GMAIL) {
			email = ConfigServEmail.gmail();			
		}
		
		if (tipo == ConfigServEmail.GSMN) {
			email = ConfigServEmail.gsmn();
		}
		
		/* Infelizmente o OUTLOOK bloqueia o envio por aplicativos em conta pessoal.
		 * if (tipo == ConfigServEmail.OUTLOOK) {
			email = ConfigServEmail.outlook();
		}*/
		
		// Servidor 
		config.put("mail.smtp.host", email.getHost());
		// Porta de Acesso
		config.put("mail.smtp.port", email.getPort());
		// Expecifica a porta a ser conectada
		config.put("mail.smtp.socketFactory.port", email.getFactory());
		
		Session session = Session.getDefaultInstance(config, new Authenticator() {			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication(email.getUser(), email.getPass());
			}
		});
		
		Address[] address = InternetAddress.parse(emails);
		Message msg = new MimeMessage(session);
		
		// Quem está enviando
		msg.setFrom(new InternetAddress(email.getUser(), nome));
		// Email(s) de Destino(s)
		msg.setRecipients(Message.RecipientType.TO, address);
		// Assunto do Email
		msg.setSubject(assunto);
		// Corpo do Email
		msg.setText(mensagem);
		// Ativando o formato HTML no corpo do Email
		msg.setContent(mensagem, "text/html; charset=utf-8");
		
		Transport.send(msg);
		
	}

	public void anexo(String tipo) throws Exception {
		
		/* Configurar SMTP do email */		
		Properties config = new Properties();
		// Autorização
		config.put("mail.smtp.auth", "true");
		// Autenticação
		config.put("mail.smtp.starttls", "true");
		// Classe conexao SMTP
		config.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		// Segurança SSL
		config.put("mail.smtp.ssl.trust", "*");
		
		if (tipo == ConfigServEmail.GMAIL) {
			email = ConfigServEmail.gmail();			
		}
		
		if (tipo == ConfigServEmail.GSMN) {
			email = ConfigServEmail.gsmn();
		}
		
		/* Infelizmente o OUTLOOK bloqueia o envio por aplicativos em conta pessoal.
		 * if (tipo == ConfigServEmail.OUTLOOK) {
			email = ConfigServEmail.outlook();
		}*/
		
		// Servidor 
		config.put("mail.smtp.host", email.getHost());
		// Porta de Acesso
		config.put("mail.smtp.port", email.getPort());
		// Expecifica a porta a ser conectada
		config.put("mail.smtp.socketFactory.port", email.getFactory());
		
		Session session = Session.getDefaultInstance(config, new Authenticator() {			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {				
				return new PasswordAuthentication(email.getUser(), email.getPass());
			}
		});
		
		Address[] address = InternetAddress.parse(emails);
		Message msg = new MimeMessage(session);
		
		// Quem está enviando
		msg.setFrom(new InternetAddress(email.getUser(), nome));
		// Email(s) de Destino(s)
		msg.setRecipients(Message.RecipientType.TO, address);
		// Assunto do Email
		msg.setSubject(assunto);
		// Corpo do Email
		msg.setText(mensagem);
		
		MimeBodyPart corpoEmail = new MimeBodyPart();
		
		// Ativando o formato HTML no corpo do Email
		corpoEmail.setContent(mensagem, "text/html; charset=utf-8");
		
		MimeBodyPart anexo = new MimeBodyPart();
		anexo.setDataHandler(
			new DataHandler(
				new ByteArrayDataSource(
					simuladorPDF(),
					"application/pdf"
				)
			)
		);
		
		anexo.setFileName("Aula20_anexo.pdf");
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(corpoEmail);
		multipart.addBodyPart(anexo);
		
		msg.setContent(multipart);
		
		Transport.send(msg);
	}
	
	/* Simulador de envio anexo no sistema
	 * Neste está criando um PDF generico */
	private FileInputStream simuladorPDF() throws Exception {
		Document document = new Document();
		File file = new File("Aula 20 - Anexos.pdf");
		
		file.createNewFile();
		PdfWriter.getInstance(document, new FileOutputStream(file));
		document.open();
		document.add(new Paragraph("Aula 20"));
		document.add(new Paragraph("Envio de Anexos com Java Mail."));
		document.add(new Paragraph("Arquivo gerando dentro do sistema."));
		document.close();
		
		return new FileInputStream(file);
	}
}
