<h1>ServerApp Java</h1>

<h2>Server simulator app built with Java with MySQL as Database</h2>

<p>The main go is to establish an application that can do full CRUD with authentication and log, however, this application does not have a graphic interface, authentication and log is not established.</p>

<p><strong>How to run it:</strong></p>

<p>Download the project, setup your server (I am using Wildfly), install all required packages and MySQL connector and Hibernate.</p>

<p><strong>How this project is structured:</strong></p>

<p><strong>src:</strong> is the main folder and contains all the CRUD.</p>
<ul>
	<li><strong>br</strong></li>
	<ul>
		<li><strong>com</strong></li>
		<ul>
			<li><strong>lenovo</strong></li>
			<ul>
				<li><strong>dao</strong></li>
				<ul>
					<li><strong>ManutencaoDao.java:</strong> responsible for full CRUD and persist this class associated with Server.</li>
					<li><strong>ServerDao.java:</strong> responsible for full CRUD and persist this class associated with Manutencao.</li>
				</ul>
			</ul>
			<ul>
				<li><strong>modelo</strong></li>
				<ul>
					<li><strong>Manutencao.java:</strong> responsible for define the Manutencao attibutes and prepare getters and setters.</li>
					<li><strong>Server.java:</strong> responsible for define the Server attibutes and prepare getters and setters.</li>
				</ul>
			</ul>
			<ul>
				<li><strong>teste:</strong> this folder contains seven(7) different tests that put the DAOs and main Java classes to work and save associated information to MySQL database.</li>
				<ul>
					<li><strong>TestaAlteraServer.java</strong></li>
					<li><strong>TestaBuscaServerDaManutencao.java</strong></li>
					<li><strong>TestaInsereManutencao.java</strong></li>
					<li><strong>TestaInsereServer.java</strong></li>
					<li><strong>TestaListagemServer.java</strong></li>
					<li><strong>TestaPesquisaIdServer.java</strong></li>
					<li><strong>TestaRemoveServer.java</strong></li>
				</ul>
			</ul>
			<ul>
				<li><strong>util:</strong> JPAUtil.java is the file that take care (alongside Hibernate) with our database connection.</li>
			</ul>
		</ul>
	</ul>
</ul>