/**
 * 아이디중복확인
 */
 
 $(document).ready(function(){
	$('#idCheck').on('click', function(){
		event.preventDefault();
		
		$.ajax({
			type:"post",
			url:"memIdCheck",
			data:{"memId": $('#memId').val()},  /* 컨트롤러에서 받을 때 : prdNo로 받음*/
			dataType:'text',
			success:function(result){
				if(result == "no_use"){
					alert("사용할 수 없는 아이디입니다.");
				}else{
				    alert("사용 가능한 아이디입니다.");
			 }
			},
			error:function(data, textStatus){
				alert("전송 실패");
			}
		});
	});
});