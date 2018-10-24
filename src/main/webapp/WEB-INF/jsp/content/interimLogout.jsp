<%@ include file="../include/taglib.jsp"%>

<script>
	function goToLogOutPage()
	{
		location.href="logout.htm?";		
	}
	function confirmLogout()
	{		
		if(confirm(" Click OK to log out !!. \n \n Please use your NCID username and password to log back in."))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	function confirmLogout2()
	{		
		if(confirm("Click OK to log out !!. \n \nPlease register for an NCID on the next page then log back in with your NCID username and password."))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
</script>
<form name="InterimLogoutForm" id="interimLogout" method="post" "JavaScript: action="${pageContext.request.contextPath}/interimLogout.htm";}">
	<div id="content">			
			<div class="gutter">			
				<div class = "center">
					<h1>Attention Parents/Guardians !!</h1>				
				<br>
				<br>
					<p> To apply online for child support services, you must have an NCID username and password. </p>
					<br>
					<br>
					<p>You are currently logged in using your existing username and password temporarily to get details about your North Carolina Child Support Services case(s).</p> 
	           	    <br>
		            <br>       	
		           	<!-- Produ <p>Not registered your account in NCID yet? <strong><a target="_blank" href=https://ncid.nc.gov /> Register here </a></strong></p> -->		           	
		          	<p> Please <a href="${pageContext.request.contextPath}/logout.htm" onClick="return confirmLogout2(this);"><b>Logout</b></a> and register for an NCID and use that username and password to login on the home page. </p>     
	           	  	<br>
	           	  	<br>
	           	  	<p> <font color="red"> <b>YOUR OLD USERNAME AND PASSWORD WILL EXPIRE AFTER 10 GRACE LOGINS.</b></font></p>     
					
				</div>			
				
				<br><br>
				<dl class="feature">
					<p>If you have already registered for an NCID, please click here: <input type=submit value='Login with NCID' onclick="return confirmLogout(this)"/></p>
				</dl>
				<p align="center" style="color:red"> Contact customer service at 1-800-992-9457 if you have any issues with the website. </p>
			</div>		
		</div>
	</div>
</form>