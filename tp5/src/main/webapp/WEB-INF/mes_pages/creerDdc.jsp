<%@page contentType="text/html"%>
<%@include file="/WEB-INF/mes_pages/include.jsp" %>

<html>
	<body>
		<h2>Cr�er une demande de cong�s</h2>
		
		<a href="http://localhost:8080/ddc/home">Retour</a>

		<br/><br/>
		Nous sommes le ${now}.
		<br/><br/>
		
		
		<br/><br/>
		
		<form:form modelAttribute="demandeConge">
			Type de cong� : <form:select path="type" items="${typeDdc}"/> <br/>
			
			<br/>
			
			<table>
				<tr>
					<td width="200">
						<b>P�riode :</b>
					</td>
					<td width="200">
						Date d�but : 
					</td>
					<td width="200">
						Nombre de jours : 
					</td>
				</tr>
			</table>
			<br/> 
			<table>
				<tr>
					<td width="200">
						<b>Collaborateur :</b>
					</td>
					<td width="200">
						Pr�nom : 
					</td>
					<td width="200">
						Nom : 
					</td>
				</tr>
			</table>
			
			<br/>
						
			<input type="submit" value="Valider" />
			
		</form:form>

	</body>
</html>
