<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dictionary Lookup</title>
</head>
<body>

<h2>Dictionary Lookup</h2>

<form action="/lookup" method="post">
    <label for="word">Enter a word:</label>
    <input type="text" id="word" name="word" required>
    <button type="submit">Lookup</button>
</form>

</body>
</html>
