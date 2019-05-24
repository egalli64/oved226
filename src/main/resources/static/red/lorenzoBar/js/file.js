$(function(){
	$('#add1').click(function(){
		let tmp=document.getElementById("fbk");
		tmp.value+='ciao';
	});
	$('#add').click(function(){
		let tmp=document.getElementById("fbk");
		let stringa=testo.value;
		tmp.value+=stringa;
	});
	$('#grosso').click(function(){
		let tmp=document.getElementById("testo2");
		let cur = parseInt($('#testo2').css('font-size'));
		$('#testo2').css('font-size', cur * 2);
	});
	$('#piccolo').click(function(event){
		let cur = parseInt($('#testo2').css('font-size'));
		if(cur>1){
		$('#testo2').css('font-size', cur / 2);
		}else{
			alert('impossibile ridurre la dimensione del carattere')
			event.preventDefault();
		}
	});
	$('html').dblclick(function(e){
		let tmp=document.getElementById("fbk");
		tmp.value+='\nDouble-click detected at ' + e.pageX + ', ' + e.pageY + '\n';
	});
});