<html>
<body>


<form action='out.jsp'>
    <table border='0'>
        <tr>
            <td>Login</td>
            <td><input type='text' name='login'/></td>
        </tr>

        <tr>
            <td>Name</td>
            <td><input type='text' name='name'/></td>
        </tr>


        <tr>
            <td>Password</td>
            <td><input type='password' name='pass1'/></td>
        </tr>


        <tr>
            <td>Retype password</td>
            <td><input type='password' name='pass2'/></td>
        </tr>

        <tr>
            <td>Male</td>
            <td><input type='radio' value='man' name='gender'/></td>
        </tr>

        <tr>
            <td>Female</td>
            <td><input type='radio' value='female' name='gender'/></td>
        </tr>

        <tr>
            <td>Address</td>
            <td>
                <select name='address'>
                    <option value='1'>DNR</option>
                    <option value='2'>Luga</option>
                    <option value='3'>Crimea</option>
                </select>

            </td>
        </tr>


        <tr>
            <td>Comment</td>
            <td><textarea cols='20' rows='10' name='comment'></textarea></td>
        </tr>


        <tr>
            <td>Agreement</td>
            <td><input type='checkbox' name='agree'/></td>
        </tr>


        <tr>
            <td></td>
            <td><input type='submit' class='sumbit' name='calc' value='Register'/></td>
        </tr>

    </table>
</form>


</body>
</html>
