<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<nav class="pcoded-navbar">

	<div class="sidebar_toggle">
		<a href="#"> <i class="icon-close icons"></i> </a>
	</div>
	
	<div class="pcoded-inner-navbar main-menu">
	
		<div class="p-15 p-b-0">		
			<form class="form-material">
				<div class="form-group form-primary">
					<input type="text" name="footer-email" class="form-control" required="">
					<span class="form-bar"></span>
					<label class="float-label"><i class="fa fa-search m-r-10"></i>Pesquisar</label>
				</div>
			</form>		
		</div>
		
		<div class="pcoded-navigation-label" data-i18n="nav.category.navigation">Layout</div>
		
		<ul class="pcoded-item pcoded-left-item">
		
			<li class="active">
				<a href="<%= request.getContextPath() %>/principal/principal.jsp" class="waves-effect waves-dark">
					<span class="pcoded-micon"><i class="ti-home"></i><b>D</b></span>
					<span class="pcoded-mtext" data-i18n="nav.dash.main">HOME</span>
					<span class="pcoded-mcaret"></span>
				</a>
			</li>
			
		</ul>
		
		<div class="pcoded-navigation-label" data-i18n="nav.category.forms">Cadastros</div>
		
		<ul class="pcoded-item pcoded-left-item">
		
			<li>
				<a href="<%= request.getContextPath() %>/principal/usuario.jsp"
					class="waves-effect waves-dark">
					<span class="pcoded-micon"><i class="ti-layers"></i><b>FC</b></span>
					<span class="pcoded-mtext" data-i18n="nav.form-components.main">Usuários</span>
					<span class="pcoded-mcaret"></span>
				</a>
			</li>
					
		</ul>
		
		<div class="pcoded-navigation-label" data-i18n="nav.category.forms">Chart &amp; Maps</div>
		
		<ul class="pcoded-item pcoded-left-item">
		
			<li>
				<a href="chart.html" class="waves-effect waves-dark">
					<span class="pcoded-micon"><i class="ti-layers"></i><b>FC</b></span>
					<span class="pcoded-mtext" data-i18n="nav.form-components.main">Chart</span>
					<span class="pcoded-mcaret"></span>
				</a>
			</li>
			
			<li>
				<a href="map-google.html" class="waves-effect waves-dark">
					<span class="pcoded-micon"><i class="ti-layers"></i><b>FC</b></span>
					<span class="pcoded-mtext" data-i18n="nav.form-components.main">Maps</span>
					<span class="pcoded-mcaret"></span>
				</a>
			</li>
			
			<li class="pcoded-hasmenu">
			
				<a href="javascript:void(0)" class="waves-effect waves-dark">
					<span class="pcoded-micon"><i class="ti-layout-grid2-alt"></i></span>
					<span class="pcoded-mtext" data-i18n="nav.basic-components.main">Pages</span>
					<span class="pcoded-mcaret"></span>
				</a>
				
				<ul class="pcoded-submenu">
				
					<li class=" ">
						<a href="auth-normal-sign-in.html" class="waves-effect waves-dark">
							<span class="pcoded-micon"><i class="ti-angle-right"></i></span>
							<span class="pcoded-mtext" data-i18n="nav.basic-components.alert">Login</span>
							<span class="pcoded-mcaret"></span>
						</a>
					</li>
					
					<li class=" ">
						<a href="auth-sign-up.html" class="waves-effect waves-dark">
							<span class="pcoded-micon"><i class="ti-angle-right"></i></span>
							<span class="pcoded-mtext" data-i18n="nav.basic-components.breadcrumbs">Register</span>
							<span class="pcoded-mcaret"></span>
						</a>
					</li>
					
					<li class=" ">
						<a href="sample-page.html" class="waves-effect waves-dark">
							<span class="pcoded-micon"><i class="ti-angle-right"></i></span>
							<span class="pcoded-mtext" data-i18n="nav.basic-components.breadcrumbs">Sample Page</span>
							<span class="pcoded-mcaret"></span>
						</a>
					
					</li>
				
				</ul>
				
			</li>
			
		</ul>
		
		<div class="pcoded-navigation-label" data-i18n="nav.category.other">Other</div>
			
		<ul class="pcoded-item pcoded-left-item">
		
			<li class="pcoded-hasmenu ">
			
				<a href="javascript:void(0)" class="waves-effect waves-dark">
					<span class="pcoded-micon"><i class="ti-direction-alt"></i><b>M</b></span>
					<span class="pcoded-mtext" data-i18n="nav.menu-levels.main">Menu Levels</span>
					<span class="pcoded-mcaret"></span>
				</a>
				
				<ul class="pcoded-submenu">
					
					<li class="">
						<a href="javascript:void(0)" class="waves-effect waves-dark">
							<span class="pcoded-micon"><i class="ti-angle-right"></i></span>
							<span class="pcoded-mtext" data-i18n="nav.menu-levels.menu-level-21">Menu Level 2.1</span>
							<span class="pcoded-mcaret"></span>
						</a>
					</li>
					
					<li class="pcoded-hasmenu ">
					
						<a href="javascript:void(0)" class="waves-effect waves-dark">
							<span class="pcoded-micon"><i class="ti-direction-alt"></i></span>
							<span class="pcoded-mtext"
								data-i18n="nav.menu-levels.menu-level-22.main">Menu Level 2.2</span>
							<span class="pcoded-mcaret"></span>
						</a>
						
						<ul class="pcoded-submenu">					
							<li class="">
								<a href="javascript:void(0)" class="waves-effect waves-dark">
									<span class="pcoded-micon"><i class="ti-angle-right"></i></span>
									<span class="pcoded-mtext"
										data-i18n="nav.menu-levels.menu-level-22.menu-level-31">Menu Level 3.1</span>
									<span class="pcoded-mcaret"></span>
								</a>
							</li>					
						</ul>
					
					</li>
					
					<li class="">
						<a href="javascript:void(0)" class="waves-effect waves-dark">
							<span class="pcoded-micon"><i class="ti-angle-right"></i></span>
							<span class="pcoded-mtext" data-i18n="nav.menu-levels.menu-level-23">Menu Level 2.3</span>
							<span class="pcoded-mcaret"></span>
						</a>
					</li>
					
				</ul>
				
			</li>
			
		</ul>
		
	</div>

</nav>