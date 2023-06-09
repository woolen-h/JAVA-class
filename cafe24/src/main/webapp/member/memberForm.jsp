<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../header.jsp" %>
    <style>
    .row{
    display: flex;
    flex-direction: column;
    align-items: center;
    }
    form td{
    color: black;
    }
    .id{
    color: black;
    }
    </style>
        <!-- 본문 시작 template.jsp -->
          <h3>회    원    가    입</h3>
          <span>* 필수입력</span>
          <br>
          <div>
          <form name="memfrm" id="memfrm" method="post" action="memberProc.jsp" onsubmit="return memberCheck()">
          <table>
          <tr>
          <th>* 아이디</th>
          <td>
          	<input type="text" name="id" id="id" class="id" size="10" maxlength="10" readonly placeholder="아이디">
          	<input type="button" value="ID중복확인" onclick="idCheck()">
          </td>
          </tr>
          <tr>
          <th>* 비밀번호</th>
          <td>
          	<input type="text" name="passwd" id="passwd" size="22" maxlength="10" required="required" placeholder="비밀번호를 입력해주세요.">
          </td>
          </tr>
          <tr>
          <th>* 비밀번호 확인</th>
          <td>
          	<input type="text" name="repasswd" id="repasswd" size="22" maxlength="10" required="required" placeholder="비밀번호를 입력해주세요.">
          </td>
          </tr>
          <tr>
          <th>* 이름</th>
          <td>
          	<input type="text" name="mname" id="mname" size="22" maxlength="20" required="required" placeholder="이름을 입력해주세요.">
          </td>
          </tr>
          <tr>
          <th>* 이메일</th>
          <td>
          	<input type="text" name="email" id="email" class="email" size="20" maxlength="50" placeholder="이메일을 입력해주세요.">
          	<button onclick="emailCheck()">이메일 중복 확인</button>
          </td>
          </tr>
          <tr>
          <th>전화번호</th>
          <td>
          	<input type="text" name="tel" id="tel" size="22" maxlength="14" placeholder="전화번호를 입력해주세요.">
          </td>
          </tr>
          <tr>
          <th>우편번호</th>
          <td>
          	<input type="text" name="zipcode" id="zipcode" size="22" readonly>
          	<input type="button" id="zipbtn" value="주소찾기" onclick="DaumPostcode()">
          </td>
          </tr>          
          <tr>
          <th>주소</th>
          <td>
          	<input type="text" name="address1" id="address1" size="45" readonly>
          </td>
          </tr>
          <tr>
          <th>나머지 주소</th>
          <td>
          	<input type="text" name="address2" id="address2" size="45">
          </td>
          </tr>
          <tr>  
		  <th>직업</th>
		  <td style="text-align: left">
		        <select name="job"  id="job">
		          <option value="0" selected>선택하세요.</option>
		          <option value="A01">회사원</option>
		          <option value="A02">IT관련직</option>
		          <option value="A03">학생</option>
		          <option value="A04">주부</option>
		          <option value="A05">기타</option>
		        </select>
		  </td>
		</tr>
		<tr>
          <td colspan="2">
          	<input type="submit" value="회원가입" class="btn btn-primary"/>
          	<input type="reset" value="취소" class="btn btn-primary"/>
          </td>
          </tr>
          </table>
          </form>
          <!-- 다음 우편 번호 API -->
          <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
			<script>
		
				
			function DaumPostcode() {
		        new daum.Postcode({
		            oncomplete: function(data) {
		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

		                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
		                var roadAddr = data.roadAddress; // 도로명 주소 변수
		                var extraRoadAddr = ''; // 참고 항목 변수

		                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
		                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
		                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
		                    extraRoadAddr += data.bname;
		                }
		                // 건물명이 있고, 공동주택일 경우 추가한다.
		                if(data.buildingName !== '' && data.apartment === 'Y'){
		                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                }
		                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
		                if(extraRoadAddr !== ''){
		                    extraRoadAddr = ' (' + extraRoadAddr + ')';
		                }

		                // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                document.getElementById('zipcode').value = data.zonecode;
		                document.getElementById("address1").value = roadAddr;
		                document.getElementById("address1").value = data.jibunAddress;
		                
		                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
		                if(roadAddr !== ''){
		                    document.getElementById("address2").value = extraRoadAddr;
		                } else {
		                    document.getElementById("address2").value = '';
		                }

		                var guideTextBox = document.getElementById("guide");
		                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
		                if(data.autoRoadAddress) {
		                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
		                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
		                    guideTextBox.style.display = 'block';

		                } else if(data.autoJibunAddress) {
		                    var expJibunAddr = data.autoJibunAddress;
		                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
		                    guideTextBox.style.display = 'block';
		                } else {
		                    guideTextBox.innerHTML = '';
		                    guideTextBox.style.display = 'none';
		                }
		            }
		        }).open();
		    }
			</script>
          <!-- 다음 우편 번호 API -->
          
          
          
          
          </div>
        <!-- 본문 끝 -->
    <%@ include file="../footer.jsp" %>