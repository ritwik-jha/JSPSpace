<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Space Consumption</title>
</head>
<body>
    <h1>Space Consumption Matrix</h1>
    <table>
    <tr>
        <th>Server hostname</th>
        <th>Space consumed</th>
        <th>Total Space</th>
    </tr>
    <tr>
        <td>ofss-mum-5366.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
        <td>${space_consumed_5366}</td>
        <td>${total_space_5366}</td>
    </tr>
    <tr>
            <td>fsgbu-mum-259.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
            <td>${space_consumed_259}</td>
            <td>${total_space_259}</td>
    </tr>
    <tr>
            <td>ofss-mum-363.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
            <td>${space_consumed_363}</td>
            <td>${total_space_363}</td>
    </tr>
    <tr>
            <td>ofss-mum-364.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
            <td>${space_consumed_364}</td>
            <td>${total_space_364}</td>
    </tr>
    <tr>
            <td>ofss-mum-365.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
            <td>${space_consumed_365}</td>
            <td>${total_space_365}</td>
    </tr>
    <tr>
           <td>fsgbu-mum-814.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
           <td>${space_consumed_814}</td>
           <td>${total_space_814}</td>
    </tr>
    <tr>
           <td>fsgbu-mum-813.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
           <td>${space_consumed_813}</td>
           <td>${total_space_813}</td>
    </tr>
    <tr>
           <td>ofss-mum-5056.snbomprshared2.gbucdsint02bom.oraclevcn.com</td>
           <td>${space_consumed_5056}</td>
           <td>${total_space_5056}</td>
    </tr>
    <tr>
           <td>ofss-mum-5037.snbomprshared1.gbucdsint02bom.oraclevcn.com</td>
           <td>${space_consumed_5037}</td>
           <td>${total_space_5037}</td>
    </tr>
    <tr>
           <td>ofss-mum-5119.snbomprshared2.gbucdsint02bom.oraclevcn.com</td>
           <td>${space_consumed_5119}</td>
           <td>${total_space_5119}</td>
    </tr>

</body>
</html>