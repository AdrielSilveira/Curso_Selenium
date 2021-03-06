package Ferramentas;

import elementos.InProjeto;
import elementos.InicioProjeto;
import elementos.Login;
import elementos.SheduleNetworkDiagram;

public class OperacoesDriver extends Driver {

	public OperacoesDriver() {
		super();
	}

	public void fazLogin(String email, String senha) throws InterruptedException {
		Thread.sleep(500);
		sendKeys(email, Login.email);
		sendKeys(senha, Login.senha);
		click(Login.login);
		Thread.sleep(500);
	}

	public void abreProjeto1() {
		click(InicioProjeto.AbrirProjeto1);
	}

	public void abreScheduleNetworkDiagram() {
		click(InProjeto.SheNetDiag);
	}

	public void scheduleNetworkDiagram_Edit(String tex1, String tex2, String tex3, String tex4)
			throws InterruptedException {
		click(SheduleNetworkDiagram.Edit);

		limpaTexto(SheduleNetworkDiagram.EditTxt1);
		sendKeys(tex1, SheduleNetworkDiagram.EditTxt1);

		limpaTexto(SheduleNetworkDiagram.EditTxt2);
		sendKeys(tex2, SheduleNetworkDiagram.EditTxt2);

		limpaTexto(SheduleNetworkDiagram.EditTxt3);
		sendKeys(tex3, SheduleNetworkDiagram.EditTxt3);

		limpaTexto(SheduleNetworkDiagram.EditTxt4);
		sendKeys(tex4, SheduleNetworkDiagram.EditTxt4);
		Thread.sleep(500);

		click(SheduleNetworkDiagram.EditSubmit);
	}

	public void scheduleNetworkDiagram_EditExcecao() {
		click(SheduleNetworkDiagram.Edit);
		limpaTexto(SheduleNetworkDiagram.EditTxt1);
		limpaTexto(SheduleNetworkDiagram.EditTxt2);
		limpaTexto(SheduleNetworkDiagram.EditTxt3);
		limpaTexto(SheduleNetworkDiagram.EditTxt4);
		click(SheduleNetworkDiagram.EditSubmit);
	}

	public void scheduleNetworkDiagram_Upload(String texto, String caminhoImagem) throws InterruptedException {
		click(SheduleNetworkDiagram.Upload);
		Thread.sleep(1000);
		sendKeys(texto, SheduleNetworkDiagram.UploadName);
		sendKeys(caminhoImagem, SheduleNetworkDiagram.UploadArquivo);
		click(SheduleNetworkDiagram.UploadSave);
	}
	
	public void scheduleNetworkDiagram_ExcluiImagem() {
		click(SheduleNetworkDiagram.ExcluiImagem);
	}
	
	public void scheduleNetworkDiagram_UploadExcecao() throws InterruptedException {
		click(SheduleNetworkDiagram.Upload);
		Thread.sleep(1000);
		click(SheduleNetworkDiagram.UploadSave);
	}

}
