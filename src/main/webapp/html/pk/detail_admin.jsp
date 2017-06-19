<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<head>
	<meta charset="UTF-8">
		<meta name="Generator" content="EditPlus®">
		<meta name="Author" content="">
		<meta name="Keywords" content="">
		<meta name="Description" content="">
		<title>Document</title>
		<link href="/css/ssc/layout.css" type="text/css" rel="stylesheet"  />

		<script language="javascript"> 
		<!-- 
		function OpenWindow(url,intWidth,intHeight) { 
			  window.open(url, "_blank", "width="+intWidth+",height="+intHeight+",resizable=1,scrollbars=1") ; 
		} 
		//--> 
		</script> 
	</head>
	<body>
		<div id="pychang">
			<div id="header" class="header">
				<div class="top">
					<div class="topMeun">
						<div class="user">		
							<div class="userL">
								<a href="#">홍길동(gildonghong) </a>
								<a href="#"> 로그아웃</a>
							</div>				
						</div>
					</div>
				</div>
				<div class="top_visual">
				</div>
			</div>

			<div id="wrap">
				<p class="dwon_tit">올림픽 영상 다운로드 </p>
				
				<div class="boardView">
					<table cellpadding="0" cellspacing="0" class="tbL" summary="올림픽 영상 다운로드 게시판">
						<caption>올림픽 영상 다운로드 게시판 상세보기</caption>
						<colgroup>
							<col width="16.6%" />
							<col width="33.3%" />
							<col width="16.6%" />
							<col width="33.3%" />
						</colgroup>
						<tbody>
							<tr>
								<th scope="row">작성자 </th>
								<td>홍길동</td>
								<th scope="row">등록일</th>
								<td>2017-05-24</td>
							</tr>
							<tr>
								<th scope="row">제목</th>
								<td colspan="3"><input type="text" class="it " id="searchText" value="" name="searchText" title=""></td>
							</tr>
							<tr>
								<th scope="row">동영상 첨부파일</th>
								<td colspan="3" class="admin_de">
									<input type="text" class="it " id="searchText" value="" name="searchText" title=""> <a href="javascript:OpenWindow('enrichementList.html','485','260')" class="btn">영상등록</a> 
				
									<ul>
										<li>* 저장된 동영상 파일을 선택해 주세요.</li>
										<li>* 최대 1G byte까지 업로드 하실 수 있습니다.</li>
										<li>* 등록 가능한 동영상 파일: avi, asf, wmv, mp4, mpeg, mpg, mov, flv</li>
									</ul>
								</td>
							</tr>
							<tr>
								<th scope="row">동영상 내용<br/>(소개글)</th>
								<td colspan="3">
									<textarea rows="4" cols="50">
									</textarea>
								</td>
							</tr>
						</tbody>
					</table>
				</div>				
				
				
				<div class="btn_area mt20">
					<a href="" class="list" title="취소">츼소</a>
					<a href="" class="list" title="등록">등록</a>
					<a href="" class="list" title="수정">수정</a>
					<a href="" class="list" title="삭제">삭제</a>
					<a href="list_admin.html" class="list01" title="목록">목록</a>
				</div>
			</div>
			


			<!-- div class="footer">
			</div -->
		</div>
	</body>
</html>
