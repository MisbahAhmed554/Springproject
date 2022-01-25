<!DOCTYPE html>
<html>
<style>
table,th,td{
border:1px solid black;
}
</style>

    <head>
        <title>Cities</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>List of Requests</h2>

        <table>
            <tr>
                <th>Id</th>
                <th>Resource Unit</th>
                <th>Resource Desc</th>
                <th>Resource Platform</th>
            </tr>

            <#list cities as city>
                <tr>
                    <td>${city.id}</td>
                    <td>${city.resource_unit}</td>
                    <td>${city.resource_desc}</td>
                     <td>${city.resource_platform}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>