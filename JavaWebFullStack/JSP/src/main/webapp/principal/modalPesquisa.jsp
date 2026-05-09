<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!-- Modal Pesquisa de Usuarios -->"
<div class="modal fade" id="modalPesUser" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">

	<div class="modal-dialog" role="document">
	
		<div class="modal-content">
		
			<div class="modal-header">
				<h5 class="modal-title" id="modalBtnPesquisar">Pesquisar</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				<span aria-hidden="true">&times;</span>
				</button>
			</div>
			
			<div class="modal-body">
			
				<div class="input-group mb-3">
				  <input type="text" class="form-control" placeholder="Pesquisar nome" id="buscaNome"
				  	aria-label="Recipient's username" aria-describedby="basic-addon2">
				  <div class="input-group-append">
				    <button type="button" onclick="buscarUsuario();"
				    	class="btn waves-effect waves-light btn-primary btn-outline-primary">
				    	Pesquisar
				    </button>
				  </div>
				</div>
			
			</div>
			
			<!-- Hover table card start -->
            <div class="card">
                <div class="card-header">
                    <h5 id="qtdUsuarios"></h5> 
                </div>
                <div class="card-block table-border-style" style="height: 300px; overflow: scroll;">
                    <div class="table-responsive">
                        <table class="table table-hover" id="tbUsuarios">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Login</th>
                                    <th>Name</th>
                                    <th>email</th>
                                </tr>
                            </thead>
                            <tbody></tbody>
                        </table>
                    </div>
                </div>
            </div>
			
			<div class="modal-footer">
				<button type="button" data-dismiss="modal"
					class="btn waves-effect waves-light btn-primary btn-outline-primary" >
					Sair
				</button>
			</div>
			
		</div>
		
	</div>
  
</div>