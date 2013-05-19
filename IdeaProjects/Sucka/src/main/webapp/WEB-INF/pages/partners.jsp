<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div>
    <h2>Create a new partner record</h2>

    <sf:form method="POST" modelAttribute="partners">
        <fieldset>
            <table cellspacing="0">
                <tr>
                    <th><label for="onepass_id">Onepass ID:</label></th>
                    <td><sf:input path="onepassId" size="7" id="onepass_id"/>
                        <small id="onepass_msg">Onepass ID must have the format X######.</small>
                    </td>
                </tr>
                <tr>
                    <th><label for="first_name">First Name:</label></th>
                    <td><sf:input path="firstName" size="20" id="first_name"/></td>
                </tr>
                <tr>
                    <th><label for="last_name">Last Name:</label></th>
                    <td><sf:input path="lastName" size="20" id="last_name"/></td>
                </tr>
                <tr>
                    <th><label for="sadc_tm">SADC Team:</label></th>
                    <td><sf:input path="sadcTeamId" size="20" id="sadc_tm"/></td>
                </tr>
                <tr>
                    <th><label for="college">College:</label></th>
                    <td><sf:input path="collegeId" size="2" id="college"/></td>
                </tr>
                <tr>
                    <th><label for="team_rank">Team Rank:</label></th>
                    <td><sf:input path="teamRank" size="2" id="team_rank"/></td>
                </tr>
                <tr>
                    <th><label for="sadc_rank">SADC Rank:</label></th>
                    <td><sf:input path="sadcRank" size="2" id="sadc_rank"/></td>
                </tr>
                <tr>
                    <th><label for="title">Job Title:</label></th>
                    <td><sf:input path="titleId" size="20" id="title"/></td>
                </tr>
                <!--
                <tr>
                    <th><label for="start_dt">Start Date:</label></th>
                    <td><sf:input path="startDt" size="20" id="start_dt"/></td>
                </tr>
                -->
                <tr>
                    <th><label for="source_id">Source:</label></th>
                    <td><sf:input path="sourceId" size="2" id="source_id"/></td>
                </tr>
                <tr>
                    <th><label for="major_id">Major:</label></th>
                    <td><sf:input path="majorId" size="2" id="major_id"/></td>
                </tr>
                <tr>
                    <th><label for="ps_id">Peoplesoft ID:</label></th>
                    <td><sf:input path="psId" size="7" id="ps_id"/></td>
                </tr>
                <tr>
                    <th></th>
                    <td><input name="commit" type="submit" value="Create A Partner"/></td>
                </tr>
            </table>

        </fieldset>
    </sf:form>

</div>