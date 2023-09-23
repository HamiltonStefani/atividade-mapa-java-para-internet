/**
 * Confirmacao de exclusao de um contato
 * @author Hamilton Stefani
 * @param idcon
 */

 function confirmar (idcon){
	 let resposta = confirm("Confirma a exclusão deste profissional ?")
	 if (resposta === true){
		//alert(idcon)
		window.location.href = "delete?idcon=" + idcon
	 }
 }