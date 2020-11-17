var buscador = $("#table").DataTable();

$(document).ready(function() {
	
	$("#input-search").keyup(function() {
		buscador.search($(this).val()).draw();

		if ($("input-search").val() == "") {
			$(".content-search").fadeout();
		} else {
			$(".content-search").fadeIn();
		}
	}).focus(function() {
		$("#table").show();
	}).blur(function() {
		$("#table").hide();
	});
	getUsuarios();
});

function getUsuarios() {
	var data = {

		url: "getUsuarios",
		type: "post",

		success: function(response) {
			var datos = JSON.parse(response);
			var txt ="";
			
			for (var i in datos.usuarios) {
				var usuario = datos.usuarios[i];
				txt =txt+ "<tr> <td><a href='AboutUs.html'>" + usuario.nombre + "</a></td></tr>";
			}
			buscador.row.add([txt]);
		},
		error: function(response) {
			alert(response.message);
		}
	};
	$.ajax(data);
}

function Delete() {
	var data;
	var msg = {
		type: "eliminar Usuario",
		id: document.getElementById("userName").value
	};
	data = {
		data: JSON.stringify(msg),
		url: "eliminarUsuario",
		type: "post",
		contentType: 'application/json',
		dataType: 'json'
	}
	$.ajax(data);
};