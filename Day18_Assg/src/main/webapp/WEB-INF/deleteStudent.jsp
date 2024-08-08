<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Student</title>
    <script>
        function deleteStudent() {
            const studentId = document.getElementById("studentId").value;

            
            if (!studentId.trim()) {
                alert("Please enter a Student ID");
                return;
            }

            fetch('deleteStudent?id=' + encodeURIComponent(studentId), {
                method: 'POST'
            })
            .then(response => {
                if (response.ok) {
                    return response.text();
                } else {
                    
                    return response.text().then(text => {
                        throw new Error(text);
                    });
                }
            })
            .then(message => {
                alert(message);  
            })
            .catch(error => {
                alert(error.message); 
                console.error('Error:', error);
            });
        }
    </script>
</head>
<body>
    <input type="text" id="studentId" placeholder="Enter Student ID" />
    <button onclick="deleteStudent()">Delete Student</button>
</body>
</html>
