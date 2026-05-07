<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!-- Modal Cadastro Usuario -->"
<div class="modal fade" id="modalCadUser" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">

	<div class="modal-dialog" role="document">
	
		<div class="modal-content">
		
			<div class="card">
	
				<div class="card-header">
					<h5>Novo Usuário</h5>
				</div>
				
				<div class="card-block">
			
					<form class="form-material" method="post" id="formUserCad" action="<%= request.getContextPath()%>/ServletUsuario" >
			
						<input type="hidden" name="acao" id="acao" value="">
						
						<div class="form-group form-default">			
							<input type="text" name="nome"  id="nome" class="form-control" required="">
							<span class="form-bar"></span>
							<label class="float-label">Nome</label>
						</div>
						
						<div class="form-group form-default">
							<input type="email" name="email" id="email"class="form-control">
							<span class="form-bar"></span>
							<label class="float-label">Email (exemplo@gmail.com)</label>
						</div>
						
						<div class="form-group form-default">
							<input type="text" name="login" id="login" class="form-control" required="" >
							<span class="form-bar"></span>
							<label class="float-label">Login</label>
						</div>
			
						<div class="form-group form-default">
							<input type="password" name="pass" id="pass" class="form-control" required="">
							<span class="form-bar"></span>
							<label class="float-label">Password</label>
						</div>
						
						<div class="form-group form-default">
							<textarea class="form-control" name="obs" id="obs"></textarea>
							<span class="form-bar"></span>
							<label class="float-label">Observações</label>
						</div>
						
						<div class="modal-footer">
						
							<button class="btn waves-effect waves-light btn-primary btn-outline-primary">
								<i class="icofont icofont-user-alt-3"></i>Cadastrar
							</button>
							
							<button type="button" data-dismiss="modal"
								class="btn waves-effect waves-light btn-primary btn-outline-primary" >
								Cancelar
							</button>
							
						</div>
			
					</form>
			                                                        
				</div>
				
			</div>
		
		</div>
	
	</div>

</div>