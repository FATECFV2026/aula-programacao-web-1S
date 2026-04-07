function testeExternal(){
    alert('Olá Mundo - Teste Extenal')
}

function testeConfirm(){
    let resp = confirm('Você aceita essa ação?')

    console.log(resp)
}

function testePrompt(){
    let resp = prompt('Qual é o seu nome?')

    console.log(resp)
}

function testeGetElement(){
    document.getElementById("meuID").innerText="Novo Texto"

    elements = document.getElementsByClassName("minhaClasse")

    console.log(elements)

    document.getElementById("msg").innerHTML="<strong> Novo texto </strong>"
}

function testeCreateElement(){
    let novo= document.createElement("p")
    novo.innerText="Novo paragrafo"

    let box = document.getElementById("box")

    box.appendChild(novo)
}

function testeRemoveElement(){
    let box = document.getElementById("box")

    box.remove()
}




