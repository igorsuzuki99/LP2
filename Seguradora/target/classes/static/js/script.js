const formulario = document.querySelector("form");
const Ideducaoauto = document.querySelector(".deducaoauto");
const Inumlicenca = document.querySelector(".numlicenca");
const Iestado = document.querySelector(".estado");
const Imodelo = document.querySelector(".modelo");
const Iano = document.querySelector(".ano");

function cadastrar(){
    fetch("http://localhost:8080/cadastrarAuto",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            deducaoauto: Ideducaoauto.value,
            numlicenca: Inumlicenca.value,
            estado: Iestado.value,
            modelo: Imodelo.value,
            ano: Iano.value,
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
};

function limpar(){
    Ideducaoauto.value = "";
    Inumlicenca.value = "";
    Iestado.value = "";
    Imodelo.value = "";
    Iano.value = "";
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    limpar();
});