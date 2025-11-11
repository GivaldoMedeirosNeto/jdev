package send_email;

public class AppTest {

	@org.junit.Test
	public void testeEmail() throws Exception {
		
		StringBuilder mensagem = new StringBuilder();
		
		mensagem.append("Olá, <br/><br/>");
		mensagem.append("Você está recebendo um e-mail de teste da aplicação interna.<br/><br/>");
		mensagem.append("Esse email é só um teste de envio não precisa retorna.<br/><br/>");
		mensagem.append("<a target=\"_bank\" href=\"ibisnatal.com.br\">Link</a> ");
		
		ObjSendMail ObjSendMail = new ObjSendMail(
			"givaldo.ctinf@outlook.com",
			"Nome da Pesoa",
			"Testando envio",
			mensagem.toString()
		);
		
		ObjSendMail.enviar(true);
		ObjSendMail.enviarAnexo(true);
		
	}
	
}
