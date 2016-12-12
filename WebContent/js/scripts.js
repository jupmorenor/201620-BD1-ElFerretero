function addField(n) {
    var tr = document.getElementById('fila1').cloneNode(true);
    document.getElementById('detalleOrden').appendChild(tr);
}

function countRow(n) {
	n.value = document.getElementById('detalleOrden').rows.length;
}