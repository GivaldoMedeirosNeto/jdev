<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
	
	<jsp:include page="head.jsp"></jsp:include>
	
	<body>
		
		<jsp:include page="theme-loader.jsp"></jsp:include>
		
		<div id="pcoded" class="pcoded">
			
			<div class="pcoded-overlay-box"></div>
			
			<div class="pcoded-container navbar-wrapper">
					
				<jsp:include page="navbar.jsp"></jsp:include>
				
				<div class="pcoded-main-container">
					
					<div class="pcoded-wrapper">
							
						<jsp:include page="main-menu.jsp"></jsp:include>
						
						<div class="pcoded-content">
							
							<jsp:include page="page-header.jsp"></jsp:include>
							
							<div class="pcoded-inner-content">
							
								<div class="main-body">
								
									<div class="page-wrapper">
									
										<div class="page-body">
										
											<div class="row">
											
                                            	<div class="col-md-10"> 
                                            	                                          	
                                            		<span id="msg" class="form-bar">${msg}</span>
                                            		
                                            		<div class="card">
                                            		
	                                                    <div class="card-header">
	                                                        <h5>Cadastro de Usuários</h5><!--<span>Add class of <code>.form-control</code> with <code>&lt;input&gt;</code> tag</span>-->
	                                                    </div>
	                                                    
	                                                    <div class="card-block">
	                                                    
	                                                        <form class="form-material" method="post" id="formUsuario"
	                                                        	action="<%= request.getContextPath()%>/ServletUsuario">
	                                                        	
	                                                        	<input type="hidden" name="acao" id="acao" value="">
	                                                        	
	                                                        	<div class="form-group form-default">
	                                                                <input type="text" class="form-control"
	                                                                	name="idUsuario" id="idUsuario" value="${modelUsuario.idUsuario}">
	                                                                <span class="form-bar"></span>
	                                                                <label class="float-label">ID</label>
	                                                            </div>
	                                                        
	                                                            <div class="form-group form-default">
	                                                                <input type="text" class="form-control" required=""
	                                                                	name="nome" id="Nome" value="${modelUsuario.nome}">
	                                                                <span class="form-bar"></span>
	                                                                <label class="float-label">Nome</label>
	                                                            </div>
	                                                            
	                                                            <div class="form-group form-default">
	                                                                <input type="email" class="form-control"
	                                                                	name="email" id="email" value="${modelUsuario.email}" >
	                                                                <span class="form-bar"></span>
	                                                                <label class="float-label">Email (exa@gmail.com)</label>
	                                                            </div>
	                                                            
	                                                            <div class="form-group form-default">
	                                                                <input type="text" class="form-control" required="required" autocomplete="off"
	                                                                	name="login" id="login" value="${modelUsuario.login}">
	                                                                <span class="form-bar"></span>
	                                                                <label class="float-label">Login</label>
	                                                            </div>
	                                                            
	                                                            <div class="form-group form-default">
	                                                                <input type="password" class="form-control" required="required" autocomplete="off"
	                                                                	name="pass" id="pass" value="${modelUsuario.pass}">
	                                                                <span class="form-bar"></span>
	                                                                <label class="float-label">Password</label>
	                                                            </div>
	                                                            
	                                                            <div class="form-group form-default">
	                                                                <textarea class="form-control" name="obs" id="obs">${modelUsuario.obs}</textarea>
	                                                                <span class="form-bar"></span>
	                                                                <label class="float-label">Observação</label>
	                                                            </div>
	                                                            
	                                                            <button class="btn waves-effect waves-light btn-primary btn-outline-primary"
	                                                            	onclick="limparForm();" type="button">
																	<i class="icofont icofont-user-alt-3"></i>Limpar
																</button>
	                                                            
	                                                            <button class="btn waves-effect waves-light btn-primary btn-outline-primary">
																	<i class="icofont icofont-user-alt-3"></i>Cadastrar
																</button>
																
	                                                            <button class="btn waves-effect waves-light btn-primary btn-outline-primary"
	                                                            	onclick="deletar();" type="button">
																	<i class="icofont icofont-user-alt-3"></i>Excluir
																</button>
																
																<button class="btn waves-effect waves-light btn-primary btn-outline-primary"
	                                                            	onclick="deletarAjax();" type="button">
																	<i class="icofont icofont-user-alt-3"></i>Excluir Ajax
																</button>
																
																<button class="btn waves-effect waves-light btn-primary btn-outline-primary"
																	type="button" data-toggle="modal" data-target="#modalPesUser" >
																	<i class="icofont icofont-user-alt-3"></i>Pesquisar
																</button>
																
	                                                        </form>
	                                                        
	                                                    </div>
	                                                    
                                                	</div>
			                                        
                                            	</div>                                            	
                                            	                                           
                                        	</div>
											
										</div>
										
									</div>
									
									<div id="styleSelector"></div>
									
								</div>
							
							</div>
							
						</div>
						
					</div>
					
				</div>
				
			</div>
			
		</div>
		
		<jsp:include page="javascript.jsp"></jsp:include>
		
		<script type="text/javascript">
		
			function limparForm() {				
				var elementos = document.getElementById("formUsuario").elements;
				for(p=0; p < elementos.length; p++){
					elementos[p].value = '';
				}
				 document.getElementById("msg").innerHTML = '';
			}
			
			function deletar() {
				if(confirm('Deseja excluir o usuário?')){
					document.getElementById("formUsuario").method = 'get';
					document.getElementById("acao").value = 'deletar';
					document.getElementById("formUsuario").submit();
				}				
			}
			
			function deletarAjax() {
				if(confirm('Deseja excluir o usuário?')){
					
					var urlAction = document.getElementById("formUsuario").action;
					var idUsuario = document.getElementById("idUsuario").value;
					
					$.ajax({
						
						method: "get",
						url: urlAction,
						data: "idUsuario=" + idUsuario + "&acao=deletarAjax",
						success: function(response){
							alert('Deletado com sucesso.');
							document.getElementById('msg').textContent = response;
						}
						
					}).fail(function(xhr, status, errorThrown){
						alert('Erro ao deletar o usuário: ' + xhr.responseText);
					});
					
				}
			}
			
			function buscarUsuario() {
				
				var nomeP = document.getElementById("buscaNome").value;
				var urlAction = document.getElementById("formUsuario").action;
				
				if(nomeP != null && nomeP != '' && nomeP.trim() != ''){
						$.ajax({
						
						method: "get",
						url: urlAction,
						data: "nome=" + nomeP + "&acao=pesquisarAjax",
						success: function(response){
							alert('Usuarios.');
						}
						
					}).fail(function(xhr, status, errorThrown){
						alert('Erro ao pesquisar o usuário: ' + xhr.responseText);
					});
				}
				
				
				
			}
		
		</script>
		
		<!-- Modal -->
		<jsp:include page="modalPesquisa.jsp"></jsp:include>
		
	</body>

</html>
