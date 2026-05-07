package Enviando_Email;

import org.junit.Test;

import Config.ConfigServEmail;

public class AppTest {
	
	private String emails = ConfigServEmail.EMAILS;
	private String nome = "GSMN";
	private String assunto = "[HOMOLOG] Teste de e-mail automático - Sistema Java";
	private String tipoEmail = ConfigServEmail.GSMN;
	
	@Test
	public void testeEmail() throws Exception{
		
		ObjEnviarEmail ObjSendMail = new ObjEnviarEmail(emails,nome,assunto,corpoEmail());
		ObjSendMail.enviar(tipoEmail);
		System.out.println("Email enviando com sucesso");
		ObjSendMail.anexo(tipoEmail);
		System.out.println("Anexo enviando com sucesso");
	}
	
	public String corpoEmail() {
		
		String ambiente = "HOMOLOG";
		String email = tipoEmail;
		String dataHora = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		String corpoEmail = String.format("""
			<html>
		        <body>
		            <p>Prezado,</p>
		            <p>Este é um e-mail de teste enviado automaticamente por uma aplicação Java.</p>
		            <p><strong>Detalhes do Envio:</strong><br>
		            - Ambiente: %s<br>
		            - Tipo de Email: %s<br>
		            - Data/Hora: %s<br>
		            <p>Caso este e-mail tenha sido recebido corretamente, a funcionalidade de envio encontra-se operacional.</p>
		            <p>Atenciosamente,<br><a href="https://gsmn.dev.br"">GSMN</a></p>
		        </body>
	        </html>
		        """, ambiente, email, dataHora);
		
		return corpoEmail;
		
	}
	
}