<%@ taglib prefix="spform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<title>Trading Strategy</title>
<html>
<body>
<h2>Trading Strategies</h2>
Select your strategy
<spform:form id="strategyForm" commandName="command" method="post">
    <spform:select path="action">
        <spform:option value="PUTBASEDFX">Put Based Fx</spform:option>
        <spform:option value="CALLBASEDFX">Call Based Fx</spform:option>
        <spform:option value="SWAPBASEDFX">Swaption Based Fx</spform:option>
    </spform:select>
    <spform:button id="chooseStrategySubmit" value="Submit">Submit</spform:button>
</spform:form>
</body>
</html>
