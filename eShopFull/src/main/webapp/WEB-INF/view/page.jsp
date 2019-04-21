<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="inc/header.jsp" %>

	<!-- start -->
	<ul id="gallery">
		<li><a href="static/images/1-1.jpg"><img src="static/images/1-1.jpg" width="200" title="Phasellus nec erat sit amet nibh pellentesque congue." alt="" /></a></li>
		<li><a href="static/images/1-2.jpg"><img src="static/images/1-2.jpg" width="200" title="Phasellus nec erat sit amet nibh pellentesque congue." alt="" /></a></li>
		<li><a href="static/images/1-3.jpg"><img src="static/images/1-3.jpg" width="200" title="Phasellus nec erat sit amet nibh pellentesque congue." alt="" /></a></li>
		<li><a href="static/images/2-1.jpg"><img src="static/images/2-1.jpg" width="200" title="Phasellus nec erat sit amet nibh pellentesque congue." alt="" /></a></li>
		<li><a href="static/images/3-3.jpg"><img src="static/images/3-3.jpg" width="200" alt="" title="Phasellus nec erat sit amet nibh pellentesque congue."/></a></li>
		<li><a href="static/images/2-2.jpg"><img src="static/images/2-2.jpg" width="200" alt="" title="Phasellus nec erat sit amet nibh pellentesque congue."/></a></li>
		<li><a href="static/images/2-3.jpg"><img src="static/images/2-3.jpg" width="200" alt="" title="Phasellus nec erat sit amet nibh pellentesque congue."/></a></li>
	</ul>
	<br class="clear"/>

	<!-- end -->

<table>
    <tr>
        <td width=167 align=center>
            <a href="./ProductServlet?category=1">КАТЕГОРИЯ 1</a>
        </td>
        <td width=177 align=center>
            <a href="./ProductServlet?category=2">КАТЕГОРИЯ 2</a>
        </td>
        <td width=160 align=center>
            <a href="./ProductServlet?category=3">КАТЕГОРИЯ 3</a>
        </td>
    </tr>
</table>
<%@include file="inc/footer.jsp" %>

</p>
