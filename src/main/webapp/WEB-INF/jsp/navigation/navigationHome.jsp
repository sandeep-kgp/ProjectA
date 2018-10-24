<%@ include file="../include/taglib.jsp"%>

<div id="sidebar" class="gutter">
			<div class="gutter">
				<!-- <div class="box">
      				<h3>What do we do?</h3>
      				<p>North Carolina Child Support Services are available to parents and /or nonparent caretakers of minor children. Services provided by North Carolina Child Support Services include: location, etsablishment of paternity, establishmnet or modifying of child support ordersm enforcement of child support orders, collection and processing of child support ordered payments</p>
      			</div>  -->
				<div class="box">
					<h3>Print Application Form</h3>
					<ul>
						<li><a target="_blank" href="https://files.nc.gov/ncdhhs/DSS-4451-English.pdf">English</a></li>
						<br>
						<li><a target="_blank" href="https://files.nc.gov/ncdhhs/DSS-4451-Spanish-10-5-2018.pdf">Spanish</a></li>
					</ul>
				</div>
				<div class="box">
					<h3>Services</h3>
					<ul>
						<li><a href="${pageContext.request.contextPath}/caseApplicationInfo/1.htm">Apply Online for Child Support Services</a></li>
						<br>
						<li><a target="_blank" href="https://www2.ncdhhs.gov/dss/cse/index.htm">More NC Child Support Enforcement Info. Services</a></li>
						<br>
						<li><a target="_blank" href="https://www.acf.hhs.gov/css/resource/state-and-tribal-child-support-agency-contacts">Child Support In Other States</a></li>
						<br>
						<li><a href="${pageContext.request.contextPath}/anonymousTipLine.htm">Anonymous Tip Line</a></li>
					</ul>
				</div>
				<div class="box">
					<h4>Help/Information</h4>
					<ul>					
					<sec:authorize var="loggedIn" access="isAuthenticated()" />
					<c:choose>
					 <c:when test="${loggedIn}">
						<li><a href="${pageContext.request.contextPath}/contactUs/1.htm">Contact Us</a></li>
						<br>
						<li><a target="_blank" href="${pageContext.request.contextPath}/progFeesAndPolicies/1.htm">Program Fees & Policies</a></li>
						<br>
						<li><a target="_blank" href="${pageContext.request.contextPath}/privacyPolicy/1.htm">Privacy and Security</a></li>
						<br>	
						<li><a target="_blank" href="${pageContext.request.contextPath}/caseFinancialHelp/1.htm">Case/Financial Help</a></li>
						<br>						
						<li><a target="_blank" href="${pageContext.request.contextPath}/reports/DebitCardFAQ.pdf">NCKidscard FAQ</a></li>
					</c:when>	
					<c:otherwise>
						<li><a href="${pageContext.request.contextPath}/contactUs/1.htm">Contact Us</a></li>
						<br>
						<li><a target="_blank" href="${pageContext.request.contextPath}/progFeesAndPolicies/1.htm">Program Fees & Policies</a></li>
						<br>
						<li><a target="_blank" href="${pageContext.request.contextPath}/privacyPolicy/1.htm">Privacy and Security</a></li>
						<br>							
						<li><a target="_blank" href="${pageContext.request.contextPath}/caseFinancialHelp/1.htm">Case/Financial Help</a></li>
						<br>
						<li><a target="_blank" href="${pageContext.request.contextPath}/loginHelp/1.htm">Login Help</a></li>
						<br>
						<li><a target="_blank" href= "https://it.nc.gov/services/service-directory/core-services/nc-identity-management-ncid/ncid/ncid-frequently-asked">NCID FAQ</a></li>
						<br>
						<li><a target="_blank" href="${pageContext.request.contextPath}/reports/DebitCardFAQ.pdf">NCKidscard FAQ</a></li>
					</c:otherwise>	
					</c:choose>											 					
					</ul>
				</div>
			</div>
		</div>
		

