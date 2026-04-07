document.getElementById("btnConfirma").addEventListener('click', function(){
  

    let email = document.getElementById("email").value
    let password = document.getElementById("password").value

    alert('Login Realizado: '+email+" "+password)
    console.log(email,password)

})